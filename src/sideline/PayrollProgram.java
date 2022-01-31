package sideline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayrollProgram {
	public static void main(String[] args) throws IOException {
		boolean isDone = false;
		while (!isDone) {
			System.out.print("Enter employee name: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String name = br.readLine();
			System.out.print("Press F for full-time or part-time: ");
			String type = br.readLine();
			if ("f".equals(type.toLowerCase())) {
				System.out.println("---Full-time Employee---");
				System.out.print("Enter basic pay: ");
				double pay = Double.parseDouble(br.readLine());
				System.out.println("------------------------");
				System.out.println("Employee Name:" + name);
				System.out.println("Basic Pay:" + pay);
			} else if ("p".equals(type.toLowerCase())) {
				System.out.println("---Part-time Employee---");
				System.out.print("Enter rate per hour: ");
				double rate = Double.parseDouble(br.readLine());
				System.out.print("Enter no. of hours worked: ");
				double hours = Double.parseDouble(br.readLine());
				System.out.print("Enter no. of overtime: ");
				int ot = Integer.parseInt(br.readLine());
				System.out.println("------------------------");
				System.out.println("Employee Name:" + name);
				System.out.println("Basic Pay:" + rate * hours);
				System.out.println("Overtime Pay:" + rate * hours);
			}
			System.out.println();
			System.out.print("Do you want another transaction? 1 - Yes;2 - No.: ");
			int choice = Integer.parseInt(br.readLine());
			if(choice == 2) {
				isDone = true;
			}
		}
	}
}
