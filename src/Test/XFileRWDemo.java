package Test;

import java.io.*;
import java.awt.*; // Color, Insets
import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.event.*;

class XFileRWDemo extends JFrame implements ActionListener{
	JTextArea tarea;
	JButton loadbtn, savebtn;
	JFileChooser fchooser;
	
	public XFileRWDemo(){ super("Lab.X File Readr/Writer");
		JPanel panel = new JPanel();
		
		/* load & save button */
		loadbtn = new JButton("Load");
		loadbtn.addActionListener(this); // 자기 자신이 리스너의 구현 클래스이므로 this를 매개변수로 준다.
		panel.add(loadbtn);
		savebtn = new JButton("Save");
		savebtn.addActionListener(this);
		panel.add(savebtn);
		JPanel pan = new JPanel(); pan.add(loadbtn); pan.add(savebtn);
		getContentPane().add(pan, "South");
		
		/* text area */
		tarea = new JTextArea(10, 50);
		tarea.setBackground(new Color(220, 255, 255)); // tarea 배경색(awt)
		pack(); // <-- setSize(-, -)
		tarea.setMargin(new Insets(5, 5, 5, 5)); // tarea에서 상하좌우 여백(awt)
		JScrollPane spane = new JScrollPane(tarea);
		getContentPane().add(spane, "Center");
		
		/* file chooser */
		FileNameExtensionFilter fxfilter = new FileNameExtensionFilter(
						"Text Files: txt, java", "txt", "java");
		fchooser = new JFileChooser();
		fchooser.setFileFilter(fxfilter);
		
		setSize(500, 400); setVisible(true);
	}
	public static void main(String[] args) {
		new XFileRWDemo();
	}
	public void actionPerformed(ActionEvent e){
		// (1) Show the FileChooser --> <OK>
		// (2) Get the file object
		// (3) Open file --> BufferedReader
		// (4) Read a Line(반복문) --> append to JTextArea
		// (5) Close file
		if((JButton)e.getSource() == loadbtn){
			int fc_result = fchooser.showOpenDialog(tarea);
			//fc_result : JFileChooser.APPROVE_OPTION, CANCEL_, ERROR_
			if(fc_result == JFileChooser.APPROVE_OPTION){
				File file = fchooser.getSelectedFile();
				System.out.println("File name: " + file.getName()); // 테스트
				try{
					BufferedReader br = new BufferedReader(new FileReader(file));
					tarea.setText(""); // text area를 초기화	
					String line; // input buffer
					while((line = br.readLine()) != null) // 끝까지 한 줄씩 읽어와서
						tarea.append(line + "\n"); // text area에 추가하고(append) 줄바꿈
					br.close();
				} catch(IOException ex){}
			}
		} else{
			int fc_result = fchooser.showSaveDialog(tarea);
			if(fc_result == JFileChooser.APPROVE_OPTION){
				File file = fchooser.getSelectedFile();
				System.out.println("File name: " + file.getName()); // 테스트
				try{
					BufferedWriter bw = new BufferedWriter(new FileWriter(file));
					bw.write(tarea.getText()); // text from the JTextArea
					bw.flush(); // 찌꺼기 없앰
					bw.close();
				} catch(IOException ex){}
			}
		}
	}
}
