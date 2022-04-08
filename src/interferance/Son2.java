package interferance;

public class Son2 implements Father2, Mother2{

	public static void main(String[] args) {
		Father2.money();
		Mother2.money();
	}

}
