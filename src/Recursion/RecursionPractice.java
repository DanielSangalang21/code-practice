package Recursion;

public class RecursionPractice {

	public static void printNum(int num) {
		if(num !=0) {
			System.out.println(num);
			printNum(num-1);
		}
	}
	
	public static int catEyes(int cats) {
		if (cats == 0) {
			return 0;
		} else {
			return 2 + catEyes(cats - 1);
		}
	}
	
	public static int power(int base,int num) {
		if (num == 1) {
			return base;
		} else {
			return base * power(base,num-1);
		}
	}
	
	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
	
	public static int fibonacci(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 2 || num == 1) {
			return 1;
		} else {
			return  fibonacci(num - 1) + fibonacci(num-2);
		}
	}

	public static int mobileSpeakers(int num) {
		if (num == 0) {
			return 0;
		} else if (num % 2 == 0) {
			return 2 + mobileSpeakers(num - 1);
		} else {
			return 1 + mobileSpeakers(num - 1);
		}
	}
	
	public static int sumDigits(int num) {
		// int sum = 0;
		if (num <= 9) {
			return num;
		} else {
			return num % 10 + sumDigits(num / 10);

		}
	}
	
	public static int count5(int num) {
		//int total = 0;
		if(num<=9) {
			if(num == 5) {
				return 1;
			}return 0;
		}
		if (num%10 == 5) {
			return 1 + count5(num/10);
		} else {
			return count5(num/10);

		}
	}
	
	public static int binarySearch(int[] nums, int key, int start, int end) {
		if (start <= end) {
			int middle = (start + end) / 2;

			if (nums[middle] > key) {
				return binarySearch(nums, key, start, middle - 1);
			} else if (nums[middle] < key) {
				return binarySearch(nums, key, middle + 1, end);
			} else {
				return middle;
			}
		}else {
			return -1;
		}
	}
}
