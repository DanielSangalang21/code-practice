package enumerators;

public enum AnimalType implements AnimalAction {
	DOG(01), CAT(02), BIRD(03), FISH(04);

	private int AnimalCode;
	private String action;

	AnimalType(int i) {
		this.AnimalCode = i;
		if (i == 01 || i == 02) {
			this.action = "walk";
		} else if (i == 03) {
			this.action = "fly";
		} else {
			this.action = "swim";
		}
	}

	@Override
	public String getAction() {
		// TODO Auto-generated method stub
		return this.action;
	}

	@Override
	public int getAnimalCode() {
		// TODO Auto-generated method stub
		return this.AnimalCode;
	}
}
