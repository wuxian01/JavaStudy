package chapter06;

public class Java01_Thread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("hello java "+Thread.currentThread().getName());
    }
}
