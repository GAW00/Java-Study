package Test;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Soccer {
	JField field;
	Ball ball;
	Player p,q,r;
	boolean timeout, goal;
	int clock;
	int Pscore=0,Qscore=0;
	
	public static void main(String[] args) {
		Soccer game = new Soccer();
		game.start();
	}
	
	Soccer(){
		field=new JField(640/2,480/2,this); // 운동장의 크기
		ball=new Ball(field);
		p=new Player("손흥민","토트넘 홋스퍼 FC",field,-50,10);
		q=new Player("이강인","발렌시아 CF",field,50,10);
		JPanel pan = new JPanel(null);
		pan.setBackground(Color.WHITE);
		pan.add(field);
		field.setLocation(20,10);
		
		JFrame f = new JFrame("핵심J: Soccer Graphical");
		f.getContentPane().add(pan);
		f.setSize(320+56,240+60);
		f.setVisible(true); //f.setResizable(false);
		start();
	}
	void start() {
		System.out.println(" * START! * ");
		timeout = false;
		run();
	}
	void stop() {timeout=true;}
	void show() {			/* member variables: {field, b, p, q} */
		int dH = 10, dW = 3;	/* 운동장 cell dimension: dHxdW */
		int bx = ball.getX() / dW;
		int by = ball.getY() / dH;
		int px = p.getX() / dW;
		int py = p.getY() / dH;
		int qy = q.getY() / dH;
		int qx = q.getX() / dW;

		hline(field.getRight()/dW - field.getLeft()/dW + 1);
		for(int r = field.getTop()/dH; r <= field.getBottom()/dH; r ++) {
		    tpr("|");
		    for(int i = field.getLeft()/dW; i<= field.getRight()/dW; i ++) {
			if (r == by && i == bx) {
				tpr("*");
				if (r == py && i == px) {
					tpr("p"); i++;
					if (r == qy && i == qx) { tpr("q"); i++; }
				} else if (r == qy && i == qx) { tpr("q"); i++; }
			} else if (r == py && i == px) {
				tpr("p");
				if (r == qy && i == qx) { tpr("q"); i++; }
			} else if (r == qy && i == qx) { tpr("q");
			} else { /* if (r == 0 && i == 0) tpr("+"); else  */
				tpr(" ");
			}
		    }
		    tprl("|"+r);
		}
		hline(field.getRight()/dW - field.getLeft()/dW + 1);
	}
	void hline(int n) {
		tpr("+");
		for(int i = 1; i<=n; i++)  tpr("-");
		tprl("+");
	}
	void tpr(String s) { System.out.print(s); }
	void tprl(String s) { System.out.println(s); }
	void run() {
		clock=0;
		while(!timeout) {
			clock++; System.out.print("["+clock+"]");
			int dist=p.move(ball); // 선수들은 공 쪽으로 달려간다
			int distq=q.move(ball);
			r=p;
			if(distq<dist) {r=q;dist=distq;} //더 가까운 선수가 공을 찬다
			if(dist<5) {
				r.kick(ball); // 5ft 이내면 공을 찬다
				System.out.print(" -> "+r.name+" kicks! -> ");
			}
			goal=ball.move();
			if(goal) {
				System.out.println(" * 골인! * ");
				if(ball.x<0)
					Qscore++;
				else
					Pscore++;
				System.out.print(" * "+Pscore+":"+Qscore+" * \n");
				field=new JField(640/2,480/2,this);
				ball=new Ball(field); // 골넣었으니까 공위치 초기화, 선수위치 초기화
				p=new Player("손흥민","토트넘 홋스퍼 FC",field,-50,10);
				q=new Player("이강인","발렌시아 CF",field,50,10);
			}
			
			field.repaint(); // show();
			try {Thread.sleep(100);}catch(Exception e) {} // 경기 속도를 조절하는 문장
			if(clock>90) {
				stop(); // 90분이 넘어가면 경기 종료
				System.out.println(" * TIME OUT! * ");
				System.out.print(" * 경기결과 = "+Pscore+":"+Qscore+" * \n"); // 최종 점수
				if(Pscore>Qscore) // 점수에 따른 승자 선언
					System.out.print(" * 우승팀은 "+p.team+"입니다! * \n");
				else if(Qscore==Pscore)
					System.out.println(" * 무승부 입니다! * \n");
				else
					System.out.print(" * 우승팀은 "+q.team+"입니다! * \n");
			}
		}
	}
}



