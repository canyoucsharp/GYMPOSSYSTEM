package B_proj;

public class TestBench {

	public static void main(String[] args) throws NotFoundException {
		Operations opcont=new Operations();
		opcont.setGas(205);
		opcont.setElectric(350);
		opcont.setAccountsPayable(250);
		opcont.setLocationCost(10000);
		opcont.setMaxOccupancy(30);
		opcont.setRoi(.30);
		opcont.setWater(300);
		System.out.println(opcont.getMonthlyCost());
		
	}

}
