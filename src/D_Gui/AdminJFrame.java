package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AdminJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField OverHeadtext;
	private JTextField UserCapacitytext;
	private JTextField CancelationFeetext;
	private JTextField ChangePasswordtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminJFrame frame = new AdminJFrame();
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
	public AdminJFrame() {
		setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 436, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOverhead = new JLabel("Overhead");
		lblOverhead.setBounds(33, 13, 56, 16);
		contentPane.add(lblOverhead);
		
		JLabel lblUserCapacity = new JLabel("User Capacity");
		lblUserCapacity.setBounds(33, 55, 84, 16);
		contentPane.add(lblUserCapacity);
		
		JLabel lblCancelationFeee = new JLabel("Cancelation Feee");
		lblCancelationFeee.setBounds(33, 100, 98, 16);
		contentPane.add(lblCancelationFeee);
		
		JLabel lblChangePassword = new JLabel("Change Password");
		lblChangePassword.setBounds(33, 150, 121, 16);
		contentPane.add(lblChangePassword);
		
		OverHeadtext = new JTextField(/*getter for Overhead*/);
		OverHeadtext.setBounds(208, 10, 116, 22);
		contentPane.add(OverHeadtext);
		OverHeadtext.setColumns(10);
		
		UserCapacitytext = new JTextField(/*getter for User Capacity*/);
		UserCapacitytext.setBounds(208, 52, 116, 22);
		contentPane.add(UserCapacitytext);
		UserCapacitytext.setColumns(10);
		
		CancelationFeetext = new JTextField(/*getter for Cancelation fee*/);
		CancelationFeetext.setBounds(208, 97, 116, 22);
		contentPane.add(CancelationFeetext);
		CancelationFeetext.setColumns(10);
		
		ChangePasswordtext = new JTextField();
		ChangePasswordtext.setBounds(208, 147, 116, 22);
		contentPane.add(ChangePasswordtext);
		ChangePasswordtext.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(135, 204, 97, 25);
		contentPane.add(btnUpdate);
	}
}
