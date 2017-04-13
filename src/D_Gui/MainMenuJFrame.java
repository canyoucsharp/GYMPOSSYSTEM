package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenuJFrame extends JFrame {

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
	 */
	public MainMenuJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 277, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdmin.setBounds(44, 13, 174, 44);
		//if(isAdmin())
		//contentPane.add(btnAdmin);
		
		JButton btnScanUser = new JButton("Scan User");
		btnScanUser.setBounds(44, 82, 174, 44);
		contentPane.add(btnScanUser);
		
		JButton btnNewUser = new JButton("New User");
		btnNewUser.setBounds(44, 195, 174, 44);
		contentPane.add(btnNewUser);
		
		JButton btnViewSalesRep = new JButton("View Sales Rep");
		btnViewSalesRep.setBounds(44, 265, 174, 44);
		contentPane.add(btnViewSalesRep);
	}
}
