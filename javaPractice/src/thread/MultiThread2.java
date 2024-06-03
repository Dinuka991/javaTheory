package thread;

public class MultiThread2 implements Runnable{

    public static void main(String[] args) {

        MultiThread2 multiThread2 = new MultiThread2();
        Thread t = new Thread(multiThread2);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Thread name" + Thread.currentThread().getName());
    }
}
