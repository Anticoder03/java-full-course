package test27;

import java.util.*;
import java.util.stream.Collectors;

public class PalindromeStream {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("madam", "apple", "level", "hello");

        List<String> palindromes = words.stream()
                .filter(word -> word.equals(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList());

        System.out.println(palindromes);
    }
}