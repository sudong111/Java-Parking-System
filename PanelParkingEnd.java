package System;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.Timer;
import javax.swing.*;
import System.PanelParkingEnd.MyActionListener;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;

import net.nurigo.java_sdk.Coolsms;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;
import org.json.simple.JSONObject;

@SuppressWarnings({ "serial", "unused" })
class PanelParkingEnd extends JPanel {
	
	private ParkingSystemGui win;
	private Font f1;
	private JButton buttonNext;
	public String Number = "";
	public JTextField t;
	JLabel locationLabel;
	JLabel labelNumber;
	JLabel labelTime;
	
	public void setPlate(String plate) {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		labelTime.setText(format1.format(new Date()));
		
		t.setText(plate);
		labelNumber.setText(plate);
		System.out.println(plate);
		
	}
	
	public void setLocation(String location) {
		locationLabel.setText(location);
	}
	
	public void setPhoneNumber(String phonenumber) {
		  String api_key = "NCSTTAS6PHWLKKYR";
		    String api_secret = "TNNMMVP8VAKPFKUSL803OBKSILBNBHYX";
		    Message coolsms = new Message(api_key, api_secret);

		    
		    HashMap<String, String> params = new HashMap<String, String>();
		    params.put("to", phonenumber);
		    params.put("from", "01040683530");
		    params.put("type", "SMS");
		    params.put("text", "CBNU Parking System 입니다. 귀하의 차량이 주차되었습니다. 감사합니다.");
		    params.put("app_version", "test app 1.2"); // application name and version

		    try {
		      JSONObject obj = (JSONObject) coolsms.send(params);
		      System.out.println(obj.toString());
		    } catch (CoolsmsException e) {
		      System.out.println(e.getMessage());
		      System.out.println(e.getCode());
		    }
		  }



	public PanelParkingEnd(ParkingSystemGui win) {
		setLayout(null);
		this.win = win;
		
		labelNumber = new JLabel();
		labelNumber.setBounds(230, 140, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 15);
		labelNumber.setFont(f1);

		JLabel label1 = new JLabel("CCNS - Communication Circuit & System Design");
		label1.setBounds(30, 390, 350, 70);
		f1 = new Font("Segoe Script", Font.PLAIN, 12);
		label1.setFont(f1);

		JLabel label2 = new JLabel("Parking System");
		label2.setBounds(540, 21, 190, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 25);
		label2.setFont(f1);

		JLabel label3 = new JLabel("주차가 완료되었습니다.");
		label3.setBounds(515, 205, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 20);
		label3.setFont(f1);

		JLabel label4 = new JLabel("주차한 차량번호 :");
		label4.setBounds(100, 140, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 15);
		label4.setFont(f1);

		JLabel label5 = new JLabel("주차한 시간 :");
		label5.setBounds(128, 170, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 15);
		label5.setFont(f1);

		labelTime = new JLabel();
		labelTime.setBounds(230, 170, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 15);
		labelTime.setFont(f1);

		JLabel label6 = new JLabel("주차한 자리 :");
		label6.setBounds(128, 200, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 15);
		label6.setFont(f1);

		locationLabel = new JLabel();
		locationLabel.setBounds(230, 200, 290, 70);
		f1 = new Font("함초롱바탕", Font.PLAIN, 15);
		locationLabel.setFont(f1);

		t = new JTextField(5);
		t.setBounds(550, 150, 145, 50);
		f1 = new Font("돋움", Font.PLAIN, 30);
		t.setFont(f1);

		buttonNext = new JButton("처음으로");
		buttonNext.setSize(140, 70);
		buttonNext.setLocation(550, 350);

		add(label1);
		add(label2);
		add(label3);
		add(label4);
		add(label5);
		add(label6);
		add(labelNumber);
		add(locationLabel);
		add(labelTime);
		add(buttonNext);

		buttonNext.addActionListener(new MyActionListener());

	}

	
	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

		String Time = labelTime.getText();
			
			win.change("PanelMainTwo",Time);
			System.out.println(Time);
		}
	}
}