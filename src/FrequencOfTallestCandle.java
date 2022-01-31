import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencOfTallestCandle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int candlesCount = Integer.parseInt(reader.readLine().trim());
		
		 List<Integer> candles = Stream.of(reader.readLine().replaceAll("\\s+$", "").split(" "))
		            .map(Integer::parseInt)
		            .collect(Collectors.toList());
		 
		 int tallest = Collections.max(candles);
		 
		 int frequency = Collections.frequency(candles, tallest);
		 
		 System.out.println(frequency);
	}
}
