package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;

import javax.security.sasl.SaslException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import controller.CustomerController;
import controller.NotFoundException;
import controller.OperationsController;

// TODO: Auto-generated Javadoc
/**
 * The Class NewUserJFrame.
 */
public class NewUserJFrame extends JFrame {

	/** The Sub typenum. */
	int SubTypenum = 0;
	
	/** The New cus. */
	private CustomerController NewCus = new CustomerController();
	
	/** The pricing. */
	private double pricing;

	/** The Provider Id. **/
	private int Provider;
	
	
	/** The content pane. */
	private JPanel contentPane;
	
	/** The First nametext field. */
	private JTextField FirstNametextField;
	
	/** The Last nametext field. */
	private JTextField LastNametextField;
	
	/** The DO btext field. */
	private JTextField DOBtextField;
	
	/** The Phone numbertext field. */
	private JTextField PhoneNumbertextField;
	
	/** The CC numbertext field. */
	private JTextField CCNumbertextField;
	
	/** The Picture linktext field. */
	private JTextField PictureLinktextField;
	
	/** The Address text field. */
	private JTextField AddressTextField;
	
	/** The Age text field. */
	private JTextField AgeTextField;
	
	/** The Client idtext field. */
	private JTextField ClientIdtextField;
	
	/** The Credit card numberpassword field. */
	private JPasswordField CreditCardNumberpasswordField;
	
	/** The Card holders name. */
	private JTextField CardHoldersName;
	
	/** The CV vpassword field. */
	private JPasswordField CVVpasswordField;
	private JTextField ExpirationtextField;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUserJFrame frame = new NewUserJFrame();
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
	 * @throws NotFoundException the not found exception
	 */
	public NewUserJFrame() throws NotFoundException {
		OperationsController opCont = new OperationsController();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 528, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 38, 102, 14);
		contentPane.add(lblFirstName);
		
		FirstNametextField = new JTextField();
		FirstNametextField.setBounds(146, 32, 86, 20);
		contentPane.add(FirstNametextField);
		FirstNametextField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(10, 69, 102, 14);
		contentPane.add(lblLastName);
		
		LastNametextField = new JTextField();
		LastNametextField.setBounds(146, 63, 86, 20);
		contentPane.add(LastNametextField);
		LastNametextField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("M");
		comboBox.addItem("F");
		comboBox.setBounds(146, 94, 86, 20);
		contentPane.add(comboBox);
		
		JLabel lblSex = new JLabel("Sex: ");
		lblSex.setBounds(10, 100, 102, 14);
		contentPane.add(lblSex);
		
		JLabel lblDob = new JLabel("DOB:(YYYY/MM/DD)  ");
		lblDob.setBounds(10, 144, 126, 14);
		contentPane.add(lblDob);
		
		//Need to set-up date format************
		DOBtextField = new JTextField();
		DOBtextField.setBounds(146, 138, 86, 20);
		contentPane.add(DOBtextField);
		DOBtextField.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone: ");
		lblPhone.setBounds(10, 181, 102, 14);
		contentPane.add(lblPhone);
		
		
		//Need to set-up phone number format************
		PhoneNumbertextField = new JTextField();
		PhoneNumbertextField.setBounds(146, 175, 86, 20);
		contentPane.add(PhoneNumbertextField);
		PhoneNumbertextField.setColumns(10);
		
		JLabel lblLiscNumber = new JLabel("Driver's License: ");
		lblLiscNumber.setBounds(10, 228, 115, 14);
		contentPane.add(lblLiscNumber);
		
		CCNumbertextField = new JTextField();
		CCNumbertextField.setBounds(146, 222, 86, 20);
		contentPane.add(CCNumbertextField);
		CCNumbertextField.setColumns(10);
		
		JLabel lblPictureLink = new JLabel("Picture Link: ");
		lblPictureLink.setBounds(10, 268, 102, 14);
		contentPane.add(lblPictureLink);
		
