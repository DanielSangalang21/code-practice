package FunctionPractice;

public class Dog extends Animal{
	private String breed;
	private String color;
	public Dog(String breed, String color,int legs) {
		super(legs);
		this.breed = breed;
		this.color = color;
		//this.legs = legs;
	}

}
