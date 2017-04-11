package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.CardLayout;
import java.awt.Canvas;
import java.awt.Button;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;

public class LoginJFrame extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 278, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(10, 39, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 82, 46, 14);
		contentPane.add(lblPassword);
		
		Button button = new Button("Login");
		button.setBounds(79, 171, 116, 22);
		contentPane.add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(79, 80, 116, 17);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(79, 36, 116, 17);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Password");
		label.setBounds(10, 82, 46, 14);
		contentPane.add(label);
	}
}
