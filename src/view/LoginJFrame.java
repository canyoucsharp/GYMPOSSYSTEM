package view;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MysqlConnect;

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


// TODO: Auto-generated Javadoc
/**
 * The Class LoginJFrame.
 */
public class LoginJFrame extends JFrame {

/** The conn. */
Connection conn=null;

/** The pst. */
PreparedStatement pst=null;

/** The rs. */
ResultSet rs=null;
	
	/** The content pane. */
	private JPanel contentPane;
	
	/** The password. */
	private JPasswordField password;
	
	/** The Username. */
	private JTextField Username;
	
	/** The is admin. */
	int isAdmin;
	
	/** The rep id. */
	int repId;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
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
	 *
	 * @throws SQLException the SQL exception
	 */
	public LoginJFrame() throws SQLException {
		MysqlConnect myConnector=new MysqlConnect();
		conn=myConnector.ConnectDB();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 238);
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
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try
				{
					String query="select * from login where username=? and password=?";
					pst=conn.prepareStatement(query);
					pst.setString(1, Username.getText());
					pst.setString(2, password.getText());
					pst.executeQuery();
					rs=pst.executeQuery();
					
					if(rs.next())
					{
						isAdmin=rs.getInt("isadmin");
						repId=rs.getInt("rep_id");
						MainMenuJFrame MainMenu = new MainMenuJFrame(isAdmin);
						dispose();
						MainMenu.setVisible(true);
						JOptionPane.showMessageDialog(null, "Successfuly Logged in");
						
						
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
				finally
				{
					
					try {
						pst.close();
						rs.close();
						conn.close();
						System.out.println("Connection closed");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			}
		});
		button.setBounds(133, 135, 116, 22);
		contentPane.add(button);
		
		password = new JPasswordField();
		password.setBounds(133, 80, 116, 17);
		contentPane.add(password);
		
		Username = new JTextField();
		Username.setBounds(133, 37, 116, 17);
		contentPane.add(Username);
		Username.setColumns(10);
		
		JLabel label = new JLabel("Password");
		label.setBounds(10, 82, 46, 14);
		contentPane.add(label);

	}

	/**
	 * Gets the checks if is admin.
	 *
	 * @return the checks if is admin
	 */
	public int getIsAdmin() {
		return isAdmin;
	}

	/**
	 * Sets the checks if is admin.
	 *
	 * @param isAdmin the new checks if is admin
	 */
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 * Gets the rep id.
	 *
	 * @return the rep id
	 */
	public int getRepId() {
		return repId;
	}

	/**
	 * Sets the rep id.
	 *
	 * @param repId the new rep id
	 */
	public void setRepId(int repId) {
		this.repId = repId;
	}
	
	
}
