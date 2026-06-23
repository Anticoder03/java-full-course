package StreamAPIDemo;
import java.util.*;
public class Prectice13 {
	public static void main(String[] args) {
		ArrayList<String> months = new ArrayList<>(
				Arrays.asList(
				"January",
				"February",
				"March",
				"April",
				"May",
				"June",
				"July",
				"August",
				"September",
				"October",
				"November",
				"December"
				));
		
		months.stream()
		.filter(mon->mon.contains("u"))
		.forEach(System.out::println);
	}
}
