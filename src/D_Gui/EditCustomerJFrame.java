package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import B_proj.CustomerController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

// TODO: Auto-generated Javadoc
/**
 * The Class EditCustomerJFrame.
 */
public class EditCustomerJFrame extends JFrame {

	/** The content pane. */
	private JPanel contentPane;
	
	/** The First nametext field. */
	private JTextField FirstNametextField;
	
	/** The Last nametext field. */
	private JTextField LastNametextField;
	
	/** The Addresstext field. */
	private JTextField AddresstextField;
	
	/** The lbl phone number. */
	private JLabel lblPhoneNumber;
	
	/** The Phone numbertext field. */
	private JTextField PhoneNumbertextField;
	
	/** The text field. */
	private JTextField AgetextField;
	private JTextField ContractBegintextField;
	private JLabel lblContractEnd;
	private JTextField ContractEndtextField;
	private JLabel lblUpdateSubscriptionStatus;
	private JComboBox SubStatuscomboBox;
	private JLabel lblDaysRemaining;
	private JTextField DaysRemainingtextField;
	private JLabel lblCreditCardNumber;
	private JTextField CreditCardnumtextField;
	private JLabel lblCreditCardCvv;
	private JTextField CreditCardCVVtextField;
	private JLabel lblCreditCardProvider;
	private JTextField CCProvidertextField;
	private JLabel lblCreditCardExpiration;
	private JTextField CCexpirationtextField;
	private JLabel lblPlanType;
	private JTextField PlanTypetextField;
	private JLabel lblPlanDescription;
	private JTextField PlanDesctextField;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerController myCont= new CustomerController();
					EditCustomerJFrame frame = new EditCustomerJFrame(0, myCont);
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
	public EditCustomerJFrame(int key, CustomerController myCont) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setBounds(10, 14, 175, 14);
		contentPane.add(lblFirstName);
		
		FirstNametextField = new JTextField(myCont.displayFirstName());
		FirstNametextField.setBounds(195, 11, 115, 20);
		contentPane.add(FirstNametextField);
		FirstNametextField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(10, 39, 175, 14);
		contentPane.add(lblLastName);
		
		LastNametextField = new JTextField(myCont.displayLastName());
		LastNametextField.setBounds(195, 36, 115, 20);
		contentPane.add(LastNametextField);
		LastNametextField.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address: ");
		lblAddress.setBounds(10, 64, 175, 14);
		contentPane.add(lblAddress);
		
		AddresstextField = new JTextField(myCont.displayAddress());
		AddresstextField.setBounds(195, 61, 115, 20);
		contentPane.add(AddresstextField);
		AddresstextField.setColumns(10);
		
		lblPhoneNumber = new JLabel("Phone Number: ");
		lblPhoneNumber.setBounds(10, 89, 175, 14);
		contentPane.add(lblPhoneNumber);
		
		PhoneNumbertextField = new JTextField(myCont.displayPhoneNumber());
		PhoneNumbertextField.setBounds(195, 86, 115, 20);
		contentPane.add(PhoneNumbertextField);
		PhoneNumbertextField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age: ");
		lblAge.setBounds(10, 114, 175, 14);
		contentPane.add(lblAge);
		
		AgetextField = new JTextField(myCont.displayAge());
		AgetextField.setBounds(195, 111, 115, 20);
		contentPane.add(AgetextField);
		AgetextField.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex: ");
		lblSex.setBounds(10, 139, 175, 14);
		contentPane.add(lblSex);
		
		String Sex = myCont.displaySex();
		JComboBox SexcomboBox = new JComboBox();
		SexcomboBox.setBounds(271, 136, 39, 20);
		contentPane.add(SexcomboBox);
		if (Sex == "M"){
		SexcomboBox.addItem("M");
		SexcomboBox.addItem("F");
		}
		else{
			SexcomboBox.addItem("F");
			SexcomboBox.addItem("M");
		}
		
		JLabel lblContractBegin = new JLabel("Contract Begin:");
		lblContractBegin.setBounds(10, 192, 175, 14);
		contentPane.add(lblContractBegin);
		
