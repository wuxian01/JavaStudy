package chapter01;

//TODO 枚举
public class Java07_Enum {
    public static void main(String[] args) {
      // 枚举是特殊的类，包含一组特定对象，且对象不会改变
      // 枚举为 enum  关键字
        // 枚举类会将对象放置在最前面，和后面的语法需要分号分割
        // enum 类是继承与Enum 类
        // 枚举类不允许创建对象，在内部创建
        System.out.println(City.BEIJING.name);
        System.out.println(City.SHANGHAI.code);

        System.out.println(MyCity.SHANGHAI.name);
        System.out.println(MyCity.SHANGHAI.code);
    }
}

enum City {
    BEIJING("BEIJING", 1010), SHANGHAI("SHANGHAI", 1021);

    City( String name, int code ) {
        this.name = name;
        this.code = code;
    }

    public String name;
    public int code;
}
// 自行实现

class MyCity {
    public String name;
    public int code;
    private MyCity( String name, int code ) {
        this.name = name;
        this.code = code;
    }
    public static final MyCity BEIJING = new MyCity( "BEIJING", 1010 );
    public static final MyCity SHANGHAI = new MyCity( "SHANGHAI", 1021);
}