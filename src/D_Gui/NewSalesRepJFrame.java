package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;

public class NewSalesRepJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField FirstNametextField;
	private JTextField LastNametextField;
	private JTextField DOBtextField;
	private JTextField LicensetextField;
	boolean admin;

	/**
	 * Launch the application.
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
	 */
	public NewSalesRepJFrame() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 224, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setBounds(10, 11, 79, 14);
		contentPane.add(lblFirstName);
		
		FirstNametextField = new JTextField();
		FirstNametextField.setBounds(99, 8, 86, 20);
		contentPane.add(FirstNametextField);
		FirstNametextField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(10, 46, 79, 14);
		contentPane.add(lblLastName);
		
		LastNametextField = new JTextField();
		LastNametextField.setBounds(99, 43, 86, 20);
		contentPane.add(LastNametextField);
		LastNametextField.setColumns(10);
		
		JLabel lblDob = new JLabel("DOB: ");
		lblDob.setBounds(10, 82, 46, 14);
		contentPane.add(lblDob);
		
		DOBtextField = new JTextField();
		DOBtextField.setBounds(99, 79, 86, 20);
		contentPane.add(DOBtextField);
		DOBtextField.setColumns(10);
		
		JLabel lblLicense = new JLabel("License #: ");
		lblLicense.setBounds(10, 125, 79, 14);
		contentPane.add(lblLicense);
		
		LicensetextField = new JTextField();
		LicensetextField.setBounds(99, 122, 86, 20);
		contentPane.add(LicensetextField);
		LicensetextField.setColumns(10);
		
		JToggleButton tglbtnIsAnAdmin = new JToggleButton("Is an Admin?");
		tglbtnIsAnAdmin.setBounds(40, 165, 121, 23);
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
		btnRegister.setBounds(55, 237, 89, 23);
		contentPane.add(btnRegister);
		setResizable(false);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//add action to push info to database
				
				
			}
		});
		
		
	}
}
