package StreamAPIDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Nine {
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
		
		String 	con_months = months.stream()
				.reduce("", (acc,mon)->acc+mon);
		System.out.println(con_months);
	}
	
}
