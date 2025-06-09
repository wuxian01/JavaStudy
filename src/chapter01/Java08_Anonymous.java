package chapter01;

// TODO 匿名类
public class Java08_Anonymous {
    public static void main(String[] args) {
    // 匿名类：没有名字的类
        Me me = new Me();
        me.say(new Person() {
            public String name() {
                return "zhangsan";
            }
        });
        // 通过interface实现
        new Bird().fly();
        new Fly(){
            public void fly(){
                System.out.println("Anonymous fly");
            }
        }.fly();
    }
}

abstract class Person {
    public abstract String name();
}

class Me {
    public void say(Person person) {
        System.out.println("hello "+person.name());
    }
}

interface Fly {
    public void fly();
}

class Bird implements Fly{
    public void fly(){
        System.out.println("bird fly");
    }
}