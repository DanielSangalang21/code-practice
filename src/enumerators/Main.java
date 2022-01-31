package enumerators;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Counter count : Counter.values()){
			System.out.println(count.name());
			System.out.println(count);
		}
		
	}

}
