import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LibraryFine {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println(libraryFine2(1, 1, 2015, 31, 12, 2014));
	}

	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		// Write your code here
		String date1 = d1+"/"+m1+"/"+y1;
		String date2 = d2+"/"+m2+"/"+y2;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date dd1 = new Date();
		try {
			dd1 = sdf.parse(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date dd2 = new Date();
		try {
			dd2 = sdf.parse(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long duration = dd1.getTime() - dd2.getTime();
		int daysDiff = Math.toIntExact(duration/(1000*60*60*24));
		int monthDiff = m1-m2;
		int multa = 0;
		if(m1>m2 && y1==y2) multa = monthDiff*500;
		else if(d1>d2 && y1==y2 && m1<=m2 && daysDiff>31) multa = daysDiff * 15;
		else if (y1>y2) multa = 10000;
		
		return multa;
	}
	
	public static int libraryFine2(int d1, int m1, int y1, int d2, int m2, int y2) {
		// Write your code here
		String date1 = d1+"/"+m1+"/"+y1;
		String date2 = d2+"/"+m2+"/"+y2;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dd1 = new Date();
		try {
			dd1 = sdf.parse(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date dd2 = new Date();
		try {
			dd2 = sdf.parse(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long duration = dd1.getTime() - dd2.getTime();
		int daysDiff = Math.toIntExact(duration/(1000*60*60*24));
		int monthDiff = m1-m2;
		int multa = 0;
		
		if (y1>y2) multa = 10000;
		else if(daysDiff > 0 && daysDiff <= 31) multa = daysDiff * 15; 
		else if (m1>m2 && y1==y2) multa = monthDiff * 500;
		
		
		return multa;
	}

}
