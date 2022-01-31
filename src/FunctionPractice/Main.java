package FunctionPractice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog("Dalm","brown",4);
		Dog d2 = new Dog("Pug","black",4);
		d1.setType("dog");
		d2.setType("dog");
		d1.setName("aso");
		d2.setName("asona");
		Bird b1 = new Bird(2);
		Bird b2 = new Bird(2);
		b2.setType("bird");
		b2.setName("maya");
		b1.setType("bird");
		b1.setName("mayana");
		
		List<Animal> animals = Arrays.asList(d1,d2,b1,b2);
		//Map<String, Animal> mappings = animals.stream().collect(Collectors.toMap(Animal::getType, Function.identity()));
		//key value with duplicate key
		HashMap<String,List<Animal>> animalMap =  (HashMap<String, List<Animal>>) animals.stream().
				collect(Collectors.toMap(Animal::getType,(a)->Collections.singletonList(a), (a,b) -> {
																List<Animal> an = new ArrayList<>(a);
																an.addAll(b);
																return an;
															}));
		Map<Boolean, List<Animal>> mapping = animals.stream().collect(Collectors.partitioningBy((x) -> x.getLegs()>2));
		
		Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
		Map<String, String> countryToLocales = locales.collect(
				 Collectors.groupingBy(Locale::getCountry,Collectors.mapping(Locale::getDisplayLanguage, Collectors.joining(", "))));
		//Stream<Integer> integers = Integer.range(0, 100).boxed();
		
		//animals.stream().collect(Collectors.toMa)
		int[] shortWords = new int[7];

		//	Predicate p;
		IntStream ts = IntStream.of(1,2,4,5,6);
		
		/*
		 * Map<Object, List<String>> mp =
		 * words.collect(Collectors.groupingBy(String::length)); // Error—race
		 * condition! System.out.println(Arrays.toString(shortWords));
		 */
		System.out.println(ts.summaryStatistics().getMax());
	}
	


}
