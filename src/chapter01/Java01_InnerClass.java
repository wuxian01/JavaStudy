package chapter01;

public class Java01_InnerClass {

    // 外部类 内部类
    // 内部类： 类中声明的类，当作类的属性即可，需要构建外部类才可使用

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    }

}

// 内部类
class OuterClass {
    public class InnerClass{

    }
}

