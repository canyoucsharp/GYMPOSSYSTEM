package B_proj;

public class OperationsController {
	private static Operations opObj;
	private OperationsDb opDbObj;
	
	OperationsController(){
		opObj=new Operations();
		opDbObj=new OperationsDb();
	}
	
	
	//display 
	public int displayLocationCost(){
		return(opObj.getLocationCost());
	}
	public int displayAccountsPayable(){
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
	
	//update functions
	
	public void updateLocationCost(int locationCost){
		opDbObj.pushLocationCost(locationCost,opObj);
	}
	
	public void updateAccountsPayable(int accountsPayable)
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
}
