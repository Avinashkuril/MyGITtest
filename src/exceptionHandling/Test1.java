package exceptionHandling;

public class Test1 {

	public static void main(String[] args) {
		
		String a="a,b,c";
		
		
		try {
			
			System.out.println(a.charAt(-1));
		} 
		
		catch (ArithmeticException e) {
			System.out.println("no");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("cant execute");
		}
		finally {
			System.out.println("abc");
		}

	}

}
