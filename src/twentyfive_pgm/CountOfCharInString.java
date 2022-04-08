package twentyfive_pgm;

public class CountOfCharInString {

	public static void main(String[] args) {
		String a="0011100111";
		int n=0;
		for(int i=0; i<=a.length()-1;i++) {
			if(a.charAt(i)=='0')
				n=n+1;
		}
		System.out.println(n);
	}
		

}
