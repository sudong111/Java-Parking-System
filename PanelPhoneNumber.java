package System;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import System.PanelParkingKorean.MyActionListener;
import System.PanelPhoneNumber.ChangeActionListener;


@SuppressWarnings({ "serial", "unused" })
class PanelPhoneNumber extends JPanel {
	private JButton button0, button1, button2, button3, button4, button5;
	private JButton button6, button7, button8, button9, buttonDel, buttonNext, buttonBack;
	private String operator = "";
	private ParkingSystemGui win;
	private Font f1;
	private JTextField t;
	
	String UserPhone;
	String UserCar;
	
	public void setphonenumber(String phonenumber) {
		System.out.println(phonenumber);
		UserPhone = phonenumber;
	}
	
	public void setcarnumber(String carnumber) {
		System.out.println(carnumber);
		UserCar = carnumber;
	}
	
	

	public PanelPhoneNumber(ParkingSystemGui win) {
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
		
		buttonBack = new JButton("이전");
		buttonBack.setSize(70, 70);
		buttonBack.setLocation(650, 350);


		JLabel label1 = new JLabel("CCNS - Communication Circuit & System Design");
		label1.setBounds(30, 390, 350, 70);
		f1 = new Font("Segoe Script", Font.PLAIN, 12);
		label1.setFont(f1);

		JLabel label2 = new JLabel("Parking System");
		label2.setBounds(540, 21, 190, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 25);
		label2.setFont(f1);

		JLabel label3 = new JLabel("휴대폰 번호를 입력해주세요.");
		label3.setBounds(505, 205, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 20);
		label3.setFont(f1);

		JLabel label4 = new JLabel("번호 입력이 끝나셨다면 다음을 눌러주세요.");
		label4.setBounds(510, 245, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 13);
		label4.setFont(f1);
		
		JLabel label5 = new JLabel("번호 입력은 주차한 시간이 오래된 경우 SMS로");
		label5.setBounds(520, 275, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 11);
		label5.setFont(f1);
		
		JLabel label6 = new JLabel("문자를 발송하기 위함입니다.");
		label6.setBounds(565, 295, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 11);
		label6.setFont(f1);

		t = new JTextField(5);
		t.setBounds(530, 150, 205, 50);
		f1 = new Font("함초롱바탕", Font.PLAIN, 30);
		t.setFont(f1);

		JLabel label7 = new JLabel("입력한 휴대폰번호 ");
		label7.setBounds(575, 70, 200, 100);
		f1 = new Font("함초롱바탕", Font.PLAIN, 15);
		label7.setFont(f1);

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
		add(buttonBack);
		add(label1);
		add(label2);
		add(label3);
		add(label4);
		add(label5);
		add(label6);
		add(label7);
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
		buttonBack.addActionListener(new MyActionListener());
		

	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			win.change("PanelMain");
		}
	}
	

	class OurActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			
			String input = t.getText();
	
			if (input == null || input.isEmpty() || input.length() != 11) {
				JOptionPane.showMessageDialog(null, "올바른 휴대폰 번호를 입력하세요.");
				return;
			}
			System.out.println(input);
			System.out.println(UserPhone);
			
			if (input == UserPhone ){
				
				System.out.println("똑같은데 왜?");
				String c = ("입력된 차량이 있습니다. 이 차량으로 주차하시곘습니까? 차량번호 : ");
				String d = UserCar;
				String wow = c.concat(d);
				int result = JOptionPane.showConfirmDialog(null, wow, "Confirm", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION) {
					return;
				}
				else if(result == JOptionPane.YES_OPTION) {
					win.change("PanelparkingSec" , UserCar );
				}
				else {
					win.change("PanelPassword", input);
				}

			}
			
			win.change("PanelPassword", input);
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