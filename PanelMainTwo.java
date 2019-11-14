package System;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import System.PanelMainTwo.MyActionListener;

@SuppressWarnings({ "serial", "unused" })
public class PanelMainTwo extends JPanel {

	private JButton button1, button2, button3, button4, button5;
	private JButton button6, button7, button8, button9;
	private ParkingSystemGui win;
	private Font f1;
	JLabel locationLabel;
	
	public void setPassword(String Password) {

	}

	public void setLocation(String location) {
		locationLabel.setText(location);
	}
	
	public PanelMainTwo(ParkingSystemGui win) {
		this.win = win;
		setLayout(null);

		 ImageIcon ic  = new ImageIcon("C:\\Users\\sudon\\Downloads\\13131.jpg");
	     JLabel lbImage1  = new JLabel(ic);
	     lbImage1.setBounds(450,320,309,90);
	     add(lbImage1);
	     
		button1 = new JButton("1");
		button1.setSize(80, 120);
		button1.setLocation(12, 10);

		button2 = new JButton("2");
		button2.setSize(80, 120);
		button2.setLocation(104, 10);

		button3 = new JButton("3");
		button3.setSize(80, 120);
		button3.setLocation(196, 10);

		button4 = new JButton("4");
		button4.setSize(80, 120);
		button4.setLocation(288, 10);

		button5 = new JButton("5");
		button5.setSize(80, 120);
		button5.setLocation(12, 200);

		button6 = new JButton("6");
		button6.setSize(80, 120);
		button6.setLocation(104, 200);

		button7 = new JButton("7");
		button7.setSize(80, 120);
		button7.setLocation(196, 200);

		button8 = new JButton("8");
		button8.setSize(80, 120);
		button8.setLocation(288, 200);
		
		locationLabel = new JLabel();
		locationLabel.setBounds(685, 145, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 15);
		locationLabel.setFont(f1);
		
		JLabel label4 = new JLabel("주차되어있는 자리 : ");
		label4.setBounds(535, 145, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 15);
		label4.setFont(f1);


		button1.addActionListener(new MyActionListener());
		button2.addActionListener(new MyActionListener());
		button3.addActionListener(new MyActionListener());
		button4.addActionListener(new MyActionListener());
		button5.addActionListener(new MyActionListener());
		button6.addActionListener(new MyActionListener());
		button7.addActionListener(new MyActionListener());
		button8.addActionListener(new MyActionListener());

		JLabel label1 = new JLabel("CCNS - Communication Circuit & System Design");
		label1.setBounds(30, 390, 350, 70);
		f1 = new Font("Segoe Script", Font.PLAIN, 12);
		label1.setFont(f1);

		JLabel label2 = new JLabel("Parking System");
		label2.setBounds(540, 21, 190, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 25);
		label2.setFont(f1);

		JLabel label3 = new JLabel("주차할 자리나 주차했던 자리를 선택해주세요.");
		label3.setBounds(485, 205, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 15);
		label3.setFont(f1);

		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(label1);
		add(label2);
		add(label3);
		add(label4);
		add(locationLabel);


	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			if(((JButton) e.getSource()).getText() == locationLabel.getText()) {
				
				win.change("PanelPasswordTwo");
				
			}
		
			else win.change("PanelParking",((JButton)e.getSource()).getText());
			
		}
	}
}
