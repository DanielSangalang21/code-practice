package ImmutableClass;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	private static final ConcurrentHashMap<String,ImmutableLogin> mapImmutableLogin = new ConcurrentHashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		changeImmutableLogin();
		
		
	}
	
	public static void changeImmutableLogin()
	{
		File file =new File("C:\\DB backup\\Library");
		
		//File[] filtered = file.listFiles();
		
		FileFilter f = (File fe) -> fe.getPath().matches("/[0-1]/");
		File[] filtered = file.listFiles();
		
		
		//List<String> words = Arrays.asList("Daniel","daniel","Sangaalng","Catapanng");
		String[] words1 = {"Daniel","daniel","Sangaalng","Caho","Casipit","Casimiro"};
		Optional<String> min = Arrays.stream(words1).filter((x) -> x.startsWith("C")).peek((x) -> System.out.println(x)).findAny();
		if (min.isPresent()) System.out.println("yes");
		
		
		boolean isWithQ = Arrays.stream(words1).anyMatch((x)-> x.startsWith("C"));
		
		String strict = "daniel";
		Optional<String> str = Optional.ofNullable(strict);
	//	str.fla
		
		
		Stream<Integer> nums = Stream.of(1,2,3); 
		Optional<Integer> sum = nums.reduce(Integer::sum);
		
		Stream<String> names = Stream.of("Daniel","catapang","sanagalng");
		//names.collect(Collectors.tp)
		
		int[] res1 = names.mapToInt((x) -> x.length()).toArray();
		
		// nums.collect(Collectors.toList());
		
		
	}
	
	public static Optional<Double> squareRoot(Double x) {
		 return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
	}
	
	public static Optional<Double> inverse(Double x) {
		 return x == 0 ? Optional.empty() : Optional.of(1 / x);
	}
	
	public static Optional<Integer> getEven(Integer[] nums){
		return Arrays.stream(nums).filter((x) -> x % 2 == 0 ).findAny();
	}
	
	public static Optional<Integer> squared(Integer x) {
		return x > 0 ? Optional.of(x*x) : Optional.empty();
	}
	
	

}
