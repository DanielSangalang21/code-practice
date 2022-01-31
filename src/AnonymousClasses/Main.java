package AnonymousClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		
		
		d.bark("Lee");
		new Dog() {
			@Override
			public void bark(String name) {
				System.out.println("I couldn't talk pala HAHA Byee! "+name);
			};
		}.bark("Daniel");
	}

}
