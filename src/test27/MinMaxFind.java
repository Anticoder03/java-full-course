package test27;
import java.util.*;

public class MinMaxFind {
	  public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 2);

	        Optional<Integer> min = numbers.stream()
	                                       .min(Integer::compareTo);

	        Optional<Integer> max = numbers.stream()
	                                       .max(Integer::compareTo);

	        min.ifPresent(value -> System.out.println("Minimum: " + value));
	        max.ifPresent(value -> System.out.println("Maximum: " + value));
	    }
}
