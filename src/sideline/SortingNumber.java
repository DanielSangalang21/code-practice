package sideline;

import java.io.*;

public class SortingNumber {
	public static InputStreamReader reader = new InputStreamReader(System.in);
	public static BufferedReader in = new BufferedReader(reader);
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] nums = new int[5];
		System.out.println("Enter five numbers:");
		for (int i=0; i<5;i++) {
			String number = in.readLine();
			nums[i] = Integer.parseInt(number);
		}
		
		System.out.println("Array List Unsorted: ");
		for(int i = 0; i < 5; i++) {
			System.out.print(nums[i] +" ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (nums[i] < nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		System.out.println("Array List Sorted: ");
		for(int i = 0; i < 5; i++) {
			System.out.print(nums[i] +" ");
		}
	}

}
