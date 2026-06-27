package test27;
import java.util.*;
public class First {

	public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        List<Integer> evenNumbers = arr.stream()
                                       .filter(num -> num % 2 == 0)
                                       .toList();

        System.out.println("Even Numbers: " + evenNumbers);
        
      //2nd
    	
    	Calc add = (a,b) -> a+b;
    	Calc sub = (a,b) -> a-b;
    	Calc mul = (a,b) -> a*b;
    	Calc dev = (a,b) -> a/b;
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + add.calculate(a, b));
        System.out.println("Subtraction: " + sub.calculate(a, b));
        System.out.println("Multiplication: " + mul.calculate(a, b));
        System.out.println("Division: " + dev.calculate(a, b));
    }

		
	
	 
	
}
