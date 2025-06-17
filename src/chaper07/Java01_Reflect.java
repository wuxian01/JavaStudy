package chaper07;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Java01_Reflect {
    public static void main(String[] args) throws Exception {
        User user = new Child();
        user.test1();

        // 反射
        // 类对象
        Class<? extends User> aClass = user.getClass();
        // TODO 获取类的名称
        System.out.println(aClass.getName()); // 获取完整名称
        System.out.println(aClass.getSimpleName()); // 类名
        System.out.println(aClass.getPackageName()); // 获取包名
        System.out.println(aClass.getCanonicalName()); //

        // TODO 获取父类
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass.getSimpleName());

        // TODO 获取类的接口
        Class<?>[] interfaces = aClass.getInterfaces();
        System.out.println(interfaces.length);

        // TODO 获取类属性
        Field f = aClass.getDeclaredField("name"); // 获取所有权限的属性
        Field f2 = aClass.getField("age"); // public 属性

        Field[] fs = aClass.getFields();
        Field[] fs2 = aClass.getDeclaredFields();

        // TODO 获取类方法
        Method m = aClass.getMethod("xxx"); // public方法
        Method m2 = aClass.getDeclaredMethod("yyy"); // 获取所有方法
        Method[] ms = aClass.getMethods();
        Method[] ms2 = aClass.getDeclaredMethods();

        // TODO 构造方法
        Constructor<?>[] constructors = aClass.getConstructors();
        Constructor<? extends User> constructor = aClass.getConstructor();
        Constructor<? extends User> declaredConstructor = aClass.getDeclaredConstructor();

        // TODO 获取权限 修饰符
        int modifiers = aClass.getModifiers();
        System.out.println(modifiers);
        boolean aPrivate = Modifier.isPrivate(modifiers);
    }

}

class User {
    public String name;
    private int age;
    public void test1() {
        System.out.println("test1");
    }
}

class Child extends User{
    public String child;
    private int size;
    public void test2() {
        System.out.println("child");
    }
}