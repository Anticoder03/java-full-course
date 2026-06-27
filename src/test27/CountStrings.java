package test27;

import java.util.*;

public class CountStrings {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Java", "C", "Python", "Go");

        long count = strings.stream()
                            .filter(str -> str.length() > 3)
                            .count();

        System.out.println("Count: " + count);
    }
}