

package StreamAPIDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class First {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		nums.stream()
				.filter(num->num%2==0)
				.forEach(System.out::println);;
		
	}
}
