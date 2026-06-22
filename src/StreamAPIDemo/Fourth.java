package StreamAPIDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Fourth {
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
		.filter(mon->mon.length()>5)
		.forEach(System.out::println);
	}
}
