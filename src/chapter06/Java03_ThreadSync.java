package chapter06;

// TODO 线程同步
// synchronized 多线程访问时安全，类似于锁
public class Java03_ThreadSync {
    public static void main(String[] args) {
        //TODO 2. 用于同步代码块
        Num num = new Num();

        User user = new User(num);
        user.start();

        Bank bank = new Bank(num);
        bank.start();


    }
}

//TODO 1.修饰方法名
class Test extends Thread {
    public synchronized void run(){
        System.out.println("run");
    }
}


class Num {

}

class User extends Thread{
    private Num num;
    public User(Num num){
        this.num = num;
    }
    public void run(){
        synchronized (num){
            System.out.println("User run wait...");
            try {
                // 等待
                num.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("User run exec");
        }
    }
}

class Bank extends Thread{
    private Num num;
    public Bank(Num num){
        this.num = num;
    }

    public void run(){
        synchronized (num){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Bank run...");
            num.notifyAll();
        }
    }
}
