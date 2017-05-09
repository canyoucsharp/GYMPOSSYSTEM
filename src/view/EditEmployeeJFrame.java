package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.EmployeeController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class EditEmployeeJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField FirstNametextField;
	private JTextField LastNametextField;
	private JTextField AgetextField;
	private JLabel lblSex;
	private JLabel lblDob;
	private JTextField DOBtextField;
	private JLabel lblAddress;
	private JTextField AddresstextField;
	private JLabel lblHourlyRate;
	private JTextField HourlytextField;
	private JLabel lblSales;
	private JTextField SalestextField;
	private JTextField LicensetextField;
	private JLabel lblPhoneNumber;
	private JTextField PhoneNumbertextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeController empCont= new EmployeeController();
					//EditEmployeeJFrame frame = new EditEmployeeJFrame(empCont);
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditEmployeeJFrame(EmployeeController empCont) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 238, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setResizable(false);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setBounds(10, 11, 106, 14);
		contentPane.add(lblFirstName);
		
		FirstNametextField = new JTextField(empCont.displayFirstName());
		FirstNametextField.setBounds(126, 8, 86, 20);
		contentPane.add(FirstNametextField);
		FirstNametextField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(10, 36, 106, 14);
		contentPane.add(lblLastName);
		
		LastNametextField = new JTextField(empCont.displayLastName());
		LastNametextField.setBounds(126, 33, 86, 20);
		contentPane.add(LastNametextField);
		LastNametextField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age: ");
		lblAge.setBounds(10, 61, 106, 14);
		contentPane.add(lblAge);
		
		AgetextField = new JTextField("" + empCont.displayAge());
		AgetextField.setBounds(126, 58, 86, 20);
		contentPane.add(AgetextField);
		AgetextField.setColumns(10);
		
		lblSex = new JLabel("Sex: ");
		lblSex.setBounds(10, 86, 106, 14);
		contentPane.add(lblSex);
		
		String sex = empCont.displaySex();
		JComboBox SexcomboBox = new JComboBox();
		if (sex.compareTo("Male") == 0){
			SexcomboBox.addItem(empCont.displaySex());
			SexcomboBox.addItem("Female");
		}
		else
		{
			SexcomboBox.addItem(empCont.displaySex());
			SexcomboBox.addItem("Male");
		}
		SexcomboBox.setBounds(126, 83, 86, 20);
		contentPane.add(SexcomboBox);
		
		lblDob = new JLabel("DOB: ");
		lblDob.setBounds(10, 111, 106, 14);
		contentPane.add(lblDob);
		
		DOBtextField = new JTextField();
		DOBtextField.setBounds(126, 108, 86, 20);
		contentPane.add(DOBtextField);
		DOBtextField.setColumns(10);
		
		lblAddress = new JLabel("Address: ");
		lblAddress.setBounds(10, 164, 106, 14);
		contentPane.add(lblAddress);
		
		AddresstextField = new JTextField(empCont.displayAddress());
		AddresstextField.setBounds(126, 161, 86, 20);
		contentPane.add(AddresstextField);
		AddresstextField.setColumns(10);
		
		lblHourlyRate = new JLabel("Hourly Rate: ");
		lblHourlyRate.setBounds(10, 189, 106, 14);
		contentPane.add(lblHourlyRate);
		
		HourlytextField = new JTextField("" + empCont.displayHourlyRate());
		HourlytextField.setBounds(126, 186, 86, 20);
		contentPane.add(HourlytextField);
		HourlytextField.setColumns(10);
		
		lblSales = new JLabel("Sales: ");
		lblSales.setBounds(10, 214, 106, 14);
		contentPane.add(lblSales);
		
		SalestextField = new JTextField("" + empCont.displaySales());
		SalestextField.setBounds(126, 211, 86, 20);
		contentPane.add(SalestextField);
		SalestextField.setColumns(10);
		
		JLabel lblLicenseNumber = new JLabel("License Number: ");
		lblLicenseNumber.setBounds(10, 238, 106, 14);
		contentPane.add(lblLicenseNumber);
		
		LicensetextField = new JTextField();
		LicensetextField.setBounds(126, 235, 86, 20);
		contentPane.add(LicensetextField);
		LicensetextField.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(70, 294, 89, 23);
		contentPane.add(btnUpdate);
		
		lblPhoneNumber = new JLabel("Phone Number: ");
		lblPhoneNumber.setBounds(10, 136, 106, 14);
		contentPane.add(lblPhoneNumber);
		
		PhoneNumbertextField = new JTextField(empCont.displayPhoneNumber());
		PhoneNumbertextField.setBounds(126, 133, 86, 20);
		contentPane.add(PhoneNumbertextField);
		PhoneNumbertextField.setColumns(10);
		btnUpdate.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					empCont.updateAddress(AddresstextField.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					empCont.updateAge(AgetextField.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					empCont.updateFirstName(FirstNametextField.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					empCont.updateHourlyRate(Integer.parseInt(HourlytextField.getText()));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					empCont.updateLastName(LastNametextField.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//empCont.updateLicense(newlicenseNumber);
				
				try {
					empCont.updatePhoneNumber(PhoneNumbertextField.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				dispose();
				
				
			}
			
			
		});
	}
}
