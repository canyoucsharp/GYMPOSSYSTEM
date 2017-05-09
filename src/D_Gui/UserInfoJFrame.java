package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.NumberFormat;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import B_proj.Customer;
import B_proj.CustomerController;
import B_proj.NotFoundException;
import B_proj.OperationsController;
import B_proj.Subscription;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

// TODO: Auto-generated Javadoc
/**
 * The Class UserInfoJFrame.
 */
public class UserInfoJFrame extends JFrame {

	/** Scan User includes an edit for it **/
	private EditCustomerJFrame EditCus = null;
	
	/** The keyitem. */
	private int keyitem = 0;
	
	/** The content pane. */
	private JPanel contentPane;
	
	/** The my operation. */
	OperationsController myOperation = new OperationsController();
	
	private double pricing;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
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
	 *
	 * @param key the key
	 * @param myCont the my cont
	 * @throws NotFoundException the not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	
	public UserInfoJFrame(int key,CustomerController myCont) throws NotFoundException, IOException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 335, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		keyitem = key;
		setResizable(false);
		Customer myCus=myCont.getCusObj();
		Subscription mySub=myCont.getNewSub();
		setContentPane(contentPane);
		
		
		
		JLabel lblName = new JLabel("Name: "+myCont.displayFirstName()+ ", " + myCont.displayLastName());
		lblName.setBounds(10, 11, 283, 14);
		contentPane.add(lblName);
		
		JLabel lblContractLength = new JLabel("Remaining Days: " + myCont.displaySubRemaining() + " days");
		lblContractLength.setBounds(10, 36, 283, 14);
		contentPane.add(lblContractLength);
		

		JLabel lblSubscriptionType = new JLabel();
		lblSubscriptionType.setBounds(10, 61, 283, 14);
		contentPane.add(lblSubscriptionType);
		
		String Plantype = mySub.getPlanType();
		if (Plantype != null){
		switch(Plantype){
		case "1":
		{
			lblSubscriptionType.setText("Subscription Type: Standard");
			pricing = myCont.updatePlanRateDummy(myOperation.displayMonthlyCost(), Integer.parseInt(Plantype));
			break;
		}
		case "2":
		{
			lblSubscriptionType.setText("Subscription Type: Deluxe");
			pricing = myCont.updatePlanRateDummy(myOperation.displayMonthlyCost(), Integer.parseInt(Plantype));
			break;
		}
		case "3":
		{
			lblSubscriptionType.setText("Subscription Type: Super Deluxe");
			pricing = myCont.updatePlanRateDummy(myOperation.displayMonthlyCost(), Integer.parseInt(Plantype));
			break;
		}
		case "null":
		{
			lblSubscriptionType.setText("Subscription Type: None");
			pricing = 0;
			break;
		}
		}
		}
		else
		{
			lblSubscriptionType.setText("Subscription Type: None");
			pricing = 0;
		}
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		
		//myCont.updatePlanRate(myOperation.displayMonthlyCost());
		JLabel lblMonthlyPay = new JLabel("Monthly Fee: " + formatter.format(pricing));
		lblMonthlyPay.setBounds(10, 86, 283, 14);
		contentPane.add(lblMonthlyPay);
		
		JLabel lblSex = new JLabel("Sex: " + myCont.displaySex());
		lblSex.setBounds(10, 186, 283, 14);
		contentPane.add(lblSex);
		
		JLabel lblPhone = new JLabel("Phone: " + myCont.displayPhoneNumber() );
		lblPhone.setBounds(10, 211, 283, 14);
		contentPane.add(lblPhone);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth: " + myCont.displayDateOfBirth());
		lblDateOfBirth.setBounds(10, 236, 283, 14);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblLiscenseNumber = new JLabel("Liscense Number: " + myCont.displayLicenseNumber());
		lblLiscenseNumber.setBounds(10, 261, 283, 14);
		contentPane.add(lblLiscenseNumber);
		
		JLabel Agelbl = new JLabel("Age: " + myCont.displayAge());
		Agelbl.setBounds(10, 286, 283, 14);
		contentPane.add(Agelbl);
		
		JLabel lblBeginningContractDate = new JLabel("Beginning Contract Date: " + myCont.displayContractBegin());
		lblBeginningContractDate.setBounds(10, 111, 283, 14);
		contentPane.add(lblBeginningContractDate);
		
		JLabel lblEndingContractDate = new JLabel("Ending Contract Date: " + myCont.displayContractEnd());
		lblEndingContractDate.setBounds(10, 136, 283, 14);
		contentPane.add(lblEndingContractDate);
		
		JLabel lblSubscriptionStatus = new JLabel("Subscription Status: " + myCont.displaySubStatus());
		lblSubscriptionStatus.setBounds(10, 161, 283, 14);
		contentPane.add(lblSubscriptionStatus);
		
		//Catching null picture statements
		String path = myCont.displayPictureLink();
		if (path == " " || path == ""){
			path = "https://image.freepik.com/free-icon/question-mark_318-52837.jpg";
		}
		//
		
		URL url = new URL("http://i.imgur.com/YYnOoKf.jpg");
		BufferedImage image = ImageIO.read(url);
		
		
		JLabel label = new JLabel(new ImageIcon(image.getScaledInstance(250, 100, Image.SCALE_DEFAULT)));

		label.setBounds(20, 311, 273, 139);
		contentPane.add(label);
		
		if (EditCus != null)
		{
			EditCus.dispose();
		}
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(111, 452, 89, 23);
		contentPane.add(btnEdit);
		btnEdit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (EditCus != null){
					EditCus.dispose();
				}
				EditCus = new EditCustomerJFrame(key, myCont, myOperation, mySub);
				EditCus.setVisible(true);
				dispose();
			}
			
		});
		
		
	
	}


	/**
	 * Gets the keyitem.
	 *
	 * @return the keyitem
	 */
	public int getKeyitem() {
		return keyitem;
	}
}
