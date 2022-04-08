package twentyfive_pgm;

public class LCM_HCF {

	public static void main(String[] args) {
		int a=8;
		int b=12;
		
		int hcf=0;
		for(int i=1;i<=b;i++) {
			if(a%i==0 && b%i==0) {
				hcf=i;
				
			}
		}
			System.out.println(hcf);
			int lcm=a*b/hcf;
			System.out.println(lcm);
		

	}

}
