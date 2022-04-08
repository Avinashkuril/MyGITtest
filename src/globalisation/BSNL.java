package globalisation;

public class BSNL implements TRAI{

	@Override
	public void call() {
		System.out.println("BSNL call rates is 50p/s");
	}

	@Override
	public void data() {
		System.out.println("BSNL free data is 1.2gb/day");
	}

	@Override
	public void sms() {
		System.out.println("BSNL free sms is 120s/d");
	}
	
	public static void broadband() {
		System.out.println("BSNL provides broadband service");
	}

}
