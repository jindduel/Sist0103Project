package day0118;

import java.awt.Color;

import javax.swing.JFrame;

public class SwingGibon_01 extends JFrame {
	
	public SwingGibon_01 (String title) {
		super(title);
		
		//시작 위치, 너비, 높이
		this.setBounds(500, 100, 300, 300);
		//배경색
		//this.getContentPane().setBackground(Color.MAGENTA); 
		this.getContentPane().setBackground(new Color(111,111,111));
		//프레임에 보이게
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new SwingGibon_01("스윙 기본");
	}
}