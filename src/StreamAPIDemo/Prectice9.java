package StreamAPIDemo;
import java.util.*;
public class Prectice9 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		nums.stream()
		.map(num->num*num)
		.filter(num->num>20)
		.map(num->Math.sqrt(num))
		.forEach(System.out::println);
	}
}
