package interferance;

public class Son implements Mother, Father{

	public static void main(String[] args) {
		
		Son s=new Son();
		s.money();
		s.nature();
		s.looks();
		s.care();
		s.nature();
		
	}

	@Override
	public void money() {
		System.out.println("Son inherited Fathers money");
	}

	@Override
	public void looks() {
		System.out.println("Son inherited Fathers looks");
	}

	@Override
	public void nature() {
		System.out.println("Son inherited Mothers nature");
	}

	@Override
	public void care() {
		System.out.println("Son inherited Mothers care");
	}

}
