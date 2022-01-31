package AnonymousClasses;

public class Dog {

	
	private String ownerName = "Daniel";
	private final String breed = "Dalmatian";
	public void bark(String name) {
		System.out.println("arrf arff I'm " +name);
	};

	public String getBreed() {
		return breed;
	}


	static class doggo extends Dog{
		//private static String favorite ="bone";
		private int legs;
		private String name;
		private String color;
		private String ownerName;
		private String breed;
		public int getLegs() {
			return legs;
		}
		public void setLegs(int legs) {
			this.legs = legs;
		}
	
		public void setName(String name) {
			this.name = name;
		}		
		public void setBreed() {
			this.breed = super.breed;
		}
		
		public void showDets() {
			System.out.println();
			StringBuffer bf = new StringBuffer();
			bf.append("name:").append(this.name).append(" leg:").append(this.legs).append(" Breed:").append(this.breed);
			System.out.println(bf);
		}
	}
}
