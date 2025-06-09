package chapter01;


// public: 公共类，访问权限修饰符，公共类只有一个，且必须与原文件名相同

public class Java01_HelloWorld {
    // main方法由JVM调用，不用考虑权限问题，public 如果去除时，就当作是成员方法，不能直接执行
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    // 权限类型：
    // 1. private： 私有，同一个类中可以使用，类外无法使用
    // 2. (default)：默认权限，当不设定任何权限时，JVM会默认提供权限，包权限(同路径), 包内使用, 子包不可使用；
    // 3. protected: 受保护权限，子类可以访问，外部类不可访问
    // 4. public: 公有

    private String name;

    String defaultRule; // 默认权限

    protected  String protectedRule;

    void getName(){
        System.out.println(name);
    }


    RuleTest ruleTest = new RuleTest();
   // ruleTest.clone();  //报错
}

class RuleTest{
    void test() throws Exception {
        // java.lang.Object的 protected 受保护方法
        clone(); //不报错
    }
}
