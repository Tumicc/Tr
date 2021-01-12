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
		System.out.println("�ҵ����ֽ�"+super.getName()+"����"+this.wingNum+"ֻ���");
	}

	@Override
	public void fly() {
		System.out.println("���ڿ��зɡ�");
	}

}
