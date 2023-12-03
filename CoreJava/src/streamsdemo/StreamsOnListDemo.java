package streamsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOnListDemo {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Vishal");
		names.add("Abhishek");
		names.add("Anant");
		names.add("Shubham");
		names.add("Ashok");
		
		// traditional method
		
		int count = 0;
		
		for(String name : names) {
			if(name.startsWith("A")) {
				count++;
			}
		}
		
		System.out.println("count of the names starting with 'A': " + count);
		System.out.println("-------------------------------------------------------------------------------------------");
		filterDemo(names);
		limitDemo(names);
		streamMapMethodDemo(names);
		streamCollect(names);
	}
	
	static void filterDemo(List<String> names) {
		
		// using streams
		System.out.println("Count using streams: " + names.stream().filter(name -> name.startsWith("A")).count());
		
		// another way
		System.out.println("Again Count using streams: " + Stream.of("Anant", "Vishal", "Ashok", "Abhishek", "Shubham").filter(name -> name.startsWith("A")).count());

		// Printing names using streams
		System.out.println("Names with length greartor than 5 are: ");
		names.stream().filter(name -> name.length() > 5).forEach(s -> System.out.println(s));
		
		System.out.println("-------------------------------------------------------------------------------------------");
	}
	
	static void limitDemo(List<String> names) {
		// Limiting names using limit method
		System.out.println("Names with length greartor than 5 after limiting to count of 2 are: ");
		names.stream().filter(name -> name.length() > 5).limit(2).forEach(s -> System.out.println(s));
		System.out.println("-------------------------------------------------------------------------------------------");
	}
	static void streamMapMethodDemo(List<String> names) {
		
		// print names having last letter as l into upper case
		System.out.println("Names ending with letter 'l' in upper case are: ");
		names.stream().filter(s -> s.endsWith("l")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		System.out.println("-------------------------------------------------------------------------------------------");
		
		// Sorting the results
		List<String> names2 = Arrays.asList("Ashutosh", "Pappu", "Amber", "Avneet", "Harshita");
		System.out.println("Names starting with 'A': in upper case are: ");
		names2.stream().filter(name -> name.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		System.out.println("-------------------------------------------------------------------------------------------");
		
		// merging two lists
		Stream<String> concatedStream = Stream.concat(names.stream(), names2.stream());
		System.out.println("Results of merging two streams and sorting them: ");
		concatedStream.sorted().forEach(s -> System.out.println(s));
		
		System.out.println(names.stream().anyMatch(s->s.equalsIgnoreCase("vishal")));
		System.out.println("-------------------------------------------------------------------------------------------");
	}
	
	
	// meant for creating new list or storing results from a stream
	static void streamCollect(List<String> names) {
		List<String> results =  names.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(results.get(0));
	}

}
