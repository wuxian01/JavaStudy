package chapter01;

public class Java04_SingleClass {
    public static void main(String[] args) {
        SingleInstance instance1 = SingleInstance.getInstance();
        SingleInstance instance2 = SingleInstance.getInstance();

        System.out.println(instance1 == instance2);
       // System.out.println(instance1.equals(instance2));
        FinalClass finalClass = new FinalClass("zhangsan");
        System.out.println(finalClass.name);
    }
}

class SingleInstance{
    private static SingleInstance singleInstance = null;
    private SingleInstance(){}
    public static SingleInstance getInstance(){
        if(singleInstance == null){
            singleInstance = new SingleInstance();
        }
        return singleInstance;
    }
}

// TODO final关键字
// final: 修饰变量，一旦初始化，将不允许修改
// final修饰类属性的话，JVM无法初始化，需要手动初始化
// final 修饰的变量为常量，不可变
// final 可以修饰类方法， 但是不允许子类重写
// final 可以修饰类，类无法继承，没有子类
// final 不可以修饰构造方法
// final 可以修饰方法的参数，一旦修饰，参数无法修改，类似const
final class FinalClass{
    public final String name;
    public FinalClass(String name){
        this.name = name;
    }
    public final void test(){}

    // final FinalClass(){}

    public void setName(final String name){

    }
}

