package chapter02;

// TODO  包装类
public class Java04_DataType {
    public static void main(String[] args) {
        Byte b = null;
        Short s = null;
        Integer i = null;
        Long l = null;
        Float f = null;
        Double d = null;
        Character c = null;
        Boolean b1 = null;

        // 转换
        int a = 10;
        //Integer aa = new Integer(a);
        //Integer aa = Integer.valueOf(a);
        Integer aa = a;
        //int aaa = aa.intValue();
        int aaa = 10;

        // -128~127 直接比较是true, 其余为false
        Integer a1 = 100;
        Integer a2 = 100;
        System.out.println(a1 == a2); // true

        Integer a11 = 200;
        Integer a22 = 300;
        System.out.println(a11 == a22); // false
    }
}
