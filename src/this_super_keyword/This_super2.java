package this_super_keyword;

public class This_super2 extends This_super1{

	public static void main(String[] args) {
		This_super2 T=new This_super2();
		T.add();
	}
	public void add() {
		int a=1000;
		int sum=super.a+a;
		System.out.println("The add is "+sum);
	}

}
