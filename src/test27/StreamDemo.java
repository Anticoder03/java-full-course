package test27;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Java", "C", "Python", "Go", "HTML", "CSS", "Spring"
        );

        List<String> result = names.stream()
                .filter(name -> name.length() >= 4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Original List: " + names);
        System.out.println("Processed List: " + result);
    }
}