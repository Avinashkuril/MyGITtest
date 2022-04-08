package constructor;

public class Constructor_with_parameter {
	int a;
	int b;
	int c;
	
	public Constructor_with_parameter(){
		a=10;
		b=20;
		c=30;
		System.out.println("Constructor with zero parameter");
	}
	public void addition() {
		int sum=a+b+c;
		System.out.println("The addition of the no. is "+sum);
	}
	public static void main(String[] args) {
		Constructor_with_parameter N= new Constructor_with_parameter();
		N.addition();
		Constructor_with_parameter N1= new Constructor_with_parameter(50);
		N1.addition();
		Constructor_with_parameter N2= new Constructor_with_parameter(30, 70);
		N2.addition();
		Constructor_with_parameter N3= new Constructor_with_parameter(5, 10, 2);
		N3.addition();
		
	}
	public Constructor_with_parameter(int num1) {
		a=num1;
		System.out.println("============");
		System.out.println("Constructor with one parameter");

	}
	public Constructor_with_parameter(int num1,int num2) {
		a=num1;
		b=num2;
		System.out.println("============");
		System.out.println("Constructor with two parameter");
	}
	public Constructor_with_parameter(int num1,int num2,int num3) {
		a=num1;
		b=num2;
		c=num3;
		System.out.println("============");
		System.out.println("Constructor with three parameter");
	}

}
