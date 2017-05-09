package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Customer;
import controller.CustomerController;
import controller.EmployeeController;
import controller.NotFoundException;

import javax.swing.JTextField;

public class SearchSalesRepJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private EmployeeController empCont;
	private ViewEmployeeJFrame EmpView = null;
	private EditEmployeeJFrame EditFrame = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchSalesRepJFrame frame = new SearchSalesRepJFrame(1);
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
	public SearchSalesRepJFrame(int Admin_Status) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 460, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle("Search Employee");
		setResizable(false);
		setAlwaysOnTop(true);
		
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
		    	if (EditFrame != null){
					EditFrame.dispose();
				}
		    
		    	if (EmpView != null){
	    			EmpView.dispose();
	    		}
		    	
		    	try {
					try {
						empCont.searchEmployee(key);
						EmpView = new ViewEmployeeJFrame(Admin_Status, empCont, EditFrame);
						if (Admin_Status != 1){
							EmpView.btnEdit.setEnabled(false);
						}
				    	if (empCont.displayFirstName().compareTo("null") != 0)
				    		EmpView.setVisible(true);
				    	EmpView.btnEdit.addActionListener(new ActionListener(){

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								if (EditFrame != null){
									EditFrame.dispose();
								}
								EditFrame = new EditEmployeeJFrame(empCont);
								EditFrame.setVisible(true);					
							}
				    		
				    	});
					} catch (NotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    	
		    	   		
		    			    	
		    	
		    	textField.setText("");
		    	textField.requestFocus();
		    }
		};

		textField.addActionListener(action); //Looks for action key to be pressed
		
	}
}
