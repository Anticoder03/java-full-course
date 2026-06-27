package test27;

import java.util.function.Consumer;
import java.util.function.Function;

class Message {

    // Static Method
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Instance Method
    public String appendExclamation(String message) {
        return message + "!";
    }
}

public class MethodReferenceDemo2 {

    public static void main(String[] args) {

        // Static Method Reference
        Consumer<String> print = Message::printMessage;
        print.accept("Hello, Java 8");

        // Instance Method Reference
        Message obj = new Message();
        Function<String, String> append = obj::appendExclamation;
        System.out.println(append.apply("Welcome"));
    }
}