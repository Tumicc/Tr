package Part1;

public class Test {
	public static void main(String[] args){
		Car car=new Car("���","��Խ");
		Bus bus=new Bus("����",28);
		Renter renter=new Renter("������","321102196810150292");
		renter.print();
		renter.rent(car,5);
		renter.rent(bus,2);
		
	}

}
