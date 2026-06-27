package test27;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

class MathOperation {
    public static int add(int a, int b) {
        return a + b;
    }
}

class Student {
    Student() {
        System.out.println("Student object created.");
    }
}

public class MethodReferenceDemo {

    // Instance Method
    public void display(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {

        // 1. Static Method 
        BiFunction<Integer, Integer, Integer> addition = MathOperation::add;
        System.out.println("Addition: " + addition.apply(10, 5));

        // 2. Instance Method
        MethodReferenceDemo obj = new MethodReferenceDemo();
        Consumer<String> print = obj::display;
        print.accept("Hello, Ashish!");

        // 3. Constructor Method
        Supplier<Student> student = Student::new;
        student.get();
    }
}