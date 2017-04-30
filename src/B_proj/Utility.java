package B_proj;

public class Utility{
	private int electric;
	private int gas;
	private int water;
	
	public int getElectric() {
		return electric;
	}
	public void setElectric(int electric) {
		this.electric = electric;
	}
	public int getGas() {
		return gas;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int totalUtilities(){
		return(electric+gas+water);
	}
}