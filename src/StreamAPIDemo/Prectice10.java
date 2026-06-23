package StreamAPIDemo;
import java.util.*;
public class Prectice10 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		long total = nums.stream()
				.reduce(0, (acc,num)->acc+num);
		double avrg = total / (double) nums.size();
		nums.stream()
		.filter(num->num>avrg)
		.forEach(System.out::println);
		
	}
}
