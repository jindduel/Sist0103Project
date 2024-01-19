package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingImageIcon_06  extends JFrame implements ActionListener{
	Container cp;
	
	ImageIcon icon1 = new ImageIcon("C:\\SIST0103\\swingimage\\LEFT.gif");
	ImageIcon icon2 = new ImageIcon("C:\\SIST0103\\swingimage\\leftDown.gif");
	ImageIcon icon3 = new ImageIcon("C:\\SIST0103\\swingimage\\leftRollover.gif");
	ImageIcon icon4 = new ImageIcon("C:\\SIST0103\\swingimage\\chick.gif");
	ImageIcon icon5 = new ImageIcon("C:\\SIST0103\\swingimage\\an07.gif");
	
	JButton btn1, btn2, btn3, btn4, btn5;
	
	public SwingImageIcon_06(String title) {
		super(title);
		cp = this.getContentPane();
		
		this.setBounds(800, 100, 300, 300);
		cp.setBackground(new Color(204, 204, 204));
		initDesign();
		this.setVisible(true);
	}
	
	public void initDesign() {
		//2행 2열
		this.setLayout(new GridLayout(2, 2));
		
		btn1 = new JButton("Hello", icon1);
		btn1.setHorizontalTextPosition(JButton.CENTER);
		btn1.setVerticalTextPosition(JButton.BOTTOM);
		
		this.add(btn1);
		
		btn1.setRolloverIcon(icon2);
		btn1.setPressedIcon(icon3);
		
		btn2 = new JButton(icon4);
		this.add(btn2);		
		
		btn3 = new JButton("스윙 버튼");
		this.add(btn3);
		
		btn4 = new JButton("안녕", icon5);
		this.add(btn4);
		

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		//btn5 = new JButton();
		//this.add(btn5);
		
	}
	
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource(); // 버튼의 어떤 메소드 호출인지 정확히 지정
		
		if(ob == btn1) JOptionPane.showMessageDialog(this, "1번 버튼 클릭!");
		else if(ob == btn2) JOptionPane.showMessageDialog(this, "2번 버튼 클릭!");
		else if(ob == btn3) JOptionPane.showMessageDialog(this, "3번 버튼 클릭!");
		else if(ob == btn4) JOptionPane.showMessageDialog(this, "4번 버튼 클릭!");
		
		
	}
	
	public static void main(String[] args) {
		new SwingImageIcon_06("이미지 버튼 6");
	}
}
//
