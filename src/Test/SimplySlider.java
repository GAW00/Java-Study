package Test;

import javax.swing.*;
import javax.swing.event.*; //for the event&listener of JSlider
import java.awt.*; //for BorderLayout

public class SimplySlider extends JPanel implements ChangeListener{ //2@@ implements ChangeListener : changelistener의 처리기능을 가지고있다(자격증 개념,기능 = @@3함수)
	JSlider js;
	public SimplySlider(int orient){
		js = new JSlider(orient,0,100,25);
		js.setMajorTickSpacing(50); //메이저 표시(숫자) 간격(0,50,100)
		js.setPaintTicks(true);
		js.setMinorTickSpacing(10); //마이너 표시(눈금) 간격(0,10,20,...,100)
		js.setPaintLabels(true); //+
		
		js.addChangeListener(this); //1@@ : js 슬라이더에서의 changelist 이벤트는 니가 처리해라(this = 나)
		
		setLayout(new BorderLayout()); //<-default FlowLayout()
		add(js);
		
		
		
		add(js); //this.add()
	}
	
	//3@@ : 콘솔에 현재 슬라이더의 값을 출력하는 기능
	public void stateChanged (ChangeEvent e){
		System.out.println(((JSlider)e.getSource()).getValue());
	}
	
	public static void main(String[] args) {
		JFrame jf = new JFrame("핵심 Java: SimplySlider");
		jf.getContentPane().add(new SimplySlider(JSlider.VERTICAL));
		jf.setSize(300,200);
		jf.setVisible(true);

	}

}
