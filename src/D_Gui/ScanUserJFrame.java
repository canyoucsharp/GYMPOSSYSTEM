package D_Gui;

import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.WindowFocusListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import B_proj.Customer;
import B_proj.CustomerController;
import B_proj.NotFoundException;

import javax.swing.JTextField;

public class ScanUserJFrame extends JFrame {
	private CustomerController myCusController;
	UserInfoJFrame userinfo;
	int key = 23;
	private JPanel contentPane;
	private JTextField ScanUsertextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScanUserJFrame frame = new ScanUserJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public ScanUserJFrame() throws NotFoundException, IOException {
		 myCusController=new CustomerController();
		 
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 422, 133);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ScanUsertextField = new JTextField();
		ScanUsertextField.setBounds(71, 38, 289, 20);
		contentPane.add(ScanUsertextField);
		ScanUsertextField.setColumns(10);
		setResizable(false);
		setAlwaysOnTop(true);
		CustomerController myCont=new CustomerController();
		try {
			myCont.searchCustomer(23);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		try {
			userinfo = new UserInfoJFrame(key,myCont);
		} catch (NotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		//Action for enter key
		Action action = new AbstractAction()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		        //Scan User
		    	key = Integer.valueOf(ScanUsertextField.getText());
		    	
		    	if (key != 23)
		    		userinfo.dispose();
		    	try {
					myCusController.searchCustomer(key);
					userinfo.dispose();
					Customer newCus=myCusController.getCusObj();
					try {
						userinfo = new UserInfoJFrame(key,myCusController);
					} catch (NotFoundException e1) {
						// TODO Auto-generated catch block
						
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
			
					
					
					
					userinfo.setVisible(true);
					//Resets Text Field
					ScanUsertextField.setText("");
					ScanUsertextField.requestFocus();
			    	
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					userinfo.setVisible(false);
				}
			
		    	
		    	
		    }
		};

		ScanUsertextField.addActionListener(action); //Looks for action key to be pressed
	}
}
