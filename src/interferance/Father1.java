package interferance;

public interface Father1 {
	
	void property();
	default void money() {
		System.out.println("Fathers money");
	}

}
