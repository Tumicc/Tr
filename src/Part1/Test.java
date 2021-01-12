package Part1;

public class Test {
	public static void main(String[] args){
		Car car=new Car("别克","凯越");
		Bus bus=new Bus("金龙",28);
		Renter renter=new Renter("王大明","321102196810150292");
		renter.print();
		renter.rent(car,5);
		renter.rent(bus,2);
		
	}

}
