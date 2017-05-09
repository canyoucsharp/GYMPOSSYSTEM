package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import B_proj.EmployeeController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

// TODO: Auto-generated Javadoc
/**
 * The Class NewSalesRepJFrame.
 */
public class NewSalesRepJFrame extends JFrame {

	/** The content pane. */
	private JPanel contentPane;
	
	/** The First nametext field. */
	private JTextField FirstNametextField;
	
	/** The Last nametext field. */
	private JTextField LastNametextField;
	
	/** The DO btext field. */
	private JTextField DOBtextField;
	
	/** The Licensetext field. */
	private JTextField LicensetextField;
	
	/** The admin. */
	boolean admin;
	
	/** The Addresstext field. */
	private JTextField AddresstextField;
	
	/** The Phone numbertext field. */
	private JTextField PhoneNumbertextField;
	
	private EmployeeController empCont;
	
	private JTextField HourlyRatetextField;
	private JTextField AgetextField;
	private JTextField UsernametextField;
	private JPasswordField passwordField;
	private JTextField SalestextField;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewSalesRepJFrame frame = new NewSalesRepJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public NewSalesRepJFrame() throws SQLException {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 293, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		empCont = new EmployeeController();
		
		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setBounds(10, 11, 167, 14);
		contentPane.add(lblFirstName);
		
		FirstNametextField = new JTextField();
		FirstNametextField.setBounds(189, 8, 86, 20);
		contentPane.add(FirstNametextField);
		FirstNametextField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(10, 46, 167, 14);
		contentPane.add(lblLastName);
		
		LastNametextField = new JTextField();
		LastNametextField.setBounds(189, 43, 86, 20);
		contentPane.add(LastNametextField);
		LastNametextField.setColumns(10);
		
		JLabel lblDob = new JLabel("DOB: ");
		lblDob.setBounds(10, 82, 167, 14);
		contentPane.add(lblDob);
		
		DOBtextField = new JTextField();
		DOBtextField.setBounds(189, 79, 86, 20);
		contentPane.add(DOBtextField);
		DOBtextField.setColumns(10);
		
		JLabel lblLicense = new JLabel("License #: ");
		lblLicense.setBounds(10, 283, 167, 14);
		contentPane.add(lblLicense);
		
		LicensetextField = new JTextField();
		LicensetextField.setBounds(189, 280, 86, 20);
		contentPane.add(LicensetextField);
		LicensetextField.setColumns(10);
		
		JToggleButton tglbtnIsAnAdmin = new JToggleButton("Is an Admin?");
		tglbtnIsAnAdmin.setBounds(75, 340, 121, 23);
		contentPane.add(tglbtnIsAnAdmin);
		tglbtnIsAnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (admin)
					admin = false;
				else
					admin = true;
			}
		});
		
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(88, 439, 89, 23);
		contentPane.add(btnRegister);
		
		JLabel lblAddress = new JLabel("Address: ");
		lblAddress.setBounds(10, 150, 167, 14);
		contentPane.add(lblAddress);
		
		AddresstextField = new JTextField();
		AddresstextField.setBounds(189, 147, 86, 20);
		contentPane.add(AddresstextField);
		AddresstextField.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setBounds(10, 189, 167, 14);
		contentPane.add(lblPhoneNumber);
		
		PhoneNumbertextField = new JTextField();
		PhoneNumbertextField.setBounds(189, 186, 86, 20);
		contentPane.add(PhoneNumbertextField);
		PhoneNumbertextField.setColumns(10);
		
		JLabel lblHourlyRate = new JLabel("Hourly Rate: ");
		lblHourlyRate.setBounds(10, 251, 167, 16);
		contentPane.add(lblHourlyRate);
		
		HourlyRatetextField = new JTextField();
		HourlyRatetextField.setBounds(189, 248, 86, 22);
		contentPane.add(HourlyRatetextField);
		HourlyRatetextField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age: ");
		lblAge.setBounds(10, 112, 167, 16);
		contentPane.add(lblAge);
		
		AgetextField = new JTextField();
		AgetextField.setBounds(189, 109, 86, 22);
		contentPane.add(AgetextField);
		AgetextField.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex: ");
		lblSex.setBounds(10, 216, 167, 16);
		contentPane.add(lblSex);
		
		JComboBox SexcomboBox = new JComboBox();
		SexcomboBox.addItem("M");
		SexcomboBox.addItem("F");
		SexcomboBox.setBounds(189, 213, 86, 22);
		contentPane.add(SexcomboBox);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setBounds(10, 380, 167, 16);
		contentPane.add(lblUsername);
		
		UsernametextField = new JTextField();
		UsernametextField.setBounds(159, 376, 116, 22);
		contentPane.add(UsernametextField);
		UsernametextField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(10, 409, 167, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(159, 406, 116, 22);
		contentPane.add(passwordField);
		
		JLabel lblSales = new JLabel("Sales: ");
		lblSales.setBounds(10, 308, 167, 14);
		contentPane.add(lblSales);
		
		SalestextField = new JTextField();
		SalestextField.setBounds(189, 305, 86, 20);
		contentPane.add(SalestextField);
		SalestextField.setColumns(10);
		setResizable(false);
		
		//Register Action//
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add action to push info to database
				try {
					empCont.newRep(FirstNametextField.getText(), LastNametextField.getText(), PhoneNumbertextField.getText(), Integer.parseInt(HourlyRatetextField.getText()), AddresstextField.getText(), Integer.parseInt(AgetextField.getText()), SexcomboBox.getSelectedItem().toString(), LicensetextField.getText(), DOBtextField.getText(), UsernametextField.getText(), passwordField.getText(), admin, Integer.getInteger(SalestextField.getText()));
					//empCont.newRep("Dennis", "Kravtsov", "123", 500, "street", 12, "M", "1234", "1995/06/01", "dennis", "kravtsov", true, 56);
				
				}catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
	}
}
