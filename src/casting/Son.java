package casting;

public class Son extends Father{

	public static void main(String[] args) {
		
		new Father().bike();
		new Father().car();
		Father f=new Son();
		f.bike();
		f.car();
		new Son().plane();

		
	}

	void bike() {
		System.out.println("Sons bike is bullet");
	}
	
	void car() {
		System.out.println("Sons car is lamborghini urus");
	}
	
	void plane() {
		System.out.println("Sons plane is apache");
	}
}

