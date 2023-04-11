package Test;

import java.net.*;
import java.io.*;
import javax.swing.*;		// JApplet, JFrame, JPanel
import java.awt.*;			// Canvas, Graphics, Color
import java.awt.event.*;	// ActionEvent, MouseAdapter

public class KChatClient extends JApplet implements Runnable, ActionListener{
	// for GUI 멤버 변수들
	JTextField login, typein;	// 로그인ID입력 줄, 채팅입력 줄
	JTextArea ta;				// 전체 채팅표시 창
	//Cvas cvas;
	JPanel portal, chatroom ;	// two cards(창 두개)
	CardLayout cardm;			// layout manager(창 관리)
	// 서버 접속해 소켓 만들어 졌을 때 I/O스트림
	DataInputStream is;
	DataOutputStream os;
	// 이름
	String myname; //login name
	
	public void init(){
		setGUIcards(); // 카드 두개 만들기
		setLayout(cardm = new CardLayout()); // layout manager
		add(portal,"card-login");  // card-1
		add(chatroom,"card-chat"); // card-2
		cardm.show(this.getContentPane(),"card-login"); // show the 1st card
	}
	void setGUIcards(){
		portal = new JPanel(new BorderLayout());		// card-1
		portal.add(new JLabel(new ImageIcon("CafeGaggle.jpg")), "Center");  // 1-1
		JPanel logpan = new JPanel();
			login = new JTextField(20);
			login.addActionListener(this);
			logpan.add(new JLabel("이름 ")); logpan.add(login);  // 1-2.a, 1-2.b
		portal.add(logpan, "South");

		chatroom = new JPanel(new BorderLayout());  	// card-2
		typein = new JTextField();
		typein.addActionListener(this);
		chatroom.add(typein, "South");	// 2-2

		ta = new JTextArea(14, 25*1);
		ta.setBackground(new Color(220,255,255));
		ta.setEditable(false);
		ta.setLineWrap(true);
		JScrollPane spane = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
									JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatroom.add(spane, "Center");  // 2-1 (-> replace it with a dual interface)
		//- dual design here - 7+
	}
	//+
	//main...
	
	public void start() {	// overriding
		System.out.println("* Thread starting *");
		(new Thread (this)).start();	// threading (서버 메세지를 받는)
     }
	
	public void run(){
		System.out.println("run: ... ī�� �� �ȶ� ...");
		//try {
		//	// 서버접속(create a Socket) & IO stream 두개 만들기
		//	// execute();	//  서버발 메세지 받아 출력하는 함수
		//} catch (IOException e) { System.out.println("연결실패."); }
		try {
			// 서버 접속(create...
			Socket sock = new Socket("localhost", 2021);
			is = new DataInputStream(
					new BufferedInputStream(sock.getInputStream()));
			os = new DataOutputStream(
					new BufferedOutputStream(sock.getOutputStream()));
			execute();
		} catch(IOException e){ System.out.println("연결실패"); }
	}
	
	public void execute(){ // 서버에서 계속 오는 메시지를 받아서 출력한다
		// try{
		// 		whlie(ture){
		//			// 서버(쓰레드)로부터 메세지 받고 출력함
		//		}
		// } catch(IOException e){} finally{ System.out.pirntln("stop"); }
		try{
			while(true){
				String msg = is.readUTF();
				ta.append(msg + "\n");
			}
		}catch(IOException e){} finally{ System.out.println("stop"); }
	}
	
	public void actionPerformed (ActionEvent e) {
		Component c = (Component) e.getSource(); // source?
		// 내 login 입력(이름, 채팅글)을 읽어서 서버로 보낸다.
		if ((JTextField) e.getSource() == login) {
	    	myname = login.getText();
	    	// System.out.println("login : " + myname + "인데요.");
	    	try{ os.writeUTF(myname); os.flush(); }
	    	catch(IOException ioe){ System.out.println("Fail"); }
			cardm.show(this.getContentPane(), "card-chat");
			// ta.append(myname + " 입장!\n");
			// *focus*
			typein.requestFocus(); // 커서 깜빡임
		}
		else {  //-  타이핑 채팅 글-
			// ta.append(myname + " : " + typein.getText() + "\n");
			try{ os.writeUTF(typein.getText()); os.flush(); }
			catch(IOException ioe){}
			typein.setText(""); // 초기화
			typein.requestFocus();
		}
	}
	public static void main(String[] args) {
		KChatClient chatter = new KChatClient();
		chatter.init();		// JApplet 함수
		chatter.start();	// JApplet 함수
		JFrame f = new JFrame("Lab XI. CafeGaggle");
		f.getContentPane().add(chatter);
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
