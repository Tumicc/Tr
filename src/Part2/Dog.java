package Part2;

public class Dog extends Animal implements Runnable{
	private int LegNum;
	
	public Dog(String name,int LegNum){
		super(name);
		this.LegNum=LegNum;
	}
	
	public int getLegNum(){
		return LegNum;
	}
	
	public void print(){
		System.out.println("我的名字叫"+super.getName()+"我有"+this.LegNum+"条腿");
	}
	public void run(){
		System.out.println("我在地上跑。");
	}

}
