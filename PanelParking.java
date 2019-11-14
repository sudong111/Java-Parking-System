package System;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import System.PanelParking.ChangeActionListener;


@SuppressWarnings({ "serial", "unused" })
class PanelParking extends JPanel {
	private JButton button0, button1, button2, button3, button4, button5;
	private JButton button6, button7, button8, button9, buttonDel, buttonNext;
	private String operator = "";
	private ParkingSystemGui win;
	private Font f1;
	private JTextField t;

	public void setPlate(String plate) {
		
	}
	
	public void setphonenumber(String phonenumber) {
		System.out.println(phonenumber);
	}
	
	public void setcarnumber(String carnumber) {
		System.out.println(carnumber);
	}
	
	
	
	public PanelParking(ParkingSystemGui win) {
		setLayout(null);
		this.win = win;

		button1 = new JButton("1");
		button1.setSize(80, 80);
		button1.setLocation(12, 10);

		button2 = new JButton("2");
		button2.setSize(80, 80);
		button2.setLocation(104, 10);

		button3 = new JButton("3");
		button3.setSize(80, 80);
		button3.setLocation(196, 10);

		button4 = new JButton("4");
		button4.setSize(80, 80);
		button4.setLocation(12, 120);

		button5 = new JButton("5");
		button5.setSize(80, 80);
		button5.setLocation(104, 120);

		button6 = new JButton("6");
		button6.setSize(80, 80);
		button6.setLocation(196, 120);

		button7 = new JButton("7");
		button7.setSize(80, 80);
		button7.setLocation(12, 230);

		button8 = new JButton("8");
		button8.setSize(80, 80);
		button8.setLocation(104, 230);

		button9 = new JButton("9");
		button9.setSize(80, 80);
		button9.setLocation(196, 230);

		button0 = new JButton("0");
		button0.setSize(80, 80);
		button0.setLocation(104, 330);

		buttonDel = new JButton("<=");
		buttonDel.setSize(80, 80);
		buttonDel.setLocation(196, 330);

		buttonNext = new JButton("다음");
		buttonNext.setSize(70, 70);
		buttonNext.setLocation(550, 350);

		JLabel label1 = new JLabel("CCNS - Communication Circuit & System Design");
		label1.setBounds(30, 390, 350, 70);
		f1 = new Font("Segoe Script", Font.PLAIN, 12);
		label1.setFont(f1);

		JLabel label2 = new JLabel("Parking System");
		label2.setBounds(540, 21, 190, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 25);
		label2.setFont(f1);

		JLabel label3 = new JLabel("차량번호를 입력해주세요.");
		label3.setBounds(505, 205, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 20);
		label3.setFont(f1);

		JLabel label4 = new JLabel("앞자리 입력이 끝나셨다면 다음을 눌러주세요.");
		label4.setBounds(485, 245, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 13);
		label4.setFont(f1);

		t = new JTextField(5);
		t.setBounds(550, 150, 145, 50);
		f1 = new Font("함초롱바탕", Font.PLAIN, 30);
		t.setFont(f1);

		JLabel label5 = new JLabel("입력한 차량번호 ");
		label5.setBounds(575, 70, 200, 100);
		f1 = new Font("함초롱바탕", Font.PLAIN, 15);
		label5.setFont(f1);

		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(button0);
		add(buttonDel);
		add(buttonNext);
		add(label1);
		add(label2);
		add(label3);
		add(label4);
		add(label5);
		add(t);

		button1.addActionListener(new ChangeActionListener());
		button2.addActionListener(new ChangeActionListener());
		button3.addActionListener(new ChangeActionListener());
		button4.addActionListener(new ChangeActionListener());
		button5.addActionListener(new ChangeActionListener());
		button6.addActionListener(new ChangeActionListener());
		button7.addActionListener(new ChangeActionListener());
		button8.addActionListener(new ChangeActionListener());
		button9.addActionListener(new ChangeActionListener());
		button0.addActionListener(new ChangeActionListener());
		buttonDel.addActionListener(new ChangeActionListener());
		buttonNext.addActionListener(new OurActionListener());

	}


	class OurActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String input = t.getText();
			if (input == null || input.isEmpty() || input.length() != 2) {
				JOptionPane.showMessageDialog(null, "차량 앞번호 두 자리를 입력하세요.");
				return;
			}

			win.change("PanelParkingKorean", input);
			t.setText("");
			operator="";
		}
	}

	class ChangeActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				operator += "1";
				t.setText(operator);
			} else if (e.getSource() == button2) {
				operator += "2";
				t.setText(operator);
			} else if (e.getSource() == button3) {
				operator += "3";
				t.setText(operator);
			} else if (e.getSource() == button4) {
				operator += "4";
				t.setText(operator);
			} else if (e.getSource() == button5) {
				operator += "5";
				t.setText(operator);
			} else if (e.getSource() == button6) {
				operator += "6";
				t.setText(operator);
			} else if (e.getSource() == button7) {
				operator += "7";
				t.setText(operator);
			} else if (e.getSource() == button8) {
				operator += "8";
				t.setText(operator);
			} else if (e.getSource() == button9) {
				operator += "9";
				t.setText(operator);
			} else if (e.getSource() == button0) {
				operator += "0";
				t.setText(operator);
			} else if (e.getSource() == buttonDel) {
				operator = operator.substring(0, operator.length() - 1);
				t.setText(operator);
			}
 
		}
	}

}