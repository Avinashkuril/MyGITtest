package interferance;

public class Son1 implements Mother1, Father1{

	public static void main(String[] args) {
		
		Son1 s=new Son1();
		s.money();
		s.property();
		s.nature();

	}
	
	public void money() {
		Father1.super.money();
		Mother1.super.money();
	}

	@Override
	public void property() {
		System.out.println("Son implemented Fathers property");
		
	}

	@Override
	public void nature() {
		System.out.println("SOn implemented Mothers nature");
	}

}
