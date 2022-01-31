import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicSquare {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> nums1 = Arrays.asList(6,1,2);
		List<Integer> nums2 = Arrays.asList(7,2,6);
		List<Integer> nums3 = Arrays.asList(5,6,2);
		list.add(nums1);
		list.add(nums2);
		list.add(nums3);
		
		System.out.println(formingMagicSquare(list));
	}

	public static int formingMagicSquare(List<List<Integer>> s) {
	
		int[][] sq = {{8,1,6,3,5,7,4,9,2},
		              {6,1,8,7,5,3,2,9,4},
		              {4,9,2,3,5,7,8,1,6},
		              {2,9,4,7,5,3,6,1,8},
		              {8,3,4,1,5,9,6,7,2},
		              {4,3,8,9,5,1,2,7,6},
		              {6,7,2,1,5,9,8,3,4},
		              {2,7,6,9,5,1,4,3,8}};
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < sq.length; i++) {
			int total = 0;
			for (int j = 0; j < sq[i].length; j++) {
				int val = s.get(j/3).get(j%3);
				total += Math.abs(val - sq[i][j]);
			}
			if(total<min) min = total;
		}
		
		return min;
	}

}
