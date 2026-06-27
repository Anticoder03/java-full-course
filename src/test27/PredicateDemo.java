package test27;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 15, 3, 10, 25);

    
        Predicate<Integer> greaterThanTen = num -> num > 10;

    
        List<Integer> filteredList = numbers.stream()
                                            .filter(greaterThanTen)
                                            .collect(Collectors.toList());

   
        System.out.println("Original List: " + numbers);
        System.out.println("Filtered List (Greater than 10): " + filteredList);
    }
}