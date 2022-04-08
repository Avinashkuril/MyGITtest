package interferance;

public interface Mother1 {

	void nature();
	default void money() {
		System.out.println("Mothers money");
	}
}
