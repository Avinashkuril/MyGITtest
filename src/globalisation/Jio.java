package globalisation;

public class Jio implements TRAI{

	@Override
	public void call() {
		System.out.println("Jio call rates are 0.5p/s");
	}

	@Override
	public void data() {
		System.out.println("Jio free data is unlimited");
	}

	@Override
	public void sms() {
		System.out.println("Jio free sms is 150s/d");
	}
	
	public void d2h() {
		System.out.println("Jio provides d2h service");
	}

	
}
