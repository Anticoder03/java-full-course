package test27;

public class LambdaRunnableDemo {

    public static void main(String[] args) {

        // Lambda Expression implementing Runnable
        Runnable task = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        };

        // Create and start child thread
        Thread t = new Thread(task);
        t.start();
    }
}