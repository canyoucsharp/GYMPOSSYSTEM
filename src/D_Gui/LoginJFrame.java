package D_Gui;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.sun.glass.events.KeyEvent;

import M_Database.MysqlConnect;


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
			public void actionPerformed(ActionEvent e) {
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
						MainMenuJFrame MainMenu = new MainMenuJFrame();
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
}
