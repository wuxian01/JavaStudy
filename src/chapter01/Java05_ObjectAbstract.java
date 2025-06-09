package chapter01;


// 抽象类
public class Java05_ObjectAbstract {
    public static void main(String[] args){
        // 抽象类: 不完整的类
        //    abstract class 类名
        //     类不完整，无法直接构造对象
        // 抽象方法： 只有声明，没有实现的方法
        //         abstract 返回值类型 方法名（参数）
        // 一个类中有抽象方法，这个类就是抽象类
        // 一个类时抽象类，方法不一定是抽象方法，可以有常规方法
        // 抽象类中包含抽象方法，子类继承后需要重写抽象方法
        // abstract 无法和final一起用

        AbstractClass2 abstractClass = new AbstractClass2();
        abstractClass.test();
    }
}


abstract class AbstractClass {
    public abstract void test();

    public void demo(){}
}

class AbstractClass2 extends AbstractClass{
    public void test(){
        System.out.println("AbstractClass2");
    }
}


