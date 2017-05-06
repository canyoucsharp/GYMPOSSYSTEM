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

public class MainMenuJFrame extends JFrame {

	ScanUserJFrame ScanUserUI;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuJFrame frame = new MainMenuJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public MainMenuJFrame() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 268, 376);
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
		//if(isAdmin())
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
		
		JButton btnViewSalesRep = new JButton("View Sales Rep");
		btnViewSalesRep.setBounds(44, 265, 174, 44);
		contentPane.add(btnViewSalesRep);
		btnViewSalesRep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewEmployeeframe.setVisible(true);
			}
		});
	}
}
