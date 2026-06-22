package multithreading;

class Prime extends Thread {

    public void run() {
        System.out.println("Prime Numbers from 1 to 50:");

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime: " + num);
            }
        }
    }
}