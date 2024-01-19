package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingBtnEvent_05  extends JFrame implements ActionListener{
	Container cp;
	JButton btn1, btn2;
	
	public SwingBtnEvent_05(String title) {
		super(title);
		cp = this.getContentPane();
		
		this.setBounds(800, 100, 300, 300);
		cp.setBackground(new Color(204, 204, 204));
		
		initDesign();
		
		this.setVisible(true);
	}
	
	
	private void initDesign() {
		this.setLayout(new FlowLayout());
		
		btn1 = new JButton("◀");
		btn2 = new JButton("▶");
		
		//버튼색상
		btn1.setBackground(Color.CYAN);
		btn2.setBackground(Color.PINK);
		
		//글자색상
		btn1.setForeground(Color.GRAY);
		btn2.setForeground(Color.GRAY);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);

		this.add(btn1);
		this.add(btn2);

	}
	
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource(); // 버튼의 어떤 메소드 호출인지 정확히 지정
		
		if(ob == btn1) JOptionPane.showMessageDialog(this, "왼쪽 버튼 클릭!");
		else if(ob == btn2) JOptionPane.showMessageDialog(this, "오른쪽 버튼 클릭!");
		
		
	}
	
	public static void main(String[] args) {
		new SwingBtnEvent_05("버튼 이벤트 5");
	}
}
