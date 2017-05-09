package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.EmployeeController;

import javax.swing.JLabel;
import javax.swing.JButton;

public class ViewEmployeeJFrame extends JFrame {

	private JPanel contentPane;
	public JButton btnEdit = new JButton("Edit");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeController empCont = new EmployeeController();
					//ViewEmployeeJFrame frame = new ViewEmployeeJFrame(empCont);
				//	frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewEmployeeJFrame(int Admin_Status, EmployeeController empCont, EditEmployeeJFrame EditFrame) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 219, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name: " + empCont.displayFirstName());
		lblFirstName.setBounds(10, 11, 183, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name: " + empCont.displayLastName());
		lblLastName.setBounds(10, 36, 183, 14);
		contentPane.add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address: " + empCont.displayAddress());
		lblAddress.setBounds(10, 61, 183, 14);
		contentPane.add(lblAddress);
		
		JLabel lblDob = new JLabel("DOB: " + empCont.displayDob());
		lblDob.setBounds(10, 111, 183, 14);
		contentPane.add(lblDob);
		
		JLabel lblAge = new JLabel("Age: " + empCont.displayAge());
		lblAge.setBounds(10, 136, 183, 14);
		contentPane.add(lblAge);
		
		JLabel lblSales = new JLabel("Sales: " + empCont.displaySales());
		lblSales.setBounds(10, 161, 183, 14);
		contentPane.add(lblSales);
		
		JLabel lblHourlyRate = new JLabel("Hourly Rate: " + empCont.displayHourlyRate());
		lblHourlyRate.setBounds(10, 186, 183, 14);
		contentPane.add(lblHourlyRate);
		
		JLabel lblLicenseNumber = new JLabel("License Number: " + empCont.displayLicense());
		lblLicenseNumber.setBounds(10, 211, 183, 14);
		contentPane.add(lblLicenseNumber);
		
		JLabel lblSex = new JLabel("Sex: " + empCont.displaySex());
		lblSex.setBounds(10, 236, 183, 14);
		contentPane.add(lblSex);
		
		btnEdit.setBounds(54, 305, 89, 23);
		contentPane.add(btnEdit);
		
		
		
		JLabel lblPhoneNumber = new JLabel("Phone Number: " + empCont.displayPhoneNumber());
		lblPhoneNumber.setBounds(10, 86, 183, 14);
		contentPane.add(lblPhoneNumber);
		
		
		String Admin = null;
		switch(Admin_Status){
		case 0:{
			Admin = "Not Admin";
			break;
		}
		case 1:{
			Admin = "Is Admin";
			break;
		}
		}
		JLabel lblAdmin = new JLabel("Admin: " + Admin);
		lblAdmin.setBounds(10, 263, 179, 16);
		contentPane.add(lblAdmin);
		
		
		
		
		btnEdit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub 
				dispose();
			}
			
		});
	}
}
