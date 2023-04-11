package Test;

import java.net.*;
import java.io.*;	// IO streams in KChathandler
import java.util.*;	// Vector

public class KChatServer {
	protected Vector vhandler; // 사용자등록 장부(vector)
	int id = 0;
	KChatServer(int port) throws IOException{
		//--서버소켓 생성(챗방 오픈)--
		ServerSocket server = new ServerSocket(port);
		vhandler = new Vector(2,5); // 방명록
		System.out.println("KChatRoom@" + port + "ready...");
		while(true){
			Socket csock = server.accept();
			//+ 손님 도착 -> KChatHandler 생성&응대 시작+
			KChatHandler c = new KChatHandler(this,csock);
			vhandler.addElement(c); // user 등록(handler as the user)
			System.out.println(++id + "번 손님 받아라(현재 " + vhandler.size() + "명)");
			c.start();
		}
	}
	public int numChatters(){ return vhandler.size(); } // 현재 몇명?
	public static void main(String[] args) throws IOException{
		if(args.length != 1)
			throw new RuntimeException("Syntax: KChatServer port");
		new KChatServer(Integer.parseInt(args[0]));
	}
}

class KChatHandler extends Thread{
	protected KChatServer server; //-for accessing vhandler
	protected Socket sock;
	protected DataInputStream is;
	protected DataOutputStream os;
	
	KChatHandler (KChatServer server, Socket sock) throws IOException{
		this.server = server;	this.sock = sock;
		// create I/O streams to send & receive message:
		is = new DataInputStream(
				new BufferedInputStream(sock.getInputStream()));
		os = new DataOutputStream(
				new BufferedOutputStream(sock.getOutputStream()));
	}
	public void run(){
		String name = "";
		//---try{ 사용자의 login/typein text를 받아 방송한다 } catch(-){}---
		try{
			// (1) receive login name
			name = is.readUTF(); // -from login-
			if(name.equals("")) name = "익명";
			// (2) 방송한다 - "누구 입장"
			broadcast(name + "님이 입장하였습니다.");
			// (3) 반복한다, 이후 담당 고객의 모든 언행을 방송한다.
			while(true) { broadcast(name + " : " + is.readUTF());}
		}catch(IOException e){
			System.out.println("...???...");
		} finally{
			//-사용자 연결이 끊긴 모양 - 뒷정리 한다-
			System.out.println(name + "퇴장.");
			server.vhandler.removeElement(this);
		}
	}
	protected void broadcast(String message){
		synchronized(server.vhandler){					// Vector 등록자
			Enumeration en = server.vhandler.elements(); // 순회 지원 객체
			while(en.hasMoreElements()){
				KChatHandler c = (KChatHandler)en.nextElement();
				// 각 고객담당 KChatHandler가 열어 놓은 소켓으로 msg 전달.
				try{
					c.os.writeUTF(message);
					c.os.flush();
				}catch(IOException e){}
			}
		}
	}
}