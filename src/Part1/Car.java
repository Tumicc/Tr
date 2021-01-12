package Part1;

public  class Car extends MotoVehicle{
   private String type;
   public Car(String brand,String type){
	   super(brand);
	   this.type=type;
   }
public String getType() {
	return type;
}

public void printRent(int days){
	int pay=0;
	if("凯越".equals(type)){
		pay=days*100;
		
	}else if("君越".equals(type)){
		pay=days*200;
	}
	System.out.println("租用"+super.getBrand()+type+"轿车"+days+"天");
	System.out.println("需付租金"+pay+"元");
	
}



}
