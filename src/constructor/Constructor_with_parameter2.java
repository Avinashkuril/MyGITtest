package constructor;

public class Constructor_with_parameter2 {
	int a;
	int b;
	int c;
	public Constructor_with_parameter2() {
		a=10;
		b=20;
		c=30;
		System.out.println("Constructor with no parameter");
		System.out.println("------------");
	}
	public static void main(String[] args) {
		Constructor_with_parameter2 n1= new Constructor_with_parameter2();
		n1.addition();
		Constructor_with_parameter2 n2= new Constructor_with_parameter2(80);
		n2.addition();
		Constructor_with_parameter2 n3= new Constructor_with_parameter2(180, -50);
		n3.addition();
		Constructor_with_parameter2 n4= new Constructor_with_parameter2(300, -160, 40);
		n4.addition();
	}
	public void addition() {
		int sum=a+b+c;
		System.out.println("The addition of the no is "+sum);
		System.out.println("=============");
	}
	public Constructor_with_parameter2(int num1) {
		a=num1;
		System.out.println("");
		System.out.println("=============");
		System.out.println("Constructor with one parameter");
		System.out.println("-------------");
	}
	public Constructor_with_parameter2(int num1, int num2) {
		a=num1;
		b=num2;
		System.out.println("");
		System.out.println("=============");
		System.out.println("Constructor with two parameter");
		System.out.println("-------------");
	}
	public Constructor_with_parameter2(int num1, int num2, int num3) {
		a=num1;
		b=num2;
		c=num3;
		System.out.println("");
		System.out.println("=============");
		System.out.println("Constructor with three parameter");
		System.out.println("-------------");
	}

}
	