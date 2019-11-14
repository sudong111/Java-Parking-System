package System;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import System.PanelParkingKorean.KoreanActionListener;
import System.PanelParkingKorean.MyActionListener;

@SuppressWarnings({ "serial", "unused" })
class PanelParkingKorean extends JPanel {

	private JButton button1, button2, button3, button4, button5, button6;
	private JButton button7, button8, button9, button10, button11, button12;
	private JButton button13, button14, button15, button16;
	private JButton buttonDel, buttonBack, buttonNext;
	private ParkingSystemGui win;
	private Font f1;
	private int a, b, c;
	public JTextField t;
	private String operator = "";

	public void setPlate(String plate) {
		t.setText(plate);
	}

	public PanelParkingKorean(ParkingSystemGui win) {
		setLayout(null);
		this.win = win;

		button1 = new JButton("ㄱ");
		button1.setSize(80, 80);
		button1.setLocation(12, 10);

		button2 = new JButton("ㄴ");
		button2.setSize(80, 80);
		button2.setLocation(104, 10);

		button3 = new JButton("ㄷ");
		button3.setSize(80, 80);
		button3.setLocation(196, 10);

		button4 = new JButton("ㄹ");
		button4.setSize(80, 80);
		button4.setLocation(288, 10);

		button5 = new JButton("ㅁ");
		button5.setSize(80, 80);
		button5.setLocation(380, 10);

		button6 = new JButton("ㅂ");
		button6.setSize(80, 80);
		button6.setLocation(12, 120);

		button7 = new JButton("ㅅ");
		button7.setSize(80, 80);
		button7.setLocation(104, 120);

		button8 = new JButton("ㅇ");
		button8.setSize(80, 80);
		button8.setLocation(196, 120);

		button9 = new JButton("ㅈ");
		button9.setSize(80, 80);
		button9.setLocation(288, 120);

		button10 = new JButton("ㅎ");
		button10.setSize(80, 80);
		button10.setLocation(380, 120);

		button11 = new JButton("ㅏ");
		button11.setSize(80, 80);
		button11.setLocation(12, 230);

		button12 = new JButton("ㅓ");
		button12.setSize(80, 80);
		button12.setLocation(104, 230);

		button13 = new JButton("ㅗ");
		button13.setSize(80, 80);
		button13.setLocation(196, 230);

		button14 = new JButton("ㅜ");
		button14.setSize(80, 80);
		button14.setLocation(288, 230);

		button15 = new JButton("ㅐ");
		button15.setSize(80, 80);
		button15.setLocation(380, 230);

		button16 = new JButton("기타");
		button16.setSize(80, 80);
		button16.setLocation(12, 330);

		buttonDel = new JButton("<=");
		buttonDel.setSize(80, 80);
		buttonDel.setLocation(380, 340);

		buttonBack = new JButton("이전");
		buttonBack.setSize(70, 70);
		buttonBack.setLocation(650, 350);

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

		t = new JTextField(5);
		t.setBounds(550, 150, 145, 50);
		f1 = new Font("돋움", Font.PLAIN, 30);
		t.setFont(f1);

		JLabel label4 = new JLabel("입력한 차량번호 ");
		label4.setBounds(575, 70, 200, 100);
		f1 = new Font("함초롱바탕", Font.PLAIN, 15);
		label4.setFont(f1);

		JLabel label5 = new JLabel("특수한 한글은 기타를 눌러주세요. ");
		label5.setBounds(525, 225, 230, 100);
		f1 = new Font("함초롱바탕", Font.PLAIN, 13);
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
		add(button10);
		add(button11);
		add(button12);
		add(button13);
		add(button14);
		add(button15);
		add(button16);
		add(buttonDel);
		add(buttonBack);
		add(buttonNext);
		add(label1);
		add(label2);
		add(label3);
		add(label4);
		add(label5);
		add(t);

		button1.addActionListener(new KoreanActionListener());
		button2.addActionListener(new KoreanActionListener());
		button3.addActionListener(new KoreanActionListener());
		button4.addActionListener(new KoreanActionListener());
		button5.addActionListener(new KoreanActionListener());
		button6.addActionListener(new KoreanActionListener());
		button7.addActionListener(new KoreanActionListener());
		button8.addActionListener(new KoreanActionListener());
		button9.addActionListener(new KoreanActionListener());
		button10.addActionListener(new KoreanActionListener());
		button11.addActionListener(new KoreanActionListener());
		button12.addActionListener(new KoreanActionListener());
		button13.addActionListener(new KoreanActionListener());
		button14.addActionListener(new KoreanActionListener());
		button15.addActionListener(new KoreanActionListener());
		button16.addActionListener(new KoreanActionListener());
		buttonDel.addActionListener(new KoreanActionListener());
		buttonBack.addActionListener(new MyActionListener());
		buttonNext.addActionListener(new OurActionListener());

	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			win.change("PanelParking");
		}
	}

	class OurActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String input = t.getText();
			if (input == null || input.isEmpty() || input.length() != 3) {
				JOptionPane.showMessageDialog(null, "올바른 차량 번호를 입력하세요.");
				return;
			}
			win.change("PanelParkingTwo", input);
		}
	}

	class KoreanActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == button1) {
				operator += "ㄱ";
				a = 1;
				t.setText(t.getText() + operator);
				operator = "";
			} else if (e.getSource() == button2) {
				operator += "ㄴ";
				a = 2;
				t.setText(t.getText() + operator);
				operator = "";
			} else if (e.getSource() == button3) {
				operator += "ㄷ";
				a = 3;
				t.setText(t.getText() + operator);
				operator = "";
			} else if (e.getSource() == button4) {
				operator += "ㄹ";
				a = 4;
				t.setText(t.getText() + operator);
				operator = "";
			} else if (e.getSource() == button5) {
				operator += "ㅁ";
				a = 5;
				t.setText(t.getText() + operator);
				operator = "";
			} else if (e.getSource() == button6) {
				operator += "ㅂ";
				a = 6;
				t.setText(t.getText() + operator);
				operator = "";
			} else if (e.getSource() == button7) {
				operator += "ㅅ";
				a = 7;
				t.setText(t.getText() + operator);
				operator = "";
			} else if (e.getSource() == button8) {
				operator += "ㅇ";
				a = 8;
				t.setText(t.getText() + operator);
				operator = "";
			} else if (e.getSource() == button9) {
				operator += "ㅈ";
				a = 9;
				t.setText(t.getText() + operator);
				operator = "";
			} else if (e.getSource() == button10) {
				operator += "ㅎ";
				a = 10;
				t.setText(t.getText() + operator);
				operator = "";
			} else if (e.getSource() == button11) {

				String test;
				test = t.getText();
				test = test.substring(0, test.length() - 1);
				t.setText(test);

				if (a == 1) {
					operator += "가";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 2) {
					operator += "나";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 3) {
					operator += "다";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 4) {
					operator += "라";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 5) {
					operator += "마";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 6) {
					operator += "바";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 7) {
					operator += "사";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 8) {
					operator += "아";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 9) {
					operator += "자";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 10) {
					operator += "하";
					t.setText(t.getText() + operator);
					operator = "";
				}
			} else if (e.getSource() == button12) {

				String test;
				test = t.getText();
				test = test.substring(0, test.length() - 1);
				t.setText(test);

				if (a == 1) {
					operator += "거";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 2) {
					operator += "너";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 3) {
					operator += "더";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 4) {
					operator += "러";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 5) {
					operator += "머";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 6) {
					operator += "버";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 7) {
					operator += "서";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 8) {
					operator += "어";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 9) {
					operator += "저";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 10) {
					operator += "허";
					t.setText(t.getText() + operator);
					operator = "";
				}
			} else if (e.getSource() == button13) {

				String test;
				test = t.getText();
				test = test.substring(0, test.length() - 1);
				t.setText(test);

				if (a == 1) {
					operator += "고";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 2) {
					operator += "노";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 3) {
					operator += "도";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 4) {
					operator += "로";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 5) {
					operator += "모";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 6) {
					operator += "보";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 7) {
					operator += "소";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 8) {
					operator += "오";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 9) {
					operator += "조";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 10) {
					operator += "호";
					t.setText(t.getText() + operator);
					operator = "";
				}
			} else if (e.getSource() == button14) {

				String test;
				test = t.getText();
				test = test.substring(0, test.length() - 1);
				t.setText(test);

				if (a == 1) {
					operator += "구";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 2) {
					operator += "누";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 3) {
					operator += "두";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 4) {
					operator += "루";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 5) {
					operator += "무";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 6) {
					operator += "부";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 7) {
					operator += "수";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 8) {
					operator += "우";
					t.setText(t.getText() + operator);
					operator = "";
				} else if (a == 9) {
					operator += "주";
					t.setText(t.getText() + operator);
					operator = "";
				}
			} else if (e.getSource() == button15) {

				String test;
				test = t.getText();
				test = test.substring(0, test.length() - 1);
				t.setText(test);

				if (a == 6) {
					operator += "배";
					t.setText(t.getText() + operator);
					operator = "";
				}

			} else if (e.getSource() == button16) {
				operator += "기";
				t.setText(t.getText() + operator);
				operator = "";

			}

			else if (e.getSource() == buttonDel) {
				String test;
				test = t.getText();
				test = test.substring(0, test.length() - 1);
				t.setText(test);

			}

		}

	}
}
