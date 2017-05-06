package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import B_proj.Customer;
import B_proj.CustomerController;
import B_proj.NotFoundException;
import B_proj.Subscription;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class UserInfoJFrame extends JFrame {

	private int keyitem = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		CustomerController myCont=new CustomerController();
		try {
			myCont.searchCustomer(44);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Customer myCus=myCont.getCusObj();
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInfoJFrame frame = new UserInfoJFrame(23,myCont);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	
	public UserInfoJFrame(int key,CustomerController myCont) throws NotFoundException, IOException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 265, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		keyitem = key;
		setResizable(false);
		Customer myCus=myCont.getCusObj();
		Subscription mySub=myCont.getNewSub();
		setContentPane(contentPane);
		
		if(myCus.getFirstName()==null)
		{
			setContentPane(contentPane);
			JOptionPane.showMessageDialog(null,"No user Found" );
			JLabel lblError = new JLabel("Error");
			lblError.setBounds(10, 11, 147, 14);
			lblError.add(contentPane);
			throw new NotFoundException("No user Found");
		}
		
		else
		{
		
		JLabel lblName = new JLabel("Name: "+myCont.displayFirstName()+ ", " + myCont.displayLastName());
		lblName.setBounds(10, 11, 147, 14);
		contentPane.add(lblName);
		
		JLabel lblContractLength = new JLabel("Contract Length: ");
		lblContractLength.setBounds(10, 36, 147, 14);
		contentPane.add(lblContractLength);
		
		JLabel lblSubscriptionType = new JLabel("Subscription Type: " + mySub.getPlanType());
		lblSubscriptionType.setBounds(10, 61, 147, 14);
		contentPane.add(lblSubscriptionType);
		
		JLabel lblMonthlyPay = new JLabel("Monthly Fee: " + myCont.displaysubscriptionType());
		lblMonthlyPay.setBounds(10, 86, 147, 14);
		contentPane.add(lblMonthlyPay);
		
		JLabel lblYearsSubscribed = new JLabel("Years Subscribed: ");
		lblYearsSubscribed.setBounds(10, 111, 147, 14);
		contentPane.add(lblYearsSubscribed);
		
		JLabel lblSex = new JLabel("Sex: " + myCont.displaySex());
		lblSex.setBounds(10, 136, 147, 14);
		contentPane.add(lblSex);
		
		JLabel lblPhone = new JLabel("Phone: " + myCont.displayPhoneNumber() );
		lblPhone.setBounds(10, 161, 147, 14);
		contentPane.add(lblPhone);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth: " + myCont.displayDateOfBirth());
		lblDateOfBirth.setBounds(10, 186, 147, 14);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblLiscenseNumber = new JLabel("Liscense Number: " + myCont.displayLicenseNumber());
		lblLiscenseNumber.setBounds(10, 211, 212, 14);
		contentPane.add(lblLiscenseNumber);
		
		JLabel Agelbl = new JLabel("Age: " + myCont.displayAge());
		Agelbl.setBounds(10, 236, 147, 14);
		contentPane.add(Agelbl);
		
		String path = myCont.displayPictureLink();
		URL url = new URL(path);
		BufferedImage image = ImageIO.read(url);
		
		
		JLabel label = new JLabel(new ImageIcon(image.getScaledInstance(100, 100, Image.SCALE_DEFAULT)));

		label.setBounds(40, 261, 176, 119);
		contentPane.add(label);
		
		
		
	
		}
	}


	public int getKeyitem() {
		return keyitem;
	}
}
