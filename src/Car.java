import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean quit = false;
		while(!quit) {
			Scanner scan= new Scanner(System.in);
			String action = scan.nextLine();
			quit = carAction(action);
		}
		
	}
	
	public static boolean carAction(String action) {
		if("stop".equalsIgnoreCase(action)) {
			System.out.println("car stopped");
			return false;
		}else if("start".equalsIgnoreCase(action))  {
			System.out.println("car started");
			return false;
		}else if("help".equalsIgnoreCase(action)) {
			System.out.println("Start: start the car \n"
					+ "Stop : stop the car \n"
					+ "Quit : stop the game");
			return false;
		}else if("quit".equalsIgnoreCase(action)) {
			return true;
		}else {
			System.out.println("Unknown Action");
			return false;
		}
	}

}
