package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import M_Database.MysqlConnect;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.CardLayout;
import java.awt.Canvas;
import java.awt.Button;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;

import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class LoginJFrame extends JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
	
	private JPanel contentPane;
	private JPasswordField password;
	private JTextField Username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginJFrame frame = new LoginJFrame();
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
	public LoginJFrame() {
		conn=MysqlConnect.ConnectDB();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(10, 39, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 82, 74, 15);
		contentPane.add(lblPassword);
		
		Button button = new Button("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Hello");
				try
				{
					String query="select * from salesrep where username=? and password=?";
					pst=conn.prepareStatement(query);
					pst.setString(1, Username.getText());
					pst.setString(2, password.getText());
					pst.executeQuery();
					rs=pst.executeQuery();
					
					if(rs.next())
					{
						
						JOptionPane.showMessageDialog(null, "logging in");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Wrong Username or Password");

					}
				}
				catch(Exception ep)
				{
					JOptionPane.showMessageDialog(null, ep);
				}
				
			}
		});
		button.setBounds(51, 171, 116, 22);
		contentPane.add(button);
		
		password = new JPasswordField();
		password.setBounds(79, 80, 116, 17);
		contentPane.add(password);
		
		Username = new JTextField();
		Username.setBounds(79, 36, 116, 17);
		contentPane.add(Username);
		Username.setColumns(10);
		
		JLabel label = new JLabel("Password");
		label.setBounds(10, 82, 46, 14);
		contentPane.add(label);
		
		Button cancel = new Button("Cancel");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cancel.setBounds(205, 171, 116, 22);
		contentPane.add(cancel);
	}
}
