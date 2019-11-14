package System;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

@SuppressWarnings("serial")
public class ParkingSystemGui extends JFrame {
	String Time;
	String location;
	String password;
	String phonenumber;
	String carnumber;

	public void change(String panelName, String... plate) {
		if (plate != null)
			System.out.println(java.util.Arrays.toString(plate));
		
		
		if (panelName.equals("PanelPay")) {
			getContentPane().removeAll();
			getContentPane().add(PanelPay);
			revalidate();
			repaint();
		} 
		else if (panelName.equals("PanelPhoneNumber")) {
			location = plate[0];
			getContentPane().removeAll();
			getContentPane().add(PanelPhoneNumber);
			PanelPhoneNumber.setphonenumber(phonenumber);
			PanelPhoneNumber.setcarnumber(carnumber);
			revalidate();
			repaint();
		}
		else if (panelName.equals("PanelPasswordTwo")) {
			getContentPane().removeAll();
			PanelPasswordTwo.setPassword(password);
			getContentPane().add(PanelPasswordTwo);
			revalidate();
			repaint();
		}
		else if (panelName.equals("PanelPassword")) {
			phonenumber = plate[0];
			getContentPane().removeAll();
			PanelPassword.setPlate(plate == null ? null : plate[0]);
			getContentPane().add(PanelPassword);
			revalidate();
			repaint();
			}
	
		
		else if (panelName.equals("PanelParking")) {
			password = plate[0];
			getContentPane().removeAll();
			PanelParking.setPlate(plate == null ? null : plate[0]);
			PanelParking.setphonenumber(phonenumber);
			PanelParking.setcarnumber(carnumber);
			getContentPane().add(PanelParking);
			revalidate();
			repaint();
		} else if (panelName.equals("PanelParkingKorean")) {
			getContentPane().removeAll();
			PanelParkingKorean.setPlate(plate == null ? null : plate[0]);
			getContentPane().add(PanelParkingKorean);
			revalidate();
			repaint();
		} else if (panelName.equals("PanelParkingTwo")) {
			getContentPane().removeAll();
			PanelParkingTwo.setPlate(plate == null ? null : plate[0]);
			getContentPane().add(PanelParkingTwo);
			revalidate();
			repaint();
		} else if (panelName.equals("PanelParkingEnd")) {
			carnumber = plate[0];
			getContentPane().removeAll();
			PanelParkingEnd.setPlate(plate == null ? null : plate[0]);
			PanelParkingEnd.setLocation(location);
			PanelParkingEnd.setPhoneNumber(phonenumber);
			getContentPane().add(PanelParkingEnd);
			revalidate();
			repaint();
		}

		 else if (panelName.equals("PanelMainTwo")) {
			 	Time = plate[0];
				getContentPane().removeAll();
				PanelMainTwo.setLocation(location);
				getContentPane().add(PanelMainTwo);
				revalidate();
				repaint();
		} else if (panelName.equals("PanelPayEnd")) {
				PanelPayEnd.setTime(Time);
				getContentPane().removeAll();
				getContentPane().add(PanelPayEnd);
				revalidate();
				repaint();		
		} else {
			getContentPane().removeAll();
			getContentPane().add(PanelMain);
			PanelMain.setphonenumber(phonenumber);
			PanelMain.setcarnumber(carnumber);
			revalidate();
			repaint();
			
		}
	}

	public PanelPhoneNumber PanelPhoneNumber = null;
	public PanelPasswordTwo PanelPasswordTwo = null;
	public PanelPassword PanelPassword = null;
	public PanelMain PanelMain = null;
	public PanelParking PanelParking = null;
	public PanelPay PanelPay = null;
	public PanelParkingKorean PanelParkingKorean = null;
	public PanelParkingTwo PanelParkingTwo = null;
	public PanelParkingEnd PanelParkingEnd = null;
	public PanelMainTwo PanelMainTwo = null;
	public PanelPayEnd PanelPayEnd = null;
	public PanelParkingSec PanelParkingSec = null;

	public static void main(String[] args) {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
		}
		ParkingSystemGui win = new ParkingSystemGui();
		win.setTitle("Parking System");
		win.PanelMain = new PanelMain(win);
		win.PanelParking = new PanelParking(win);
		win.PanelPay = new PanelPay(win);
		win.PanelParkingKorean = new PanelParkingKorean(win);
		win.PanelParkingTwo = new PanelParkingTwo(win);
		win.PanelParkingEnd = new PanelParkingEnd(win);
		win.PanelParkingSec = new PanelParkingSec(win);
		win.PanelMainTwo = new PanelMainTwo(win);
		win.PanelPayEnd = new PanelPayEnd(win);
		win.PanelPassword = new PanelPassword(win);
		win.PanelPasswordTwo = new PanelPasswordTwo(win);
		win.PanelPhoneNumber = new PanelPhoneNumber(win);
		win.add(win.PanelMain);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setSize(800, 480);
		win.setVisible(true);
	}
}