package multithreading;

class Armstrong implements Runnable {

    public void run() {
        System.out.println("Armstrong Numbers from 1 to 1000:");

        for (int num = 1; num <= 1000; num++) {
            int original = num;
            int sum = 0;

            while (original > 0) {
                int digit = original % 10;
                sum += digit * digit * digit;
                original /= 10;
            }

            if (sum == num) {
                System.out.println("Armstrong: " + num);
            }
        }
    }
}
