package multithreading;

public class First {

    public static void main(String[] args) {

        // Thread class
        Prime p = new Prime();

        // Runnable interface
        Armstrong a = new Armstrong();
        Thread t = new Thread(a);

        p.start();
       
        try {
            Thread.sleep(4000); 
        } catch (InterruptedException e) {}
        t.start();

      

      

        System.out.println("Both threads completed.");
    }
}