		PictureLinktextField = new JTextField();
		PictureLinktextField.setBounds(146, 262, 86, 20);
		contentPane.add(PictureLinktextField);
		PictureLinktextField.setColumns(10);
		PictureLinktextField.setText(" ");
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(79, 414, 89, 23);
		contentPane.add(btnRegister);
		
		
		AddressTextField = new JTextField();
		AddressTextField.setBounds(146, 301, 86, 20);
		contentPane.add(AddressTextField);
		AddressTextField.setColumns(10);
		
		
		
		
		JLabel lblAddress = new JLabel("Address: ");
		lblAddress.setBounds(10, 307, 102, 14);
		contentPane.add(lblAddress);
		
		JLabel lblAge = new JLabel("Age: ");
		lblAge.setBounds(10, 349, 102, 14);
		contentPane.add(lblAge);
		
		AgeTextField = new JTextField();
		AgeTextField.setBounds(146, 343, 86, 20);
		contentPane.add(AgeTextField);
		AgeTextField.setColumns(10);
		
		JLabel lblClientId = new JLabel("Client Id: ");
		lblClientId.setBounds(10, 386, 102, 14);
		contentPane.add(lblClientId);
		
		ClientIdtextField = new JTextField();
		ClientIdtextField.setBounds(146, 383, 86, 20);
		contentPane.add(ClientIdtextField);
		ClientIdtextField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(271, 17, 25, 368);
		contentPane.add(separator);
		
		JLabel lblSubscriptionInfo = new JLabel("Subscription Info");
		lblSubscriptionInfo.setBounds(350, 13, 125, 14);
		contentPane.add(lblSubscriptionInfo);
		
		JLabel lblNewCustomerInfo = new JLabel("New Customer Info");
		lblNewCustomerInfo.setBounds(79, 13, 109, 14);
		contentPane.add(lblNewCustomerInfo);
		
		JLabel SubTypelbl = new JLabel("Subscription Type:");
		SubTypelbl.setBounds(284, 76, 115, 14);
		contentPane.add(SubTypelbl);
		SubTypelbl.setVisible(false);
		
		
		JLabel SubActivelbl = new JLabel("Subsription");
		SubActivelbl.setBounds(284, 38, 102, 14);
		contentPane.add(SubActivelbl);
		
		JComboBox SubActiveCombo = new JComboBox();
		SubActiveCombo.setBounds(409, 35, 85, 20);
		contentPane.add(SubActiveCombo);
		SubActiveCombo.addItem("Inactive");
		SubActiveCombo.addItem("Active");
		
		JComboBox SubTypecomboBox = new JComboBox();
		SubTypecomboBox.setBounds(409, 73, 85, 20);
		contentPane.add(SubTypecomboBox);
		SubTypecomboBox.setVisible(false);
		SubTypecomboBox.addItem("Standard");
		SubTypecomboBox.addItem("Deluxe");
		SubTypecomboBox.addItem("Super Deluxe");
		
		JLabel Lengthlbl = new JLabel("Length: ");
		Lengthlbl.setBounds(337, 118, 138, 14);
		contentPane.add(Lengthlbl);
		Lengthlbl.setVisible(false);
		
		JLabel Costlbl = new JLabel("Cost: ");
		Costlbl.setBounds(340, 144, 135, 14);
		contentPane.add(Costlbl);
		Costlbl.setVisible(false);
		
		JLabel lblCardNumber = new JLabel("Card Number");
		lblCardNumber.setBounds(316, 217, 159, 14);
		contentPane.add(lblCardNumber);
		lblCardNumber.setVisible(false);
		
		CreditCardNumberpasswordField = new JPasswordField();
		CreditCardNumberpasswordField.setBounds(317, 242, 158, 20);
		contentPane.add(CreditCardNumberpasswordField);
		CreditCardNumberpasswordField.setVisible(false);
		
