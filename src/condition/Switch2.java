package condition;

public class Switch2 {
	static int a=12;
	static int b=20;
	static int c=35;
	public static void sum() {
		int sum=a+b+c;
		System.out.println("The addition of the no is "+sum);

	}
	public static void sub() {
		int sub=c-b-a;
		System.out.println("The substraction of the no is "+sub);
	}
	public static void mul() {
		int mul=a*b*c;
		System.out.println("The multiplication of the no is "+mul);
	}
	public static void main(String[] args) {
		char choice='C';
	switch (choice) {
	case 'A':
		sum();
		break;
	case 'B':
		sub();
		break;
	case 'C':
		mul();
		break;

	default:System.out.println("Enter valid choice");
		break;
	}	
		
		
	
	}

}
