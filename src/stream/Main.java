package stream;

import java.awt.Color;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String path =
		 * "C:\\Users\\Daniel\\Desktop\\Learning Materials\\Spring in Action, 4th Edition.pdf"
		 * ; String c = getFileAsString(path); String[] strArray = stringAsArray(c);
		 * Stream<String> stream = Stream.of(strArray); Stream<String> stream2 =
		 * Stream.of(strArray);
		 */
		

	//print(10,(i)->System.out.println(i));
	//sysPrint(getFuncInterface("daniel"));
		Thread t = new Thread() {
			
		};
	}
	
	public static void sysPrint(UnaryOperator<Double> f) {
		System.out.println(f.apply(100.00));
	};
	
	public static UnaryOperator<Double> getFuncInterface(String word){
		Double number = word.length() + 0.0;
		return c -> c + number/2;
	}  
	  
	public static Stream<Character> characterStream(String s) {
		return IntStream.range(0, s.length()).mapToObj(x -> s.charAt(x));
		//Stream<Character> ch = IntsStream.
		
	}
	
	public static  void print(int num,IntConsumer c) {
		for(int i =0;i<num ;i++) c.accept(i);
	}

	public static <T> Stream<T> listToStream(List<T> list){
		return list.stream();
	}
	
	public static long getStreamSpeed(Stream<String> stream){
		long before = System.currentTimeMillis();
		
		List<String> c1  = (List<String>) stream.filter((x)-> {
			return ( x.length() > 9); 
			}).collect(Collectors.toList());
		
		long after = System.currentTimeMillis();
		return after-before;
	}
	
	public static String[] stringAsArray(String str) {
		return str.split("[\\P{L}]+");
	}
	public static <T> Stream<T> listToParallelStream(List<T> list){
		return list.stream().parallel();
	}
	
	public static <T> void loopStream(Stream<T> stream) {
		stream.forEach(System.out::println);
	}
	
	public static <T> void loopStreamWithProcessorCheck(Stream<T> stream) {
		stream.forEach(x -> {
			System.out.println(x + " Processors: "+ Runtime.getRuntime());
		});
	}
	
	public static <T> Integer streamElementCount(Stream<T> stream) {
		return (int) stream.count();
	}
	
	public static String getFileAsString(String filePath) {
		try {
			return new String(Files.readAllBytes(Paths.get(filePath)),StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	public static <T> boolean isFinite(Stream<T> stream) {
		return stream.count() < Long.MAX_VALUE;
		
	}
	
	 public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
		 Stream<T> stream;
		 return null;
	 }

	 public static <T> ArrayList<T> flatMapToList(Stream<Stream<T>> stream){
		 return (ArrayList<T>) stream.flatMap((x) -> x ).collect(Collectors.toList());
	 }
	 
	 public static Double computeAve(Stream<Double> stream){
		
		return stream.reduce(0.0,(x,y) ->  x+y) / stream.count();
		//return 0.0;
	 }
	
}