		JLabel lblCardHoldersName = new JLabel("Card Holder's Name");
		lblCardHoldersName.setBounds(316, 276, 158, 14);
		contentPane.add(lblCardHoldersName);
		lblCardHoldersName.setVisible(false);
		
		CardHoldersName = new JTextField();
		CardHoldersName.setBounds(317, 301, 158, 20);
		contentPane.add(CardHoldersName);
		CardHoldersName.setColumns(10);
		CardHoldersName.setVisible(false);
		
		JLabel lblCVVnumber = new JLabel("CVV Number");
		lblCVVnumber.setBounds(316, 340, 159, 14);
		contentPane.add(lblCVVnumber);
		lblCVVnumber.setVisible(false);
		
		CVVpasswordField = new JPasswordField();
		CVVpasswordField.setBounds(316, 365, 50, 20);
		contentPane.add(CVVpasswordField);
		CVVpasswordField.setVisible(false);
		
		JLabel lblProvider = new JLabel("Provider ");
		lblProvider.setBounds(316, 181, 70, 14);
		contentPane.add(lblProvider);
		lblProvider.setVisible(false);
		
		JComboBox ProvidercomboBox = new JComboBox();
		ProvidercomboBox.setBounds(409, 178, 70, 20);
		contentPane.add(ProvidercomboBox);
		ProvidercomboBox.addItem("Visa");
		ProvidercomboBox.addItem("Mastercard");
		ProvidercomboBox.addItem("American Express");
		ProvidercomboBox.addItem("Discover");
		ProvidercomboBox.setVisible(false);
		
