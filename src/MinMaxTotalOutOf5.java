import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxTotalOutOf5 {

public static void main(String[] args) throws IOException {
		
	int nums[] = {5, 5, 5, 5 ,5};

	 long min=Long.MAX_VALUE,max=Long.MIN_VALUE,maxTotal=0,minTotal=0;
	 boolean same = Arrays.stream(nums).allMatch(s -> s == nums[0]);
	 
	 if(same) {
		minTotal = maxTotal = nums[0] * 4;
		System.out.println(minTotal+ " "+maxTotal);
		return;
	 }

     for(long num : nums){
         if (num<=min){
             min = num;
         }
         if(num>=max){
             max = num;
         }
     }
     
	 boolean checkedFlagMin=false,checkedFlagMax = false;  
	 for(long num:nums) {
		 if(num == min && !checkedFlagMin) {
			 checkedFlagMin = true;
			 continue;
		 } maxTotal+=num;
	 }
	 
	 for(long num:nums) {
		 if(num == max && !checkedFlagMax) {
			 checkedFlagMax = true;
			 continue;
		 } minTotal+=num;
	 }
	 
     System.out.println(minTotal+ " "+maxTotal);
	}
}
