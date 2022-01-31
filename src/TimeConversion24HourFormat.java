import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion24HourFormat {
	
	  static String timeConversion(String s) throws ParseException{
		  //the parser or input sdf must be the same as the string format 
		  //while the output sdf must be your desired output format
		  //note: sdf = SimpleDateFormat
	        DateFormat outputformat = new SimpleDateFormat("hh:mm:ssaa");
	        Date d1  = outputformat.parse(s);
	        return new SimpleDateFormat("HH:mm:ss").format(d1);
	    }

	    private static final Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) throws IOException,ParseException  {
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        String s = scan.nextLine();
	        String result = timeConversion(s);

	        bw.write(result);
	        bw.newLine();

	        bw.close();
	    }
}
	   