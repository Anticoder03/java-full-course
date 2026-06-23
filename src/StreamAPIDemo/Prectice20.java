package StreamAPIDemo;
import java.util.*;
public class Prectice20 {
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
		.filter(mon->mon.toLowerCase()
				.chars()
				.filter(ch->ch=='r')
				.count()==2)
		.forEach(System.out::println);
		
		
		
	}
}
