//package Test;
//
//import java.awt.*;
//import javax.swing.*;
//import java.util.*;
//import java.text.*; // DateFormat
//
//public class DigitalClock extends java.applet.Applet{
//	Repainter rp; // thread
//	public void start(){
//		rp = new Repainter(this, 1000);
//		rp.start(); //*
//	}
//	public void paint(Graphics g){
//		Calendar cal = Calendar.getInstance();
//		Date date = cal.getTime();
//		DateFormat dateFormatter = DateFormat.getTimeInstance();
//		
//		g.setFont(new Font("굴림", Font.BOLD, 36));
//		g.drawString(dateFormatter.format(date), 30, 120); //+
//		DateFormat date2Formatter
//					= DateFormat.getDateInstance(DateFormat.SHORT);
//		g.setFont(new Font("굴림", Font.BOLD, 24));
//		g.drawString(date2Formatter.format(date), 30+65, 70);
//	}
//	public static void main(String[] args) {
//		JFrame f = new JFrame("디지털 시계");
//		
//		DigitalClock dc = new DigitalClock();
//		dc.start();
//		f.getContentPane().add(dc,"Center");
//		f.setSize(300,200);
//		f.setVisible(true);
//	}
//}
//
//class Repainter extends Thread{
//	Component comp; // any clockwork
//	int timeInterval;
//	public Repainter(Component comp, long timeInterval){ // DigitalClock=Applet, 1000
//		this.comp = comp;
//		this.timeInterval = (int) timeInterval;
//	}
//	public void run(){ // overriding Thread's run()
//		while(true){
//			try{
//				comp.repaint();
//				sleep(timeInterval);
//			} catch(Exception e){}
//		}
//	}
//}