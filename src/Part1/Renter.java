package Part1;

public class Renter {
	private String name;
	private String id;
   public Renter(String name,String id){
	   this.name=name;
	   this.id=id;
   }
public String getName() {
	return name;
}

public String getId() {
	return id;
}
public void print(){
	System.out.println("�⻧"+name+",���֤��"+id+".");
}
public void rent(MotoVehicle motoVehicle,int sumDays){
	motoVehicle.printRent(sumDays);
}
}

