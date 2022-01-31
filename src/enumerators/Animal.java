package enumerators;

public class Animal {
	
	private int AnimalCode;
	private String action;
	
	public int getAnimalCode() {
		return AnimalCode;
	}

	public String getAction() {
		return action;
	}

	public void setAnimalType(AnimalAction action) {
		this.AnimalCode = action.getAnimalCode();
		this.action = action.getAction();
	}
}
