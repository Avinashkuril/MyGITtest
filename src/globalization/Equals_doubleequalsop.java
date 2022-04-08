package globalization;

public class Equals_doubleequalsop {

	public static void main(String[] args) {
//		String a="Avinash"; //string without new keyword
//		String a1="Avinash";
//		System.out.println(a==a1);
//		System.out.println(a.equals(a1));
//	
//		String b=new String("Avinash");
//		String b1=new String("avinash");
//		System.out.println(b==b1);
//		System.out.println(b.equals(b1));
//		
//		String c="Avinash Kuril";
//		System.out.println("");
//		System.out.println(c.length());
//		System.out.println();
//		System.out.println(c.toUpperCase());
//		System.out.println();
//		System.out.println(c.toLowerCase());
//		
//		int length=c.length();
//		System.out.println();
//		System.out.println(length);
//		System.out.println(length);
//		
//		System.out.println();
//		System.out.println(b.equalsIgnoreCase(b1));
//		System.out.println();
//		System.out.println(b.contains("ni"));
//		
//		String ab="";
//		String ba=" ";
//		System.out.println();
//		System.out.println(ab.isBlank());
//		System.out.println(ba.isBlank());
//		System.out.println();
//		System.out.println(ab.isEmpty());
//		System.out.println(ba.isEmpty());
//		
//		String abc="Avinash Kuril";
//		
//		System.out.println();
//		System.out.println(abc.charAt(8));
//		System.out.println();
//		System.out.println(abc.substring(5));
//		System.out.println();
//		System.out.println(abc.substring(5, 12));
//		System.out.println();
//		System.out.println(abc.subSequence(1, 5));
		
		System.out.println();
		String a="Avinash ";
		String b="Madan ";
		String c="Kuril";
		System.out.println(a.concat(b).concat(c));
		String d= a.concat(b).concat(c);
//		System.out.println();
//		System.out.println("The concat is--> "+d);
		System.out.println();
		System.out.println(d.replace('a','v' ));
		System.out.println();
		System.out.println(d.replace("as","sa"));
		
		
		System.out.println();
		System.out.println(d.replaceAll("Avinash", "Kuril"));
		
		System.out.println();
		System.out.println(d.replaceFirst("Avinash", "Madan"));
		
		
		
		
		
		
		
	
	}
	

}
