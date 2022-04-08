package access1;

public class Access_specifier1 {
	
	public static void pblc() {
		System.out.println("This is public access identifier");
	}
	
	private static void pvt() {
		System.out.println("This is private access identifier");
	}
	
	protected void ptd() {
		System.out.println("This is protected access identifier");
	}
	
	void dflt() {
		System.out.println("This is default access identifier");
	}
	public static void main(String[] args) {
		pblc();
		pvt();
		Access_specifier1 A= new Access_specifier1();
		A.ptd();
		A.dflt();
	}
}	
