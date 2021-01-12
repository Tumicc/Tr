package Part2;

public class Bird extends Animal implements Flyable{
	private int wingNum;
	
	public Bird(String name,int wingNum){
		super(name);
		this.wingNum=wingNum;
	}
	
	public int getwingNum(){
		return wingNum;
	}
	
	public void print(){
		System.out.println("我的名字叫"+super.getName()+"我有"+this.wingNum+"只翅膀");
	}

	@Override
	public void fly() {
		System.out.println("我在空中飞。");
	}

}
