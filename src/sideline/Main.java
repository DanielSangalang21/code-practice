package sideline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static InputStreamReader reader = new InputStreamReader(System.in);
	public static BufferedReader in = new BufferedReader(reader);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//dispArray();
		UserInputArray();
	}

	public static void dispArray() {
		String dog[] = new String[5];
		dog[0] = "Rocky";
		dog[1] = "Whitey";
		dog[2] = "Blackie";
		dog[3] = "Brownie";
		dog[4] = "Pappie";

		for (int a = 0; a < 5; a++) {
			System.out.println(dog[a]);
		}
	}

	public static void UserInputArray() throws IOException{
		String dog[] = new String[5];
		for (int c = 0; c < 5; c++) {
			System.out.print("Enter your dog's name: ");
			dog[c] = in.readLine();
		}
		for (int d = 0; d < 5; d++) {
			System.out.print(dog[d] + " ");
		}
	}
}
