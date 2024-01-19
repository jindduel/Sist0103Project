package day0119;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

public class CheckRadio_03 extends JFrame implements ActionListener, ItemListener{
	Container cp;
	JCheckBox[] cbHobby = new JCheckBox[4];
	JCheckBox cbDriver, cbFont;
	JButton btnHobby;
	JLabel lblResult;
	
	public CheckRadio_03(String title) {
		super(title);
		cp = this.getContentPane();
		
		this.setBounds(800, 100, 400, 300);
		cp.setBackground(new Color(204, 204, 204));

		initDesign();

		this.setVisible(true);
	}

	public void initDesign() {
		this.setLayout(null);
		
		cbDriver = new JCheckBox("운전면허");
		cbDriver.setBounds(20, 20, 100, 30);
		cbDriver.setOpaque(false);
		cbDriver.addItemListener(this); //ItemListener 이벤트 핸들러와 연결되는 객체
		this.add(cbDriver);
		
		lblResult = new JLabel("Have a Nice Day!!!", JLabel.CENTER);
		lblResult.setBounds(20, 200, 300, 50);
		lblResult.setBorder(new LineBorder(Color.GREEN, 5));
		lblResult.setFont(new Font("", Font.PLAIN, lblResult.getFont().getSize()));
		this.add(lblResult);
		
		//취미 체크박스
		String[] hobbys = {"여행", "게임", "넷플릭스", "코딩"};
		int xpos = 20;
		
		for(int i = 0; i < cbHobby.length; i++) {
			cbHobby[i] = new JCheckBox(hobbys[i]);
			cbHobby[i].setBounds(xpos, 80, 80, 30);
			cbHobby[i].setOpaque(false);
			this.add(cbHobby[i]);
			xpos += 80;
		}
		
		btnHobby = new JButton("나의 취미 출력");
		btnHobby.setBounds(60, 140, 200, 30);
		this.add(btnHobby);
		btnHobby.addActionListener(this);
		
		cbFont = new JCheckBox("글꼴 굵게");
		cbFont.setBounds(180, 20, 100, 30);
		this.add(cbFont);
		cbFont.setOpaque(false);
		cbFont.addItemListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		Boolean sw = false;
		String s = "<html><body>";
		
		if(ob == btnHobby) {
			s += "나는 운전면허가 " + (cbDriver.isSelected() ? "있습니다. " : "없습니다. ");
			lblResult.setText(s);
			
			s += "<br />나의 취미는 ";
			for(int i = 0; i < cbHobby.length; i++) {
				if(cbHobby[i].isSelected()) {
					s += "[" + cbHobby[i].getText() + "] ";
					sw = true;
				}
			}
			
			if(!sw) s += "없습니다.";
			else s += "입니다. ";
			
			s += " </body></html>";
			
			lblResult.setText(s);
		}
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob = e.getSource();
		String s = "";
		
		if(ob == cbDriver) {
			s += "나는 운전면허가 " + (cbDriver.isSelected() ? "있습니다. " : "없습니다. ");
			lblResult.setText(s);
		}
		
		if(ob == cbFont) {
			lblResult.setFont(new Font("", (cbFont.isSelected() ? Font.BOLD : Font.PLAIN), lblResult.getFont().getSize()));
		}
		
		
	}
	
	public static void main(String[] args) {
		new CheckRadio_03("체크박스 3");
	}


}
//
