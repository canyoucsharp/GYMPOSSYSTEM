package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;

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
	private ErrorJPanel Errorpage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		CustomerController myCont=new CustomerController();
		try {
			myCont.searchCustomer(23);
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
	 */
	
	public UserInfoJFrame(int key,CustomerController myCont) throws NotFoundException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 362, 335);
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
			setContentPane(Errorpage);
			JOptionPane.showMessageDialog(null,"No user Found" );
			JLabel lblError = new JLabel("Error");
			lblError.setBounds(10, 11, 147, 14);
			lblError.add(contentPane);
			throw new NotFoundException("No user Found");
		}
		
		else
		{
		
		JLabel lblName = new JLabel("Name: "+myCus.getFirstName()+ ", " + myCus.getLastName());
		lblName.setBounds(10, 11, 147, 14);
		contentPane.add(lblName);
		
		JLabel lblContractLength = new JLabel("Contract Length: ");
		lblContractLength.setBounds(10, 36, 147, 14);
		contentPane.add(lblContractLength);
		
		JLabel lblSubscriptionType = new JLabel("Subscription Type: " + mySub.getPlanType());
		lblSubscriptionType.setBounds(10, 61, 147, 14);
		contentPane.add(lblSubscriptionType);
		
		JLabel lblMonthlyPay = new JLabel("Monthly Pay: " + myCont.displaysubscriptionType());
		lblMonthlyPay.setBounds(10, 86, 147, 14);
		contentPane.add(lblMonthlyPay);
		
		JLabel lblYearsSubscribed = new JLabel("Years Subscribed: ");
		lblYearsSubscribed.setBounds(10, 111, 147, 14);
		contentPane.add(lblYearsSubscribed);
		
		JLabel lblSex = new JLabel("Sex: " + myCont.displaySex());
		lblSex.setBounds(10, 136, 147, 14);
		contentPane.add(lblSex);
		
		JLabel lblPhone = new JLabel("Phone: " + myCont.displayPhoneNumber());
		lblPhone.setBounds(10, 161, 147, 14);
		contentPane.add(lblPhone);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth: ");
		lblDateOfBirth.setBounds(10, 186, 147, 14);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblLiscenseNumber = new JLabel("Liscense Number: " + key);
		lblLiscenseNumber.setBounds(10, 211, 212, 14);
		contentPane.add(lblLiscenseNumber);
		}
	}


	public int getKeyitem() {
		return keyitem;
	}


}
