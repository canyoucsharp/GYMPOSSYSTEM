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

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import B_proj.CustomerController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class NewUserJFrame extends JFrame {

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
		setBounds(100, 100, 261, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 17, 102, 14);
		contentPane.add(lblFirstName);
		
		FirstNametextField = new JTextField();
		FirstNametextField.setBounds(146, 11, 86, 20);
		contentPane.add(FirstNametextField);
		FirstNametextField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(10, 48, 102, 14);
		contentPane.add(lblLastName);
		
		LastNametextField = new JTextField();
		LastNametextField.setBounds(146, 42, 86, 20);
		contentPane.add(LastNametextField);
		LastNametextField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("M");
		comboBox.addItem("F");
		comboBox.setBounds(146, 73, 86, 20);
		contentPane.add(comboBox);
		
		JLabel lblSex = new JLabel("Sex: ");
		lblSex.setBounds(10, 79, 102, 14);
		contentPane.add(lblSex);
		
		JLabel lblDob = new JLabel("DOB: ");
		lblDob.setBounds(10, 123, 102, 14);
		contentPane.add(lblDob);
		
		//Need to set-up date format************
		DOBtextField = new JTextField();
		DOBtextField.setBounds(146, 117, 86, 20);
		contentPane.add(DOBtextField);
		DOBtextField.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone: ");
		lblPhone.setBounds(10, 160, 102, 14);
		contentPane.add(lblPhone);
		
		
		//Need to set-up phone number format************
		PhoneNumbertextField = new JTextField();
		PhoneNumbertextField.setBounds(146, 154, 86, 20);
		contentPane.add(PhoneNumbertextField);
		PhoneNumbertextField.setColumns(10);
		
		JLabel lblLiscNumber = new JLabel("Driver's Liscense: ");
		lblLiscNumber.setBounds(10, 207, 115, 14);
		contentPane.add(lblLiscNumber);
		
		CCNumbertextField = new JTextField();
		CCNumbertextField.setBounds(146, 201, 86, 20);
		contentPane.add(CCNumbertextField);
		CCNumbertextField.setColumns(10);
		
		JLabel lblPictureLink = new JLabel("Picture Link: ");
		lblPictureLink.setBounds(10, 247, 102, 14);
		contentPane.add(lblPictureLink);
		
		PictureLinktextField = new JTextField();
		PictureLinktextField.setBounds(146, 241, 86, 20);
		contentPane.add(PictureLinktextField);
		PictureLinktextField.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(79, 414, 89, 23);
		contentPane.add(btnRegister);
		
		
		AddressTextField = new JTextField();
		AddressTextField.setBounds(146, 280, 86, 20);
		contentPane.add(AddressTextField);
		AddressTextField.setColumns(10);
		
		
		
		
		JLabel lblAddress = new JLabel("Address: ");
		lblAddress.setBounds(10, 286, 102, 14);
		contentPane.add(lblAddress);
		
		JLabel lblAge = new JLabel("Age: ");
		lblAge.setBounds(10, 328, 102, 14);
		contentPane.add(lblAge);
		
		AgeTextField = new JTextField();
		AgeTextField.setBounds(146, 322, 86, 20);
		contentPane.add(AgeTextField);
		AgeTextField.setColumns(10);
		
		JLabel lblClientId = new JLabel("Client Id: ");
		lblClientId.setBounds(10, 365, 102, 14);
		contentPane.add(lblClientId);
		
		ClientIdtextField = new JTextField();
		ClientIdtextField.setBounds(146, 362, 86, 20);
		contentPane.add(ClientIdtextField);
		ClientIdtextField.setColumns(10);
		
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Call statement to push data to DataBase
				
				String Sex = comboBox.getSelectedItem().toString();
				int Age = Integer.parseInt(AgeTextField.getText());
				int ClientId = Integer.parseInt(ClientIdtextField.getText());
				String picturelink;
				if (PictureLinktextField.getText() == "")
				{
					picturelink = "http://clipartix.com/wp-content/uploads/2016/08/Pictures-of-questions-marks-clipart.png";
				}
				else
				{
					picturelink = PictureLinktextField.getText();
				}
				
				try {
					NewCus.newCustomer(FirstNametextField.getText(), LastNametextField.getText(), Sex, DOBtextField.getText(), PhoneNumbertextField.getText(), picturelink, AddressTextField.getText(), Age, 1, CCNumbertextField.getText(), ClientId);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
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
