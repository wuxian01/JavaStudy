package chaper07;

// TODO 类加载器
// 1. AppClassLoader : 应用类加载器
// 2. PlatformClassLoader: 平台类加载器，例如JVM
// 3. BootClassLoader: 启动类加载器，例如String （采用操作系统平台语言实现
// Java核心类 > 平台类 > 应用类
public class Java02_ClassLoader {
    public static void main(String[] args) {
       // AppClassLoader
        Class<User01> user01Class = User01.class;
        System.out.println( user01Class.getClassLoader());
        System.out.println( user01Class.getClassLoader().getParent());

        // 启动类加自欺
        Class<String> stringClass = String.class;
        System.out.println( stringClass.getClassLoader());
    }
}

class User01 {

}
