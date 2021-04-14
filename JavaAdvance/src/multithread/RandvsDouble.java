package multithread;

import java.util.Random;

class Thread1 extends Thread {
    Random random = new Random();
    static int rand;

    public void run() {
        int k = 1;
        while (k == 1) {
            rand = random.nextInt(20) + 1;
            System.out.println("Số ngẫu nhiên là: " + rand);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        int k = 1;
        while (k == 1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Số bình phương là: " + (Thread1.rand * Thread1.rand));
        }
    }
}

public class RandvsDouble {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }

}
