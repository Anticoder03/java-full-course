package test27;
import java.util.*;
public class EvenNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		List even = numbers.stream()
		.filter(num->num%2==0)
		.toList();
		System.out.println(even);
	}
}
