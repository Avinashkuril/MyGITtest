package loop;

public class Prime_no {

	public static void main(String[] args) {
		int i=2;
		int n=15;
		
		if(n%i==0) {
			System.out.println("It is not a prime no");
		}
		else {
			for(i=2;i<=n;i++) {
				if(n%i==1) {
					System.out.println("It is a prime no");
				}
						}
	}
	}
}
