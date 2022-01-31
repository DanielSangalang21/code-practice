import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayOfTheProgrammer {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		int year = 1917;
		dayOfProgrammer(year);

	}

	public static String dayOfProgrammer(int year) {
		// Write your code here
		if (year == 1918) {
			return "26.09.1918";
		}
		String date = "01.01." + year;
		Boolean leapYear = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leapYear = true;
				}else
					leapYear = false;	
			}
			else {
				leapYear = true;
			}
		} else {
			leapYear = false;
		}

		String dOfProgrammer = "";
		String dIfLeap = "12.09." + year;
		String dIfNotLeap = "13.09." + year;
		
		if(year>1918) { 
			if (leapYear)
				dOfProgrammer = dIfLeap;
			else
				dOfProgrammer = dIfNotLeap;
			return dOfProgrammer;
		}else {	 
			if (year%4==0) 
				dOfProgrammer = dIfLeap; 
			else 
				dOfProgrammer = dIfNotLeap;
			return dOfProgrammer;
		} 
	}

}
