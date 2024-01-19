package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingEvent_04  extends JFrame implements ActionListener{
	Container cp;
	JButton btn1, btn2, btn3;
	
	public SwingEvent_04(String title) {
		super(title);
		cp = this.getContentPane();
		
		this.setBounds(800, 100, 300, 300);
		cp.setBackground(new Color(204, 204, 204));
		
		initDesign();
		
		
		
		this.setVisible(true);
	}
	
	public void initDesign() {
		//레이아웃 변경
		this.setLayout(new FlowLayout());
		
		btn1 = new JButton("버튼 #1");
		btn2 = new JButton("버튼 #2");
		btn3 = new JButton("버튼 #3");
		
		//버튼 색상 변경
		btn1.setBackground(Color.PINK);
		btn2.setBackground(Color.ORANGE);
		btn3.setBackground(Color.GRAY);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource(); // 버튼의 어떤 메소드 호출인지 정확히 지정
		
		if(ob == btn1) JOptionPane.showMessageDialog(this, "1번 버튼 클릭!");
		else if(ob == btn2) JOptionPane.showMessageDialog(this, "2번 버튼 클릭!");
		else if(ob == btn3) JOptionPane.showMessageDialog(this, "3번 버튼 클릭!");
		else JOptionPane.showMessageDialog(this, "버튼 클릭!");
		
		
	}
	
	public static void main(String[] args) {
		new SwingEvent_04("버튼 이벤트");
	}

}
//

