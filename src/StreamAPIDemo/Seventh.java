package StreamAPIDemo;
import java.util.*;
public class Seventh {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,7,9,4,2));
		
//		int max = nums.stream()
//		        .max(Integer::compareTo)
//		        .orElse(0);
		int max = nums.stream()
		        .reduce(0, (acc, num) -> acc > num ? acc : num);

		System.out.println(max);
		System.out.println(max);
	}
}
