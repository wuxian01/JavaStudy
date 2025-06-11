package chapter02;

// TODO Object 类
public class Java01_Object {
    public static void main(String[] args) {
        // java.lang.Object: 对象，所有类的父类，
        Object obj = new Person();

        //TODO Object 类常用方法
        // 字符串转换，默认打印对象的内存地址，为了看内容，可以重写这个方法
        String s = obj.toString();
        // TODO 获取对象的内存地址
        int i = obj.hashCode();
        // TODO 判断两个对象是否相等，默认比较内存地址
        boolean eq = obj.equals(new Person());

        // TODO getClass 获取对象的类型信息
        Class<?> aClass = obj.getClass();
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getPackageName());
    }
}

class Person {
    public String name;

    @Override
    public String toString() {
        return "Person "+ name;
    }
}


