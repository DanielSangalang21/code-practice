import java.util.Arrays;
import java.util.List;

public class BillDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> bill = Arrays.asList(3,10,2,9);
		bonAppetit(bill,1,12);
	}
	
	 public static void bonAppetit(List<Integer> bill, int k, int b) {
		 int totalPrice = 0;
		 for (int i=0;i<bill.size();i++) {
			 if (i==k) 
				 continue;
			 else
				 totalPrice += bill.get(i);
		 }
		 
		 int mustBill = totalPrice / 2;
		 if(mustBill==b)
			 System.out.println("Bon Appetit");
		 else
			 System.out.println(b - mustBill);
	}


}
