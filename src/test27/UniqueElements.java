package test27;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueElements {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5);

        List<Integer> unique = numbers.stream()
                                      .distinct()
                                      .collect(Collectors.toList());

        System.out.println(unique);
    }
}
