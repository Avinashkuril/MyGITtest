package this_super_keyword;

public class This_super1 {
	
	static int a=100;
	static int b=200;
	int c=500;
	public static void main(String[] args) {
		
		This_super1 S=new This_super1();
		S.add();
		
	}
	
	public  void add() {
		int a=500;
		int add=this.a+b;
		System.out.println("The addition of sum is "+add);
		
	}
	
	
}