class JField extends JPanel{
	private int x0,x1,y0,y1,w,h;
	Soccer match;
	JField(int wide, int high, Soccer match){ // 생성자
		w=wide;
		h=high;
		this.match=match;
		setSize(w,h);
		setBackground(Color.green); // 물감객체
		x1=w/2;y1=h/2; // 경기장의 중앙을(0,0)으로 두고
		x0=-x1;y0=-y1; // 경기장의 각 모서리를 구함
		//111111
		setFocusable(true);
		addKeyListener(new OMyKeyListener(match)); // in the constructor of class JField (a LPanel):
	}
	//222222
	class OMyKeyListener extends KeyAdapter
	{
		Soccer match;
		int speed=4;
		OMyKeyListener(Soccer m){match=m;}
		public void keyPressed(KeyEvent e){
			switch(e.getKeyCode()){
				case KeyEvent.VK_RIGHT:
					match.q.runtoward(5*speed,0);
					break;
				case KeyEvent.VK_LEFT:
					match.q.runtoward(-5*speed,0);
					break;
				case KeyEvent.VK_UP:
					match.q.runtoward(0,-5*speed);
					break;
				case KeyEvent.VK_DOWN:
					match.q.runtoward(0,5*speed);
					break;
				// case KeyEvent.VK_ESC:
			}	
		}
	}
	int getCx(){return x1;}
	int getCy(){return y1;}
	int getLeft() {return x0;} // 공이 경기장 밖으로 나갔는지 판별하기 위한 메소드
	int getRight() {return x1;}
	int getTop() {return y0;}
	int getBottom() {return y1;}
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.white); //테두리 흰색
		g.drawRect(0,0,w,h); //사각 테
		g.drawLine(getCx(),getCy()+y0,getCx(),getCy()+y1);
		g.drawOval(getCx()-40,getCy()-40,80,80); //(x좌표, y좌표, 를 왼쪽위점으로하는 원 을포함한 사각공간
		
		match.ball.draw(g);
		g.setColor(Color.red); match.p.draw(g);
		g.setColor(Color.blue); match.q.draw(g);
		drawClock(g); //시계
	}
	void drawClock(Graphics g){ //member method
		int r=10,x=w-r-10,y=r+10;
		double a=Math.PI/180*(-90+match.clock*(360/90));
		g.drawOval(x-r, y-r, 2*r, 2*r);
		g.drawLine(x,y,(int)(x+r*Math.cos(a)), //바늘
					   (int)(y+r*Math.sin(a)));
		
	}
	String info(){return "축구장";}
}



class Ball{
	JField f;
	int x,y;
	double vx,vy;
	Ball(JField f){x=0;vx=0;y=0;this.f=f;} // 생성자, this 는 "나"를 가리킴
	boolean move() {
		x+=(int)vx; y+=(int)vy;
		System.out.println(" 공("+x+","+y+").");
		vx=vx*0.8; vy=vy*0.8; // 마찰로 감속*비율
		return(x>f.getRight()-1||x<f.getLeft()+1); // 골인 판별위한 경기장 모서리의 x좌표와 공위치 비교, -1과 +1은 공의 크기를 상정한것
	}
	void fly(double kx,double ky) {vx+=kx;vy+=ky;}
	int getX() {return x;} // 공의 위치
	int getY() {return y;}
	void draw(Graphics g){
		int radius=5;
		g.setColor(Color.black);
		g.fillOval(f.getCx()+x-radius,
				   f.getCy()+y-radius,
				   radius*2,
			 	   radius*2);
	}
}


class Player{
	JField f;
	int x,y;
	double dx,dy,speed;
	String name,team;
	
	Player(String 이름, String tm, JField f, int x0, int y0){ // 생성자
		name=이름;x=x0;y=y0;
		team=tm;this.f=f;
	}
	int move(Ball b) {
	/* dx=? dy=? 공을 향해 dash */
		dash(b); // dx=?
		x+=(int)dx;y+=(int)dy;
		int dist=(int)distance(b); // 선수와 공까지의 거리
		System.out.print(" "+name+" "+dist);
		return dist;
	}
	// 공을 향해, 공을 뺏기 위해 질주하는 속도 결정
	void dash(Ball b) {
		double dist=distance(b)+1;
		speed=speed*0.8+randM(4); // 질주 속도 조절
		dx=(b.getX()-x)/dist*speed;
		dy=(b.getY()-y)/dist*speed;
	}
	double distance(Ball b) {
		double x2x=x-b.getX();
		double y2y=y-b.getY();
		return Math.sqrt(x2x*x2x+y2y*y2y); // 피타고라스의 정리
	}
	// 달리던 방향으로 차지만 약간의 방향변경(random)
	void kick(Ball b) {
		double kx=dx*2+randM(10)-5; // 기존 속도에 kx, ky만큼 변화함
		double ky=dy*2+randM(8)-5;
		b.fly(kx, ky);
		speed/=2;
	}
	double randM(int M) {return Math.random()*M;}
	int getX() {return x;}
	int getY() {return y;}
	
	void draw(Graphics g){
		g.drawRect(f.getCx()+x-5,
				   f.getCy()+y-20,10,20);
	}
	void runtoward(int dx,int dy){x+=dx;y+=dy;}
}
