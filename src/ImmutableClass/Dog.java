package ImmutableClass;

@FunctionalInterface
public interface Dog extends Animals {
	public static void Bark() {
		System.out.println("Arrf arff");
	};
}
