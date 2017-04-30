package B_proj;

public class OperationsController {
	private Operations opObj;
	private OperationsDb opDbObj;
	
	OperationsController(){
		opObj=new Operations();
		opDbObj=new OperationsDb();
	}
	
	public int displayLocationCost(){
		return(opObj.getLocationCost());
	}
	public int displayAccountsPayable(){
		return(opObj.getAccountsPayable());
	}
	public int displayMaxOccupancy(){
		return(opObj.getMaxOccupancy());
	}
	public double displayMonthlyCost(){
		return(opObj.getMonthlyCost());
	}
	public double displayRoi(){
		return(opObj.getRoi());
	}
}
