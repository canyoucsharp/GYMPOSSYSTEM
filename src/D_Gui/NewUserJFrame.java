package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;

import javax.security.sasl.SaslException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import B_proj.CustomerController;

public class NewUserJFrame extends JFrame {

	int SubTypenum = 0;
	CustomerController NewCus = new CustomerController();
	
	
	private JPanel contentPane;
	private JTextField FirstNametextField;
	private JTextField LastNametextField;
	private JTextField DOBtextField;
	private JTextField PhoneNumbertextField;
	private JTextField CCNumbertextField;
	private JTextField PictureLinktextField;
	private JTextField AddressTextField;
	private JTextField AgeTextField;
	private JTextField ClientIdtextField;

	/**
	 * Launch the application.
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
	 */
	public NewUserJFrame() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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
		
		JLabel lblDob = new JLabel("DOB: ");
		lblDob.setBounds(10, 144, 102, 14);
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
		
		JLabel lblLiscNumber = new JLabel("Driver's Liscense: ");
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
		SubTypecomboBox.addItem("Standard");
		SubTypecomboBox.addItem("Deluxe");
		SubTypecomboBox.addItem("Super Deluxe");
		
		JLabel Lengthlbl = new JLabel("Length: ");
		Lengthlbl.setBounds(337, 118, 96, 14);
		contentPane.add(Lengthlbl);
		Lengthlbl.setVisible(false);
		SubTypecomboBox.setVisible(false);
		
		
		
		SubActiveCombo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (SubActiveCombo.getSelectedItem() == "Active")
				{
					SubTypelbl.setVisible(true);
					SubTypecomboBox.setVisible(true);
					Lengthlbl.setVisible(true);
					
				}
				else
				{
					SubTypelbl.setVisible(false);
					SubTypecomboBox.setVisible(false);
					Lengthlbl.setVisible(false);

				}
			}
			
		});
		
		SubTypecomboBox.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (SubTypecomboBox.getSelectedItem() == "Standard")
				{
					Lengthlbl.setText("Length: 1 Year");
					SubTypenum = 1;
				}
				else if(SubTypecomboBox.getSelectedItem() == "Deluxe")
				{
					Lengthlbl.setText("Length: 2 Year");
					SubTypenum = 2;
				}
				else if(SubTypecomboBox.getSelectedItem() == "Super Deluxe")
				{
					Lengthlbl.setText("Length: 3 Year");
					SubTypenum = 3;
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
				
				if (PictureLinktextField.getText() != " ")
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
								NewCus.newSubscription(ClientId, ActiveSub, SubType, Subnumber);
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
				dispose();
				
			}
		});
		
		
		
		
		
	}
}