		ProvidercomboBox.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (ProvidercomboBox.getSelectedItem() == "Visa")
					Provider = 0;
				if (ProvidercomboBox.getSelectedItem() == "Mastercard")
					Provider = 1;
				if (ProvidercomboBox.getSelectedItem() == "American Express")
					Provider = 2;
				if (ProvidercomboBox.getSelectedItem() == "Discover")
					Provider = 3;
			}
		});
		
		JLabel lblExpiration = new JLabel("Expiration MM/YY");
		lblExpiration.setBounds(409, 340, 92, 14);
		contentPane.add(lblExpiration);
		lblExpiration.setVisible(false);
		
		ExpirationtextField = new JTextField();
		ExpirationtextField.setBounds(425, 365, 50, 20);
		contentPane.add(ExpirationtextField);
		ExpirationtextField.setColumns(10);
		ExpirationtextField.setVisible(false);
		
		
		
		
		
		SubActiveCombo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (SubActiveCombo.getSelectedItem() == "Active")
				{
					SubTypelbl.setVisible(true);
					SubTypecomboBox.setVisible(true);
					Lengthlbl.setVisible(true);
					Costlbl.setVisible(true);
					lblProvider.setVisible(true);
					ProvidercomboBox.setVisible(true);
					
					
					lblCardNumber.setVisible(true);
					CreditCardNumberpasswordField.setVisible(true);
					lblCardHoldersName.setVisible(true);
					CardHoldersName.setVisible(true);
					lblCVVnumber.setVisible(true);
					CVVpasswordField.setVisible(true);
					lblExpiration.setVisible(true);
					ExpirationtextField.setVisible(true);
				}
				else
				{
					SubTypelbl.setVisible(false);
					SubTypecomboBox.setVisible(false);
					Lengthlbl.setVisible(false);
					Costlbl.setVisible(false);
					lblProvider.setVisible(false);
					ProvidercomboBox.setVisible(false);

					
					lblCardNumber.setVisible(false);
					CreditCardNumberpasswordField.setVisible(false);
					lblCardHoldersName.setVisible(false);
					CardHoldersName.setVisible(false);
					lblCVVnumber.setVisible(false);
					CVVpasswordField.setVisible(false);
					lblExpiration.setVisible(false);
					ExpirationtextField.setVisible(false);
					CVVpasswordField.setText("");
					CardHoldersName.setText("");
					CreditCardNumberpasswordField.setText("");
					ProvidercomboBox.setSelectedItem("Visa");
					lblExpiration.setText("");
				}
			}
			
		});
		
		
		SubTypecomboBox.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (SubTypecomboBox.getSelectedItem() == "Standard")
				{
					NumberFormat formatter = NumberFormat.getCurrencyInstance();
					Lengthlbl.setText("Length: 12 Months");
					SubTypenum = 1;
					pricing = NewCus.updatePlanRateDummy(opCont.displayMonthlyCost(), SubTypenum);
					Costlbl.setText("Cost: " + formatter.format(pricing));
					
				}
				else if(SubTypecomboBox.getSelectedItem() == "Deluxe")
				{
					NumberFormat formatter = NumberFormat.getCurrencyInstance();
					Lengthlbl.setText("Length: 24 Months");
					SubTypenum = 2;
					pricing = NewCus.updatePlanRateDummy(opCont.displayMonthlyCost(), SubTypenum);
					Costlbl.setText("Cost: " + formatter.format(pricing));
				}
				else if(SubTypecomboBox.getSelectedItem() == "Super Deluxe")
				{
					NumberFormat formatter = NumberFormat.getCurrencyInstance();
					Lengthlbl.setText("Length: No Contract");
					SubTypenum = 3;
					pricing = NewCus.updatePlanRateDummy(opCont.displayMonthlyCost(), SubTypenum);
					Costlbl.setText("Cost: " + formatter.format(pricing));
				}
			
			}
			});
		
		
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Call statement to push data to DataBase
				
				String Sex = comboBox.getSelectedItem().toString();
				int Age = Integer.parseInt(AgeTextField.getText());
				int ClientId = Integer.parseInt(ClientIdtextField.getText());
				String picturelink = "http://www.politicspa.com/wp-content/uploads/2013/02/Silhouette-question-mark.jpeg";
				
				if (PictureLinktextField.getText().compareTo(" ") != 0 && PictureLinktextField.getText().compareTo("") != 0)
				{
					picturelink = PictureLinktextField.getText();
				}
				
				try {
					NewCus.newCustomer(FirstNametextField.getText(), LastNametextField.getText(), Sex, DOBtextField.getText(), PhoneNumbertextField.getText(), picturelink, AddressTextField.getText(), Age, 1, CCNumbertextField.getText(), ClientId);
					if (SubActiveCombo.getSelectedItem() == "Active")
					{
						try{
							String Subnumber = Integer.toString(SubTypenum);
							String ActiveSub = (String) SubActiveCombo.getSelectedItem();
							String SubType = (String) SubTypecomboBox.getSelectedItem();
							
							
							try {
								NewCus.newSubscription(ClientId, ActiveSub, Subnumber, Subnumber);
								NewCus.newPayment(CreditCardNumberpasswordField.getText(), Provider, CVVpasswordField.getText(), ExpirationtextField.getText());
								//NewCus.newMembership(Subnumber, SubType, pricing);
							} catch (NumberFormatException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (java.text.ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						catch (SQLException e)
						{
							JOptionPane.showMessageDialog(null,"Error Subscription Registration");
							e.printStackTrace();
						}
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null,"Error Resgistering New Customer");
					e.printStackTrace();
				}
						
				
				
				//Resets fields once registered
				PictureLinktextField.setText("");
				CCNumbertextField.setText("");
				PhoneNumbertextField.setText("");
				DOBtextField.setText("");
				LastNametextField.setText("");
				FirstNametextField.setText("");
				AgeTextField.setText("");
				AddressTextField.setText("");
				CVVpasswordField.setText("");
				CardHoldersName.setText("");
				CreditCardNumberpasswordField.setText("");
				ClientIdtextField.setText("");
				hide();
				
			}
		});
		
		
		
		
		
	}
}
