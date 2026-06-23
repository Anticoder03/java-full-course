package StreamAPIDemo;
import java.util.*;
public class Prectice16 {
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
		long count = months.stream()
				.filter(mon->mon.startsWith("M"))
				.count();
		System.out.println(count);
	}
}
