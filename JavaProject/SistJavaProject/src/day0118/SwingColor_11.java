package day0118;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

public class SwingColor_11 extends JFrame implements ActionListener{
	Container cp;
	JButton[] btn = new JButton[5];
	String[] btnLabel = {"Red", "Green", "Blue", "Magenta", "Gray"};
	Color[] bgColor = {Color.RED, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.GRAY};
	JLabel lbl;

	public SwingColor_11(String title) {
		super(title);
		cp = this.getContentPane();

		this.setBounds(800, 100, 400, 300);
		cp.setBackground(new Color(204, 204, 204));

		initDesign();

		this.setVisible(true);
	}

	public void initDesign() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		this.add(panel, BorderLayout.NORTH);
		

		for(int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(btnLabel[i]);
			btn[i].setBackground(bgColor[i]);

			//버튼 6개 이벤트 추가 (버튼 누르면 배경색 변경)
			btn[i].addActionListener(this);

			panel.add(btn[i]);
		}
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		this.add(panel2, JLabel.CENTER);
		
		lbl = new JLabel("안녕하세요.", JLabel.CENTER);
		lbl.setPreferredSize(new Dimension(200, 200));
		lbl.setFont(new FontUIResource("", Font.BOLD, 25));
		lbl.setBackground(Color.black);
		panel2.add(lbl);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		for(int i = 0; i < btn.length; i++) {
			if(ob == btn[i]) {
				lbl.setForeground(bgColor[i]);
				this.setTitle("Color : " + btnLabel[i]);
			}
		}

	}

	public static void main(String[] args) {
		new SwingColor_11("글자색 바꾸기");
	}

}

