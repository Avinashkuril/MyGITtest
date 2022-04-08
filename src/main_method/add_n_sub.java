package main_method;

public class add_n_sub {
public void addition()
{
	int a=10;
	int b=19;
	int sum=a+b;
	System.out.println("The addition of the no. is "+sum);
}
	public static void main(String[] args) {
		new add_n_sub().addition();

	new add_n_sub().sub();
	}

	public void sub()
	{
		int x=20;
		int y=15;
		int sub=x-y;
		System.out.println("The substraction of the no. is "+sub);
	}
	
}
