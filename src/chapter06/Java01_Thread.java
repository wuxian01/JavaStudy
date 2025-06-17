package chapter06;

// TODO 线程状态
// TODO 可运行、终止、阻塞、等待、定时等待
public class Java01_Thread {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread.start();
        myThread2.start();


        myThread.join(); // 等待线程结束
        //myThread2.join();


        //TODO 简便方法
        Thread t1 = new Thread(()->{
            System.out.println("t1 run");
        });
        t1.start();

        // TODO 构建线程对象时，可以传递实现了Runable接口的类对象，一般使用匿名类
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("t2 run");
            }
        });
        t2.start();


        // main 等其余线程先结束，类似于阻塞
        System.out.println("main");
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("hello java 1 "+Thread.currentThread().getName());
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            // 休眠
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("hello java 2 "+Thread.currentThread().getName());
    }
}