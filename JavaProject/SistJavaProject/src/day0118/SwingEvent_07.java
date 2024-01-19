package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingEvent_07 extends JFrame{
	Container cp;
	JButton btn1, btn2;
	
	public SwingEvent_07(String title) {
		super(title);
		cp = this.getContentPane();
		
		this.setBounds(800, 100, 500, 300);
		cp.setBackground(new Color(204, 204, 204));
		
		initDesign();
		
		this.setVisible(true);
	}
	
			
	public void initDesign() {
		//flow layout으로 버튼 2개 생성
		//버튼 색상 그레이, 버튼 색상 그린으로 변경
		this.setLayout(new FlowLayout());
		
		btn1 = new JButton("버튼 색상 그레이로 변경");
		btn2 = new JButton("버튼 색상 그린으로 변경");
		
		btn1.setBackground(Color.GRAY);
		btn2.setBackground(Color.GREEN);
		
		this.add(btn1);
		this.add(btn2);
		
//		btn1.addActionListener(this);
//		btn2.addActionListener(this);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cp.setBackground(Color.GRAY);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cp.setBackground(Color.GREEN);
			}
		});
		
		
	}
	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Object ob = e.getSource();
//		
//		if(ob == btn1) {
//			btn1.setBackground(Color.GRAY);
//			btn2.setBackground(Color.GRAY);
//		}
//		else if(ob == btn2) {
//			btn1.setBackground(Color.GREEN);
//			btn2.setBackground(Color.GREEN);
//		}
//	}
	
	
	

	
	public static void main(String[] args) {
		new SwingEvent_07("버튼 이벤트 7");
	}




}
//
