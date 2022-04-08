package polymorphism;

public class Run_time2 extends Run_time{

	public static void main(String[] args) {
		Run_time2 r=new Run_time2();
		r.add();
		Run_time r2=new Run_time();
		r2.add();
	}
	
	
	void add() {
		int a=30;
		int b=50;
		int sum=a+b;
		System.out.println("The add is "+sum);
	}
}
