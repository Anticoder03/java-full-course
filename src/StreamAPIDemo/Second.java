package StreamAPIDemo;
import java.util.*;
public class Second {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		long count = nums.stream()
				.filter(num->num>3)
				.count();
		System.out.println(count);
	}
}
