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
	
	
}
