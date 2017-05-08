package D_Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.NumberFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import B_proj.CustomerController;
import B_proj.OperationsController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AdminJFrame extends JFrame {


	private OperationsController opControl;
	private CustomerController myCont;
	private JPanel contentPane;
	private JTextField OverHeadtext;
	private JTextField UserCapacitytext;
	private JTextField CancelationFeetext;
	private JTextField ChangePasswordtext;
	private JTextField LocationCosttextField;
	private JTextField AccountsPayabletextField;
	private JTextField MaxOccupancytextField;
	private JTextField ElectrictextField;
	private JTextField WatertextField;
	private JTextField GastextField;
	private JTextField MonthlyCoststextField;
	private JTextField ROItextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminJFrame frame = new AdminJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public AdminJFrame() throws Exception {
		opControl = new OperationsController();
		myCont = new CustomerController();
		setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 348, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLocationCost = new JLabel("Location Cost");
		lblLocationCost.setBounds(12, 13, 143, 16);
		contentPane.add(lblLocationCost);
		
		LocationCosttextField = new JTextField();
		LocationCosttextField.setBounds(185, 10, 116, 22);
		contentPane.add(LocationCosttextField);
		LocationCosttextField.setColumns(10);
		
		JLabel lblAccountsPayable = new JLabel("Accounts Payable: ");
		lblAccountsPayable.setBounds(12, 56, 130, 16);
		contentPane.add(lblAccountsPayable);
		
		JLabel lblMaxOccupancy = new JLabel("MaxOccupancy: ");
		lblMaxOccupancy.setBounds(12, 99, 143, 16);
		contentPane.add(lblMaxOccupancy);
		
		JLabel lblElectric = new JLabel("Electricity Cost: ");
		lblElectric.setBounds(12, 142, 143, 16);
		contentPane.add(lblElectric);
		
		JLabel lblWater = new JLabel("Water Costs: ");
		lblWater.setBounds(12, 185, 143, 16);
		contentPane.add(lblWater);
		
		JLabel lblGas = new JLabel("Gas Costs: ");
		lblGas.setBounds(12, 228, 143, 16);
		contentPane.add(lblGas);
		
		JLabel lblMonthlyCost = new JLabel("Monthly Costs: ");
		lblMonthlyCost.setBounds(12, 271, 143, 16);
		contentPane.add(lblMonthlyCost);
		
		JLabel lblROI = new JLabel("Return on Investment: ");
		lblROI.setBounds(12, 314, 143, 16);
		contentPane.add(lblROI);
		
		AccountsPayabletextField = new JTextField();
		AccountsPayabletextField.setBounds(185, 53, 116, 22);
		contentPane.add(AccountsPayabletextField);
		AccountsPayabletextField.setColumns(10);
		
		MaxOccupancytextField = new JTextField();
		MaxOccupancytextField.setBounds(185, 96, 116, 22);
		contentPane.add(MaxOccupancytextField);
		MaxOccupancytextField.setColumns(10);
		
		ElectrictextField = new JTextField();
		ElectrictextField.setBounds(185, 139, 116, 22);
		contentPane.add(ElectrictextField);
		ElectrictextField.setColumns(10);
		
		WatertextField = new JTextField();
		WatertextField.setBounds(185, 182, 116, 22);
		contentPane.add(WatertextField);
		WatertextField.setColumns(10);
		
		GastextField = new JTextField();
		GastextField.setBounds(185, 225, 116, 22);
		contentPane.add(GastextField);
		GastextField.setColumns(10);
		
		MonthlyCoststextField = new JTextField();
		MonthlyCoststextField.setBounds(185, 268, 116, 22);
		contentPane.add(MonthlyCoststextField);
		MonthlyCoststextField.setColumns(10);
		
		MonthlyCoststextField.setEditable(false);
		
		ROItextField = new JTextField();
		ROItextField.setBounds(185, 311, 116, 22);
		contentPane.add(ROItextField);
		ROItextField.setColumns(10);
		ROItextField.setEditable(false);
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getNumberInstance();
		
		String ROI = percent.format(opControl.displayRoi());
		ROItextField.setText(ROI);
		
		String MonthlyCost = formatter.format(opControl.displayMonthlyCost());
		MonthlyCoststextField.setText(MonthlyCost);
		myCont.setCurrentRate(opControl.displayMonthlyCost());
		
		String Gas = formatter.format(opControl.displayGas());
		GastextField.setText(Gas);
		
		String Water = formatter.format(opControl.displayWater());
		WatertextField.setText(Water);
		//System.out.println(opControl.displayGas());
		
		String Electric = formatter.format(opControl.displayElectric());
		ElectrictextField.setText(Electric);
		
		String MaxOccupancy = new String(""+ opControl.displayMaxOccupancy());
		MaxOccupancytextField.setText(MaxOccupancy);
		
		String AccountsPayable = formatter.format(opControl.displayAccountsPayable());
		AccountsPayabletextField.setText(AccountsPayable);
		
		String Location = formatter.format(opControl.displayLocationCost());
		LocationCosttextField.setText(Location);
		
		
		
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(102, 400, 97, 25);
		contentPane.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			double updateLocation = Double.parseDouble(LocationCosttextField.getText().replaceAll("[^\\d.]+", ""));

			double updateAccountsPayable = Double.parseDouble(AccountsPayabletextField.getText().replaceAll("[^\\d.]+", ""));
			
			int updateMaxOccupancy = Integer.parseInt(MaxOccupancytextField.getText());
			
			double updateElectric = Double.parseDouble(ElectrictextField.getText().replaceAll("[^\\d.]+", ""));
			
			double updateWater = Double.parseDouble(WatertextField.getText().replaceAll("[^\\d.]+", ""));
			
			double updateGas = Double.parseDouble(GastextField.getText().replaceAll("[^\\d.]+", ""));

		
			opControl.updateAccountsPayable(updateAccountsPayable);
			opControl.updateElectric(updateElectric);
			opControl.updateGash(updateGas);
			opControl.updateLocationCost(updateLocation);
			opControl.updateMaxOccupancy(updateMaxOccupancy);
			opControl.updateWater(updateWater);
			
			}
		});
		
		
	}

}
