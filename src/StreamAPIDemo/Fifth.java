package StreamAPIDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Fifth {
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
		        )
		);
		months.stream()
		.filter(mon->mon.toLowerCase().endsWith("y"))
		.forEach(System.out::println);
	}
}
