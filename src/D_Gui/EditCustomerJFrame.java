package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

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
	private JTextField textField;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditCustomerJFrame frame = new EditCustomerJFrame();
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
	public EditCustomerJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setBounds(10, 14, 115, 14);
		contentPane.add(lblFirstName);
		
		FirstNametextField = new JTextField();
		FirstNametextField.setBounds(135, 11, 115, 20);
		contentPane.add(FirstNametextField);
		FirstNametextField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(10, 39, 115, 14);
		contentPane.add(lblLastName);
		
		LastNametextField = new JTextField();
		LastNametextField.setBounds(135, 36, 115, 20);
		contentPane.add(LastNametextField);
		LastNametextField.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address: ");
		lblAddress.setBounds(10, 64, 115, 14);
		contentPane.add(lblAddress);
		
		AddresstextField = new JTextField();
		AddresstextField.setBounds(135, 61, 115, 20);
		contentPane.add(AddresstextField);
		AddresstextField.setColumns(10);
		
		lblPhoneNumber = new JLabel("Phone Number: ");
		lblPhoneNumber.setBounds(10, 89, 115, 14);
		contentPane.add(lblPhoneNumber);
		
		PhoneNumbertextField = new JTextField();
		PhoneNumbertextField.setBounds(135, 86, 115, 20);
		contentPane.add(PhoneNumbertextField);
		PhoneNumbertextField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age: ");
		lblAge.setBounds(10, 114, 115, 14);
		contentPane.add(lblAge);
		
		textField = new JTextField();
		textField.setBounds(135, 111, 115, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex: ");
		lblSex.setBounds(10, 139, 115, 14);
		contentPane.add(lblSex);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(211, 136, 39, 20);
		contentPane.add(comboBox);
		comboBox.addItem("M");
		comboBox.addItem("F");
		
		
	}
}
