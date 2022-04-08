package condition;

public class Else_if2 {

	public static void main(String[] args) {
		int goals=3;
		if(goals>=8) {
			System.out.println("You are top scorer Barhtolomeo Ogbeche");
		}
		else if (goals<=7 & goals>=5) {
			System.out.println("You are Igor Angulo");
		}
		else if(goals>=4) {
			System.out.println("You are Xavi Hernandes");
		}
		else if(goals>=2) {
			System.out.println("You are Jerry Mawhmingthandba");
		}
		else if(goals==1) {
			System.out.println("You are Rohit Danu");
		}
		else {
			System.out.println("No scorer");
		}
	}

}
