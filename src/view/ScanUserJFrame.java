package view;

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

import controller.Customer;
import controller.CustomerController;
import controller.NotFoundException;

import javax.swing.JTextField;

// TODO: Auto-generated Javadoc
/**
 * The Class ScanUserJFrame.
 */
public class ScanUserJFrame extends JFrame {
	
	/** The my cus controller. */
	private CustomerController myCusController;
	
	/** The userinfo. */
	UserInfoJFrame userinfo;
	
	/** The key. */
	int key = 23;
	
	/** The content pane. */
	private JPanel contentPane;
	
	/** The Scan usertext field. */
	private JTextField ScanUsertextField;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
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
	 *
	 * @throws NotFoundException the not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public ScanUserJFrame() throws NotFoundException, IOException {
		 myCusController=new CustomerController();
		 
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		//Action for enter key
		Action action = new AbstractAction()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		        //Scan User
		    	key = Integer.valueOf(ScanUsertextField.getText());
		    	if(userinfo!=null)
		    	{
		    	userinfo.dispose();
		    	}
		    	try {
					myCusController=new CustomerController();
		    		myCusController.searchCustomer(key);
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
					
					
			
					
					
					if (userinfo != null)
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
