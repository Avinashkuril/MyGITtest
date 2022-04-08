package condition;

public class Nested_if_else_2 {

	public static void main(String[] args) {
		String name="Avinash";
		String pw="password";
		String captcha="Ad121dA";
		if(name=="Avinash") {
			System.out.println("Enter pw");
			if(pw=="password") {
				System.out.println("Enter captcha");
				if(captcha=="Ad121dA") {
					System.out.println("Welcome");
				}
				else {
					System.out.println("Incorrect captcha");
				}
			}
				else 
				{
					System.out.println("Incorrect pw");
				}
		}
				else 
				{
					System.out.println("Incorrect username");
				}
			}
	
	
	}
	
