package chapter01;

// 方法重写
public class Java03_ClassFunc {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.demo();

        /*
        1. 一个对象能使用的方法取决于引用变量的类型
        2. 一个对象能使用的属性，取决于引用变量的类型
        3. 一个对象的方法具体的使用（直接、间接）需要看具体的对象
        4. 一个对象属性具体的使用不需要看具体的对象，属性在哪里声明就在哪里使用
         */
        Parent parent = new Boy();
        System.out.println(parent.sum());  // 300

        System.out.println(parent.sum2()); // !!! 210
    }
}

class Parent{

    String name = "p_zhangsan";
    int age = 20;

    int sum(){
        return age+10;
    }

    void demo(){
        System.out.println(name+ " test...");
    }

    int sum2(){
        return getAge()+10;
    }
    int getAge(){
        return age;
    }
}
class Boy extends Parent{

    String name = "boy";
    int age = 200;
    void demo(){
        super.demo();
        System.out.println(name+" test...");
    }

    int sum(){
        return age+100;
    }

    int getAge(){
        return age;
    }
}
