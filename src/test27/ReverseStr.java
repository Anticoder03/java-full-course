package test27;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ReverseStr {
	


	    public static void main(String[] args) {

	        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry");

	        List<String> sortedFruits = fruits.stream()
	                                          .sorted((a, b) -> b.compareTo(a))
	                                          .collect(Collectors.toList());

	        System.out.println("Input: " + fruits);
	        System.out.println("Output: " + sortedFruits);
	    }
	
}