		ContractBegintextField = new JTextField(myCont.displayContractBegin());
		ContractBegintextField.setBounds(195, 189, 115, 20);
		contentPane.add(ContractBegintextField);
		ContractBegintextField.setColumns(10);
		
		lblContractEnd = new JLabel("Contract End:");
		lblContractEnd.setBounds(10, 217, 175, 14);
		contentPane.add(lblContractEnd);
		
		ContractEndtextField = new JTextField(myCont.displayContractEnd());
		ContractEndtextField.setBounds(195, 214, 115, 20);
		contentPane.add(ContractEndtextField);
		ContractEndtextField.setColumns(10);
		
		lblUpdateSubscriptionStatus = new JLabel("Update Subscription Status: ");
		lblUpdateSubscriptionStatus.setBounds(10, 164, 175, 14);
		contentPane.add(lblUpdateSubscriptionStatus);
		
		String SubStatus = myCont.displaySubStatus();
		SubStatuscomboBox = new JComboBox();
		SubStatuscomboBox.setBounds(242, 158, 67, 20);
		contentPane.add(SubStatuscomboBox);
		
		lblDaysRemaining = new JLabel("Days Remaining: ");
		lblDaysRemaining.setBounds(10, 242, 175, 14);
		contentPane.add(lblDaysRemaining);
		
		DaysRemainingtextField = new JTextField();
		DaysRemainingtextField.setBounds(195, 239, 115, 20);
		contentPane.add(DaysRemainingtextField);
		DaysRemainingtextField.setColumns(10);
		
		lblCreditCardNumber = new JLabel("Credit Card Number: ");
		lblCreditCardNumber.setBounds(10, 267, 175, 14);
		contentPane.add(lblCreditCardNumber);
		
		CreditCardnumtextField = new JTextField();
		CreditCardnumtextField.setBounds(195, 264, 115, 20);
		contentPane.add(CreditCardnumtextField);
		CreditCardnumtextField.setColumns(10);
		
		lblCreditCardCvv = new JLabel("Credit Card CVV: ");
		lblCreditCardCvv.setBounds(10, 292, 175, 14);
		contentPane.add(lblCreditCardCvv);
		
		CreditCardCVVtextField = new JTextField();
		CreditCardCVVtextField.setBounds(195, 289, 115, 20);
		contentPane.add(CreditCardCVVtextField);
		CreditCardCVVtextField.setColumns(10);
		
		lblCreditCardProvider = new JLabel("Credit Card Provider: ");
		lblCreditCardProvider.setBounds(10, 317, 167, 14);
		contentPane.add(lblCreditCardProvider);
		
		CCProvidertextField = new JTextField();
		CCProvidertextField.setBounds(195, 314, 115, 20);
		contentPane.add(CCProvidertextField);
		CCProvidertextField.setColumns(10);
		
		lblCreditCardExpiration = new JLabel("Credit Card Expiration: ");
		lblCreditCardExpiration.setBounds(10, 342, 175, 14);
		contentPane.add(lblCreditCardExpiration);
		
		CCexpirationtextField = new JTextField();
		CCexpirationtextField.setBounds(195, 339, 115, 20);
		contentPane.add(CCexpirationtextField);
		CCexpirationtextField.setColumns(10);
		
		lblPlanType = new JLabel("Plan Type: ");
		lblPlanType.setBounds(10, 367, 175, 14);
		contentPane.add(lblPlanType);
		
		PlanTypetextField = new JTextField();
		PlanTypetextField.setBounds(195, 364, 115, 20);
		contentPane.add(PlanTypetextField);
		PlanTypetextField.setColumns(10);
		
		lblPlanDescription = new JLabel("Plan Description: ");
		lblPlanDescription.setBounds(10, 392, 175, 14);
		contentPane.add(lblPlanDescription);
		
		PlanDesctextField = new JTextField();
		PlanDesctextField.setBounds(195, 389, 115, 20);
		contentPane.add(PlanDesctextField);
		PlanDesctextField.setColumns(10);
		
		
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(117, 443, 89, 23);
		contentPane.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}
}
