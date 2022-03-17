package overriding1;

interface DefaultClass {
	default void display() {
		System.out.println("Default from overriding1");
	}
}
