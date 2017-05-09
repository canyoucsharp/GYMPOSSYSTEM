package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import B_proj.Customer;
import B_proj.CustomerController;
import B_proj.EmployeeController;
import B_proj.NotFoundException;

import javax.swing.JTextField;

public class SearchSalesRepJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private EmployeeController empCont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchSalesRepJFrame frame = new SearchSalesRepJFrame();
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
	public SearchSalesRepJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle("Search Employee");
		
		textField = new JTextField();
		textField.setBounds(84, 50, 285, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Action action = new AbstractAction()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		        //Scan User
		    	int key = Integer.valueOf(textField.getText());
		    	empCont = new EmployeeController();
		    	
		    		
		    }
		};

		textField.addActionListener(action); //Looks for action key to be pressed
		
	}
}
