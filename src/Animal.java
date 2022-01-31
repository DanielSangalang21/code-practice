
public abstract class Animal {

	public abstract void animalSound();
	
	public void animalSleep() {
		System.out.println("I am sleeping");
	}
}

class Dog extends Animal{

	@Override
	public void animalSound() {
		System.out.println("Aww aww aww");
	}
	
}
