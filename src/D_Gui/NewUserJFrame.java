package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class NewUserJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField FirstNametextField;
	private JTextField LastNametextField;
	private JTextField DOBtextField;
	private JTextField PhoneNumbertextField;
	private JTextField CCNumbertextField;
	private JTextField PictureLinktextField;

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
		setBounds(100, 100, 228, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 11, 70, 14);
		contentPane.add(lblFirstName);
		
		FirstNametextField = new JTextField();
		FirstNametextField.setBounds(90, 8, 86, 20);
		contentPane.add(FirstNametextField);
		FirstNametextField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(10, 42, 70, 14);
		contentPane.add(lblLastName);
		
		LastNametextField = new JTextField();
		LastNametextField.setBounds(90, 39, 86, 20);
		contentPane.add(LastNametextField);
		LastNametextField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Male");
		comboBox.addItem("Female");
		comboBox.setBounds(90, 70, 86, 20);
		contentPane.add(comboBox);
		
		JLabel lblSex = new JLabel("Sex: ");
		lblSex.setBounds(10, 73, 46, 14);
		contentPane.add(lblSex);
		
		JLabel lblDob = new JLabel("DOB: ");
		lblDob.setBounds(10, 117, 46, 14);
		contentPane.add(lblDob);
		
		//Need to set-up date format************
		DOBtextField = new JTextField();
		DOBtextField.setBounds(90, 114, 86, 20);
		contentPane.add(DOBtextField);
		DOBtextField.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone: ");
		lblPhone.setBounds(10, 154, 46, 14);
		contentPane.add(lblPhone);
		
		
		//Need to set-up phone number format************
		PhoneNumbertextField = new JTextField();
		PhoneNumbertextField.setBounds(90, 151, 86, 20);
		contentPane.add(PhoneNumbertextField);
		PhoneNumbertextField.setColumns(10);
		
		JLabel lblCcNumber = new JLabel("CC Number: ");
		lblCcNumber.setBounds(10, 201, 70, 14);
		contentPane.add(lblCcNumber);
		
		CCNumbertextField = new JTextField();
		CCNumbertextField.setBounds(90, 198, 86, 20);
		contentPane.add(CCNumbertextField);
		CCNumbertextField.setColumns(10);
		
		JLabel lblPictureLink = new JLabel("Picture Link: ");
		lblPictureLink.setBounds(10, 241, 70, 14);
		contentPane.add(lblPictureLink);
		
		PictureLinktextField = new JTextField();
		PictureLinktextField.setBounds(90, 238, 86, 20);
		contentPane.add(PictureLinktextField);
		PictureLinktextField.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(64, 324, 89, 23);
		contentPane.add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Call statement to push data to DataBase
				
				
				//Resets fields once registered
				PictureLinktextField.setText("");
				CCNumbertextField.setText("");
				PhoneNumbertextField.setText("");
				DOBtextField.setText("");
				LastNametextField.setText("");
				FirstNametextField.setText("");
				
			}
		});
		
		
		
		
		
	}
}
