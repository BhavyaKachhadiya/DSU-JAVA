class DivisibleByThree implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

class DivisibleByFive implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

public class p4 {
    public static void main(String[] args) {
        DivisibleByThree divisibleByThree = new DivisibleByThree();
        DivisibleByFive divisibleByFive = new DivisibleByFive();

        Thread thread1 = new Thread(divisibleByThree, "Thread 1");
        Thread thread2 = new Thread(divisibleByFive, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
