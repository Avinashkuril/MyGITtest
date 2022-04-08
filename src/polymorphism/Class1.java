package polymorphism;

public class Class1 {
	
	public static void main(String[] args) {
		Class1 C=new Class1();
		C.add(206, 50);
		C.add();
		
		
	}
	
	public void add() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("The sum is "+sum);
	}
	
	public void add(int a,int b) {
		int sub=a-b;
		System.out.println("The sub is "+sub);
	}

}
