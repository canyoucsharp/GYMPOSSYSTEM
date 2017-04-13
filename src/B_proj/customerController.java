package B_proj;

public class CustomerController {
	Customer cusObj;
	
	CustomerController(){cusObj=new Customer();}
	
	public  void searchCustomer(int id){
		cusObj.setId(id);
		CustomerDb.init(cusObj);
	}


}
