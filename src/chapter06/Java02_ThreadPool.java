package chapter06;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// TODO 线程池
// 可以根据需要，在启动时，创建一个或多个线程对象
// Java四种常见线程池
// 1. 创建固定数量的线程池对象 ExecutorService newFixedThreadPool 线程服务对象
// 2. 根据需求动态创建线程 newCachedThreadPool
// 3. 单一线程 newSingleThreadExecutor
// 4. 定时调度线程 newScheduledThreadPool
public class Java02_ThreadPool {
    public static void main(String[] args) {
       // 第一种ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i=0;i<5;i++){
            executorService.submit(new Runnable(){
                @Override
                public void run() {
                    System.out.println("guding "+Thread.currentThread().getName());
                }
            });
        }

        // 第二种，动态创建 newCachedThreadPool
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        for (int i=0;i<5;i++){
            executorService1.submit(new Runnable(){
                @Override
                public void run() {
                    System.out.println("dongtai "+ Thread.currentThread().getName());
                }
            });
        }

        // 第三种：单一线程
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        for (int i=0;i<5;i++){
            executorService2.submit(new Runnable(){
                @Override
                public void run() {
                    System.out.println("single "+ Thread.currentThread().getName());
                }
            });
        }

        // 第四种：定时调度线程
        ExecutorService executorService3= Executors.newScheduledThreadPool(3);
        for (int i=0;i<5;i++){
            executorService3.submit(new Runnable(){
                @Override
                public void run() {
                    System.out.println("schedule "+ Thread.currentThread().getName());
                }
            });
        }
    }
}

