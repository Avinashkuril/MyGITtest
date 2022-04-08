package variable_type;

public class Variable {
	int a=10;
	static int b=20;
	
	public static void main(String[] args) {
		Variable s= new Variable();
		s.addition();
	}
	public void addition() {
		int c=30;
		int sum=c+a;
		System.out.println("The addition of no is "+sum);
		substraction();
	}
	public static void substraction() {
		int d=-30;
		int sub=b+d;
		System.out.println("");
		System.out.println("===========");
		System.out.println("The substraction of the no is "+sub);
		System.out.println("===========");
		
	}
}
