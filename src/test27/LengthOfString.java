package test27;
import java.util.*;
public class LengthOfString {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Streams", "API");
		List len_count =  words.stream()
		.map(str->str.length())
		.toList();
		
		System.out.println(len_count);
	}
}
