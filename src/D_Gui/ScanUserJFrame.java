package D_Gui;

import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class ScanUserJFrame extends JFrame {

	UserInfoJFrame userinfo;
	int key = 0;
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
	 */
	public ScanUserJFrame() {
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
		
		userinfo = new UserInfoJFrame(key);
		//Action for enter key
		Action action = new AbstractAction()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		        //Scan User
		    	key = Integer.valueOf(ScanUsertextField.getText());
		    	if (key != 0)
		    		userinfo.dispose();
		    	
		    	userinfo = new UserInfoJFrame(key);
		    	userinfo.setVisible(true);
		    	//Resets Text Field
		    	ScanUsertextField.setText("");
		    	ScanUsertextField.requestFocus();
		    	
		    }
		};

		ScanUsertextField.addActionListener(action); //Looks for action key to be pressed
	}
}
