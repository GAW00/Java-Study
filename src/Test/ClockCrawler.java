package Test;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.*; // DateFormat

public class ClockCrawler implements Runnable{ // <-->'extends'
	// +2 vars
	DigitalClock dc; // dc는 애플릿이다!?
	int x = 10, y = 40, dx = 10;
	ClockCrawler(){
		JFrame bben = new JFrame("Lab 9. ClockCrawler");
		dc = new DigitalClock();
		bben.getContentPane().add(dc, "Center");
		dc.start(); // not a thread, one inside it;
		bben.setSize(300,200);
		bben.setVisible(true); //->
	}
	public static void main(String[] args) {
		ClockCrawler ccr = new ClockCrawler(); // me, a Runnable
		for(int i = 0; i < 5; i++){
			Thread t = new Thread(ccr); // 't' is a thread
			t.start(); // <--> rp.start()
		}
	}
	public void run(){ // (대리)thread가 수행할 작업
		int x = 5 + (int)(Math.random()*275); // local!
		int y = 5 * (int)(Math.random()*160); 
		int dx = (int)(7.5 + Math.random()*5); // speed!
		int n = (int)(2 + Math.random()*3); // tempo!
		int t = 0;
		while(true){
			System.out.println("Crawl" + ++t);
			Graphics g = dc.getGraphics(); // borrowing..
			if(x >= dc.getWidth()-20 || x <= 5) dx = -dx;
			x += dx;
			if(g != null){
				g.setColor(Color.red);
				if(dx > 0) g.drawString("--*-", x, y);
				else	   g.drawString("-*--", x, y);
			}
			try{ Thread.sleep(1000/n); } catch(Exception e){}
		}
	}
}

class DigitalClock extends java.applet.Applet{
	Repainter rp; // thread
	public void start(){
		rp = new Repainter(this, 1000);
		rp.start(); //*
	}
	public void paint(Graphics g){
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		DateFormat dateFormatter = DateFormat.getTimeInstance();
		
		g.setFont(new Font("굴림", Font.BOLD, 36));
		g.drawString(dateFormatter.format(date), 30, 120); //+
		DateFormat date2Formatter
					= DateFormat.getDateInstance(DateFormat.SHORT);
		g.setFont(new Font("굴림", Font.BOLD, 24));
		g.drawString(date2Formatter.format(date), 30+65, 70);
	}
}

class Repainter extends Thread{
	Component comp; // any clockwork
	int timeInterval;
	public Repainter(Component comp, long timeInterval){ // DigitalClock=Applet, 1000
		this.comp = comp;
		this.timeInterval = (int) timeInterval;
	}
	public void run(){ // overriding Thread's run()
		while(true){
			try{
				comp.repaint();
				sleep(timeInterval);
			} catch(Exception e){}
		}
	}
}