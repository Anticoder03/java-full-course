package StreamAPIDemo;
import java.util.*;
public class Prectice11 {
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
		.filter(mon->mon.endsWith("r"))
		.forEach(System.out::println);;
	}
}
