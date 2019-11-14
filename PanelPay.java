package System;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import System.PanelPay.MyActionListener;

@SuppressWarnings({ "serial", "unused" })
class PanelPay extends JPanel {

	private ParkingSystemGui win;
	private Font f1;
	private JButton buttonNext;

	public PanelPay(ParkingSystemGui win) {
		setLayout(null);
		this.win = win;

		 ImageIcon ic  = new ImageIcon("C:\\Users\\sudon\\Downloads\\1122.png");
	     JLabel lbImage1  = new JLabel(ic);
	     lbImage1.setBounds(50,50,350,350);
	     add(lbImage1);
		
		JLabel label1 = new JLabel("CCNS - Communication Circuit & System Design");
		label1.setBounds(30, 390, 350, 70);
		f1 = new Font("Segoe Script", Font.PLAIN, 12);
		label1.setFont(f1);

		JLabel label2 = new JLabel("Parking System");
		label2.setBounds(540, 21, 190, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 25);
		label2.setFont(f1);

		JLabel label3 = new JLabel("리더기에 카드를 인식해주세요.");
		label3.setBounds(495, 205, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 20);
		label3.setFont(f1);

		buttonNext = new JButton("다음");
		buttonNext.setSize(70, 70);
		buttonNext.setLocation(550, 350);

		add(label1);
		add(label2);
		add(label3);
		add(buttonNext);

		buttonNext.addActionListener(new MyActionListener());

	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			win.change("PanelPayEnd");
		}
	}
}