package System;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import System.PanelPayEnd.MyActionListener;

@SuppressWarnings({ "serial", "unused" })
class PanelPayEnd extends JPanel {

	private ParkingSystemGui win;
	private Font f1;
	private JButton buttonNext;

	public void setTime(String Time) {
		System.out.println(Time);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String outTime;
		
		outTime = (format1.format(new Date()));
		String inTimeTest = Time.substring(11, Time.length());
		String inTimeTestOne = inTimeTest.replace(":", "");
		String outTimeTest = outTime.substring(11, Time.length());
		String outTimeTestOne = outTimeTest.replace(":", "");
		
		String outTimeHour = outTimeTestOne.substring(0,2);
		String outTimeMin = outTimeTestOne.substring(2,4);
		String outTimeSec = outTimeTestOne.substring(4,6);
		String inTimeHour = inTimeTestOne.substring(0,2);
		String inTimeMin = inTimeTestOne.substring(2,4);
		String inTimeSec = inTimeTestOne.substring(4,6);
		
		int outTimeHourInt = Integer.parseInt(outTimeHour);
		int outTimeMinInt = Integer.parseInt(outTimeMin);
		int outTimeSecInt = Integer.parseInt(outTimeSec);
		int inTimeHourInt = Integer.parseInt(inTimeHour);
		int inTimeMinInt = Integer.parseInt(inTimeMin);
		int inTimeSecInt = Integer.parseInt(inTimeSec);
		
		int PayHour = 0;
		int PayMin = 0;
		int PaySec = 0;
		
		PayHour = (outTimeHourInt - inTimeHourInt) * 3600;
		PayMin = (outTimeMinInt - inTimeMinInt) * 60;
		PaySec = (outTimeSecInt - inTimeSecInt);
		
		int	AllPay = PayHour + PayMin + PaySec;
		int Pay = AllPay * 10;

		String timeNum = String.valueOf(Pay);
		
		JLabel labelWon = new JLabel("¡÷¬˜ ø‰±›  :");
		labelWon.setBounds(495, 175, 290, 70);
		f1 = new Font("«‘√ ∑’πŸ≈¡", Font.PLAIN, 15);
		labelWon.setFont(f1);
		
		JLabel labelPay = new JLabel(timeNum);
		labelPay.setBounds(625, 175, 290, 70);
		f1 = new Font("«‘√ ∑’πŸ≈¡", Font.PLAIN, 15);
		labelPay.setFont(f1);
		
		JLabel labelPay2 = new JLabel("ø¯");
		labelPay2.setBounds(645, 175, 290, 70);
		f1 = new Font("«‘√ ∑’πŸ≈¡", Font.PLAIN, 15);
		labelPay2.setFont(f1);
		
		JLabel labelPay3 = new JLabel("¡÷¬˜«— Ω√∞£ :");
		labelPay3.setBounds(495, 115, 290, 70);
		f1 = new Font("«‘√ ∑’πŸ≈¡", Font.PLAIN, 15);
		labelPay3.setFont(f1);
		
		JLabel labelPay4 = new JLabel(Time);
		labelPay4.setBounds(595, 115, 290, 70);
		f1 = new Font("«‘√ ∑’πŸ≈¡", Font.PLAIN, 15);
		labelPay4.setFont(f1);
		
		JLabel labelPay5 = new JLabel(outTime);
		labelPay5.setBounds(595, 145, 290, 70);
		f1 = new Font("«‘√ ∑’πŸ≈¡", Font.PLAIN, 15);
		labelPay5.setFont(f1);
		
		add(labelPay);
		add(labelPay2);
		add(labelPay3);
		add(labelPay4);
		add(labelPay5);
		add(labelWon);
		
		System.out.println(Time);
		
		
		
	}
	
	public PanelPayEnd(ParkingSystemGui win) {
		setLayout(null);
		this.win = win;
		
		JLabel labelTime = new JLabel();
		labelTime.setBounds(595, 145, 290, 70);
		f1 = new Font("«‘√ ∑’πŸ≈¡", Font.PLAIN, 15);
		labelTime.setFont(f1);
		
		JLabel label4 = new JLabel("√‚¬˜«— Ω√∞£ :");
		label4.setBounds(495, 145, 290, 70);
		f1 = new Font("«‘√ ∑’πŸ≈¡", Font.PLAIN, 15);
		label4.setFont(f1);
		
		 ImageIcon ic  = new ImageIcon("C:\\Users\\sudon\\Downloads\\1333.png");
	     JLabel lbImage1  = new JLabel(ic);
	     lbImage1.setBounds(50,50,350,355);
	     add(lbImage1);
		
		JLabel label1 = new JLabel("CCNS - Communication Circuit & System Design");
		label1.setBounds(30, 390, 350, 70);
		f1 = new Font("Segoe Script", Font.PLAIN, 12);
		label1.setFont(f1);

		JLabel label2 = new JLabel("Parking System");
		label2.setBounds(540, 21, 190, 70);
		f1 = new Font("«‘√ ∑’πŸ≈¡", Font.PLAIN, 25);
		label2.setFont(f1);

		JLabel label3 = new JLabel("¿ÃøÎ«ÿ ¡÷º≈º≠ ∞®ªÁ«’¥œ¥Ÿ.");
		label3.setBounds(495, 205, 290, 70);
		f1 = new Font("«‘√ ∑’πŸ≈¡", Font.PLAIN, 20);
		label3.setFont(f1);

		buttonNext = new JButton("√≥¿Ω¿∏∑Œ");
		buttonNext.setSize(140, 70);
		buttonNext.setLocation(550, 350);


		add(label1);
		add(label2);
		add(label3);
		add(label4);
		add(labelTime);
	    add(buttonNext);
	    
		buttonNext.addActionListener(new MyActionListener());

	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			win.change("PanelMain");
		}
	}
}