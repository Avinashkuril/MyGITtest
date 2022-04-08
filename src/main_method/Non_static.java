package main_method;

public class Non_static {

	public static void main(String[] args) {
		newone.goal1();
		newone.goal2();
		newone.goal2();
		Non_static goal4= new Non_static();
		goal4.goal5();
		goal4.goal6();
		goal4.goal6();
	}
	public void goal5()
	{
		System.out.println("To give to do");
	}
	public void goal6()
	{
		System.out.println("To do something");
	}
	

}


