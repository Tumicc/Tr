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
	if("��Խ".equals(type)){
		pay=days*100;
		
	}else if("��Խ".equals(type)){
		pay=days*200;
	}
	System.out.println("����"+super.getBrand()+type+"�γ�"+days+"��");
	System.out.println("�踶���"+pay+"Ԫ");
	
}



}
