package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class UserInfoJFrame extends JFrame {

	private int keyitem = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInfoJFrame frame = new UserInfoJFrame(123);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 */
	
	public UserInfoJFrame(int key) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 362, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		keyitem = key;
		setResizable(false);
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setBounds(10, 11, 147, 14);
		contentPane.add(lblName);
		
		JLabel lblContractLength = new JLabel("Contract Length: ");
		lblContractLength.setBounds(10, 36, 147, 14);
		contentPane.add(lblContractLength);
		
		JLabel lblSubscriptionType = new JLabel("Subscription Type: ");
		lblSubscriptionType.setBounds(10, 61, 147, 14);
		contentPane.add(lblSubscriptionType);
		
		JLabel lblMonthlyPay = new JLabel("Monthly Pay: ");
		lblMonthlyPay.setBounds(10, 86, 147, 14);
		contentPane.add(lblMonthlyPay);
		
		JLabel lblYearsSubscribed = new JLabel("Years Subscribed: ");
		lblYearsSubscribed.setBounds(10, 111, 147, 14);
		contentPane.add(lblYearsSubscribed);
		
		JLabel lblSex = new JLabel("Sex: ");
		lblSex.setBounds(10, 136, 147, 14);
		contentPane.add(lblSex);
		
		JLabel lblPhone = new JLabel("Phone: ");
		lblPhone.setBounds(10, 161, 147, 14);
		contentPane.add(lblPhone);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth: ");
		lblDateOfBirth.setBounds(10, 186, 147, 14);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblLiscenseNumber = new JLabel("Liscense Number: " + key);
		lblLiscenseNumber.setBounds(10, 211, 212, 14);
		contentPane.add(lblLiscenseNumber);
	}


	public int getKeyitem() {
		return keyitem;
	}


}
