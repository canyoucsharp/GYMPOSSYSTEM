package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import B_proj.CustomerController;
import B_proj.NotFoundException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.*;

// TODO: Auto-generated Javadoc
/**
 * The Class MainMenuJFrame.
 */
public class MainMenuJFrame extends JFrame {

	/** The Scan user UI. */
	ScanUserJFrame ScanUserUI;
	
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
		setBounds(100, 100, 268, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		try {
			ScanUserUI = new ScanUserJFrame();
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		NewSalesRepJFrame NewEmployeeframe = new NewSalesRepJFrame();
		AdminJFrame AdminUI = new AdminJFrame();
		NewUserJFrame NewUserUI = new NewUserJFrame();
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminUI.setVisible(true);
			}
		});
		btnAdmin.setBounds(44, 13, 174, 44);
		if(Admin_Status == 1) //Check Admin Status
			contentPane.add(btnAdmin);
		
		JButton btnScanUser = new JButton("Scan User");
		btnScanUser.setBounds(44, 82, 174, 44);
		contentPane.add(btnScanUser);
		btnScanUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ScanUserUI.setVisible(true);
			}
		});
		
		JButton btnNewUser = new JButton("New User");
		btnNewUser.setBounds(44, 195, 174, 44);
		contentPane.add(btnNewUser);
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewUserUI.setVisible(true);
			}
		});
		
		JButton btnViewSalesRep = new JButton("Register Sales Rep");
		btnViewSalesRep.setBounds(44, 250, 174, 44);
		contentPane.add(btnViewSalesRep);
		
		btnViewSalesRep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewEmployeeframe.setVisible(true);
			}
		});
		
		JButton EditCustomerbtn = new JButton("Edit Customer");
		EditCustomerbtn.setBounds(44, 305, 174, 44);
		contentPane.add(EditCustomerbtn);
		EditCustomerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Open Edit Customer page
			}
		});
	}
	
	
}
