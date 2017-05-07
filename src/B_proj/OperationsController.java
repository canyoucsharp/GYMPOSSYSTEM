package B_proj;

import java.sql.SQLException;

public class OperationsController {
	private static Operations opObj;
	private OperationsDb opDbObj;
	
	public OperationsController() throws NotFoundException{
		opObj=new Operations();
		opDbObj=new OperationsDb();
		this.init();
	}
	
	public void init() throws NotFoundException
	{
		try {
			opDbObj.init(opObj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//display 
	public double displayLocationCost(){
		return(opObj.getLocationCost());
	}
	public double displayAccountsPayable(){
		return(opObj.getAccountsPayable());
	}
	public double displayMaxOccupancy(){
		return(opObj.getMaxOccupancy());
	}
	public static double displayMonthlyCost(){
		return(opObj.getMonthlyCost());
	}
	public double displayRoi(){
		return(opObj.getRoi());
	}
	public double displayElectric(){
		return(opObj.getElectric());
	}
	public double displayWater(){
		return(opObj.getWater());
	}
	public double displayGas(){
		return(opObj.getGas());
	}
	//update functions
	
	public void updateLocationCost(double locationCost){
		try {
			opDbObj.pushLocationCost(locationCost,opObj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateAccountsPayable(double accountsPayable)
	{
		try {
			opDbObj.pushAccountsPayable(accountsPayable,opObj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateMaxOccupancy(int maxOccupancy)
	{
		try {
			opDbObj.pushMaxOccupancy(maxOccupancy,opObj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateRoi(int roi){
		try {
			opDbObj.pushRoi(roi,opObj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateElectric(double electric)
	{
		try {
			opDbObj.pushElectric(electric,opObj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateWater(double water){
		try {
			opDbObj.pushWater(water,opObj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateGash(double gas){
		try {
			opDbObj.pushGas(gas,opObj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
