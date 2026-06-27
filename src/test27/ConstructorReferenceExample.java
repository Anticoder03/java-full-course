package test27;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class ConstructorReferenceExample {
    public static void main(String[] args) {

        BiFunction<String, Integer, Student> studentCreator = Student::new;

        List<Student> students = Arrays.asList(
                studentCreator.apply("Ashish", 22),
                studentCreator.apply("Rahul", 21),
                studentCreator.apply("Priya", 20)
        );

        students.forEach(System.out::println);
    }
}
