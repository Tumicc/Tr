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
		System.out.println("�ҵ����ֽ�"+super.getName()+"����"+this.LegNum+"����");
	}
	public void run(){
		System.out.println("���ڵ����ܡ�");
	}

}
