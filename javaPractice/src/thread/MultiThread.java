package thread;

public class MultiThread  extends  Thread{

    public static void main(String[] args) {

        MultiThread multiThread = new MultiThread();
        multiThread.start();

    }

    @Override
    public void run(){
        System.out.println("Thread name" + Thread.currentThread().getName());
    }
}
