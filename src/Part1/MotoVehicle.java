package Part1;

public abstract class MotoVehicle {
	private String brand;
	public MotoVehicle(String brand){
		this.brand=brand;
	}

	public String getBrand() {
		return brand;
	}

	public  abstract void printRent(int days);
		
	
	

}
