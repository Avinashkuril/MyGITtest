package array;

public class Test1 {

	public static void main(String[] args) {
		String a="Avinash ";
		String b="Madan ";
		String c="Kuril";
		String d=a.concat(b).concat(c);
		System.out.println(d);
		
		System.out.println();
		
		String Ar[]=new String[5];
		Ar[0]="Avinash ";
		Ar[1]="Madan ";
		Ar[2]="Kuril";
		System.out.println(Ar[0]);
		System.out.println(Ar[1]);
		System.out.println(Ar[2]);
		System.out.println(Ar[0]+Ar[1]+Ar[2]);
		
		System.out.println();
		
		for(int i=0;i<=2;i++) {
			System.out.print(Ar[i]);
		}
		
		
		
		
		
		  
		
	
	}

}
