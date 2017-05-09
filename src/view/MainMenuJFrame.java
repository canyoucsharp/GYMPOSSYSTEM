package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CustomerController;
import controller.NotFoundException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.*;

// TODO: Auto-generated Javadoc
/**
 * The Class MainMenuJFrame.
 */
public class MainMenuJFrame extends JFrame {

	/** The Scan user UI. */
	ScanUserJFrame ScanUserUI = null;
	
	AdminJFrame AdminUI = null;
	
	NewUserJFrame NewUserUI = null;
	
	NewSalesRepJFrame NewEmployeeframe = null;
	
	SearchSalesRepJFrame ScanEmp = null;
	
	/** The content pane. */
	private JPanel contentPane;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuJFrame frame = new MainMenuJFrame(1);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 *
	 * @param Admin_Status the admin status
	 * @throws Exception the exception
	 */
	public MainMenuJFrame(int Admin_Status) throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		

		
		//ADMIN BUTTON
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (AdminUI != null)
				{
					AdminUI.dispose();
				}
				try {
					AdminUI = new AdminJFrame();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				AdminUI.setVisible(true);
			}
		});
		btnAdmin.setBounds(44, 13, 174, 44);
		contentPane.add(btnAdmin);
		
		//CHECKER
		if(Admin_Status != 1) //Check Admin Status
			btnAdmin.setEnabled(false);
		
		
		//SCAN USER BUTTON
		JButton btnScanUser = new JButton("Scan User");
		btnScanUser.setBounds(44, 68, 174, 44);
		contentPane.add(btnScanUser);
		btnScanUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (ScanUserUI != null){
					ScanUserUI.dispose();
				}
					try {
						ScanUserUI = new ScanUserJFrame();
					} catch (IOException | NotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				ScanUserUI.setVisible(true);
			}
		});
		
		
		
		//NEW CUSTOMER BUTTON
		JButton btnNewUser = new JButton("New Customer");
		btnNewUser.setBounds(44, 123, 174, 44);
		contentPane.add(btnNewUser);
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (NewUserUI != null){
					NewUserUI.dispose();
				}
				try {
					NewUserUI = new NewUserJFrame();
				} catch (NotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				NewUserUI.setVisible(true);
			}
		});
		
		
		
		
		JButton btnNewEmployee = new JButton("Register Sales Rep");
		btnNewEmployee.setBounds(44, 178, 174, 44);
		contentPane.add(btnNewEmployee);
		
		
		//NEW EMPLOYEE BUTTON
		btnNewEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (NewEmployeeframe != null){
					NewEmployeeframe.dispose();
				}
				try {
					NewEmployeeframe = new NewSalesRepJFrame();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				NewEmployeeframe.setVisible(true);
			}
		});
		
		
		//SCAN EMPLOYEE BUTTON
		JButton ScanEmployeebtn = new JButton("Scan Employee");
		ScanEmployeebtn.setBounds(44, 233, 174, 44);
		contentPane.add(ScanEmployeebtn);
		ScanEmployeebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (ScanEmp != null){
					ScanEmp.dispose();
				}
				ScanEmp = new SearchSalesRepJFrame();
				
				ScanEmp.setVisible(true);
			
			}
		});
	}
	
	
}
