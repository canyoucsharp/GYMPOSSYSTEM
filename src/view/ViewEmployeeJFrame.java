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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeController empCont = new EmployeeController();
					ViewEmployeeJFrame frame = new ViewEmployeeJFrame(empCont);
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
	public ViewEmployeeJFrame(EmployeeController empCont) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 219, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name: " + empCont.displayFirstName());
		lblFirstName.setBounds(10, 11, 133, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name: " + empCont.displayLastName());
		lblLastName.setBounds(10, 36, 133, 14);
		contentPane.add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address: " + empCont.displayAddress());
		lblAddress.setBounds(10, 61, 133, 14);
		contentPane.add(lblAddress);
		
		JLabel lblDob = new JLabel("DOB: ");
		lblDob.setBounds(10, 86, 133, 14);
		contentPane.add(lblDob);
		
		JLabel lblAge = new JLabel("Age: " + empCont.displayAge());
		lblAge.setBounds(10, 111, 133, 14);
		contentPane.add(lblAge);
		
		JLabel lblSales = new JLabel("Sales: " + empCont.displaySales());
		lblSales.setBounds(10, 136, 133, 14);
		contentPane.add(lblSales);
		
		JLabel lblHourlyRate = new JLabel("Hourly Rate: " + empCont.displayHourlyRate());
		lblHourlyRate.setBounds(10, 161, 133, 14);
		contentPane.add(lblHourlyRate);
		
		JLabel lblLicenseNumber = new JLabel("License Number: ");
		lblLicenseNumber.setBounds(10, 186, 133, 14);
		contentPane.add(lblLicenseNumber);
		
		JLabel lblSex = new JLabel("Sex: " + empCont.displaySex());
		lblSex.setBounds(10, 211, 133, 14);
		contentPane.add(lblSex);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(54, 248, 89, 23);
		contentPane.add(btnEdit);
		btnEdit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
}
