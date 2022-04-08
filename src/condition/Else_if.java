package condition;



public class Else_if {

	public static void main(String[] args) {
		int marks=00;
		if(marks==40) {
			System.out.println("You are pass");
		}
		else if(marks>=40 & marks<60) {
			System.out.println("You are passed with 2nd class");
		}
		else if(marks>=60 & marks<75) {
			System.out.println("You are passed with 1st class");
		}
		else if(marks>=75) {
			System.out.println("You are passed with distinction");
		}
		else {
			System.out.println("You are fail");
		}
	}

}
