package globalisation;

public class Telecom_provider {

	public static void main(String[] args) {
		Airtel a=new Airtel();
		System.out.println("The price of Airtel sim is "+TRAI.sim_price);
		System.out.println("---------------------------");
		a.call();
		a.data();
		a.sms();
		Airtel.money();
		System.out.println("===========================");
		System.out.println("");
		
		BSNL b=new BSNL();
		System.out.println("The price of Bsnl sim is "+TRAI.sim_price);
		System.out.println("----------------------------");
		b.call();
		b.data();
		b.sms();
		BSNL.broadband();
		System.out.println("============================");
		System.out.println("");
		
		Jio j=new Jio();
		System.out.println("The price of jio sim is "+TRAI.sim_price);
		System.out.println("----------------------------");
		j.call();
		j.data();
		j.sms();
		j.d2h();
		
		System.out.println("");
		
		
		
		
	}

}
