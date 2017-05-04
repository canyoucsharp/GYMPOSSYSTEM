package B_proj;

public class OperationsController {
	private static Operations opObj;
	private OperationsDb opDbObj;
	
	public OperationsController(){
		opObj=new Operations();
		opDbObj=new OperationsDb();
	}
	
	
	//display 
	public double displayLocationCost(){
		return(opObj.getLocationCost());
	}
	public double displayAccountsPayable(){
		return(opObj.getAccountsPayable());
	}
	public int displayMaxOccupancy(){
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
		opDbObj.pushLocationCost(locationCost,opObj);
	}
	
	public void updateAccountsPayable(double accountsPayable)
	{
		opDbObj.pushAccountsPayable(accountsPayable,opObj);
	}
	public void updateMaxOccupancy(int maxOccupancy)
	{
		opDbObj.pushMaxOccupancy(maxOccupancy,opObj);
	}
	public void updateRoi(int roi){
		opDbObj.pushRoi(roi,opObj);
	}
	public void updateElectric(double electric)
	{
		opDbObj.pushElectric(electric,opObj);
	}
	public void updateWater(double water){
		opDbObj.pushWater(water,opObj);
	}
	public void updateGash(double gas){
		opDbObj.pushGas(gas,opObj);
	}
}
