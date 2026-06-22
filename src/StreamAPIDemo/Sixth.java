package StreamAPIDemo;
import java.util.*;
public class Sixth {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
		long sum = nums.stream()
				.reduce(0,(acc,num)->acc+num );
		System.out.println(sum);
	}
}
