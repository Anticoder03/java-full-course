package StreamAPIDemo;
import java.util.*;
public class Eight {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,7,9,4,2));
		
		long sum_of_square = nums.stream()
				.map(num->num*num)
				.reduce(0, (acc,num)->acc+num);
		System.out.println(sum_of_square);
	}
}
