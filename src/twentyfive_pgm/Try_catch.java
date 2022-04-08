package twentyfive_pgm;

public class Try_catch {

	public static void main(String[] args) {
		try {                //try will execute when there is no exception 
			int a=10/1;
			System.out.println("open");
			System.out.println("read");
		} catch (Exception a) {               //catch will execute when there is exception in try
			System.out.println("write");
		}
		finally {                     //whatever happen in try and catch finally will execute
			System.out.println("close");
		}

	}

}
