package test27;

interface MathOperations {

 
    default void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }


    static void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }
}

class Calculator implements MathOperations {
}

public class DefaultStaticMethodDemo {

    public static void main(String[] args) {

        Calculator obj = new Calculator();

     
        obj.add(10, 5);

        MathOperations.multiply(10, 5);
    }
}