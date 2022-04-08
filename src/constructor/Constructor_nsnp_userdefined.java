package constructor;

public class Constructor_nsnp_userdefined { //user defined
	public Constructor_nsnp_userdefined() {
		System.out.println("Constructor pgm for user defined");
	}
	int a=12;
	static int b=8;
	String name="Constructor";
	

	public static void main(String[] args) {
		Constructor_nsnp_userdefined e= new Constructor_nsnp_userdefined();
	System.out.println("The value of a is "+e.a);
	System.out.println("The value of b is "+b);
	System.out.println("The name of the pgm is "+e.name);
	e.test1();
	
	}
	
	public void test1() {
		System.out.println("the value is "+a);
		System.out.println("The value is "+b);
	}

}
