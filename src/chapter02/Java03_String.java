package chapter02;

import java.nio.charset.StandardCharsets;

// TODO 字符串 String
public class Java03_String {
    public static void main(String[] args) throws Exception {
        // TODO
        // 字符串、字符、字节关系

        // 初始化
        char[] cs = {'a','b','c'};
        System.out.println(cs);
        String s = new String(cs);
        System.out.println(s);

        byte[] bs = {-28,-72, -83};
        String s1 = new String(bs, "UTF-8");
        System.out.println(s1);

        // 转义
        String s2 = "\"";
        System.out.println(s2);

        // TODO 方法
        // TODO 拼接
        String s3 = "a" + "b";// ab
        String s4 = "a"+1+2; // a12
        String s5 = 1+"a"+2; // 1a2 + 两边都是字符串，就前后都当作字符串
        String s6 = 1+2+"a";// 3a ，先计算的1+2

        String s7 = s6.concat("bcd"); // 3abcd
//        System.out.println(s5);
//        System.out.println(s3);
//        System.out.println(s4);
//        System.out.println(s6);
//        System.out.println(s7);

        // TODO 比较
        String a = "a";
        String b = "A";
        System.out.println(a.equals(b)); // false
        // 忽略大小写
        System.out.println(a.equals(b)); // true
        // i > 0; a > b
        // i < 0; a < b
        // i = 0, a = b
        int i = a.compareTo(b);
        System.out.println(i); // i > 0,返回a-b的差值，ASC码比较

        // TODO 字符串截断
        String hw = " hello world ";
        String subStr =  s.substring(0,3); // 0下标开始,3下标结束，左闭右开[ ）
        //TODO 分解字符串
        String[] sp = hw.split(" ");
        System.out.println(sp.length);
        // TODO trim 去除首尾空格
        hw = hw.trim();
        System.out.println(hw);
        // TODO 替换
        String rp = hw.replace("hello", "HELLO");

        System.out.println(rp);
        String rpa = hw.replaceAll("l", "L");
        System.out.println(rpa);
        // 大小写
        hw.toUpperCase();
        hw.toLowerCase();


        String arr = "hello java";
        char[] arr1 = arr.toCharArray();
        byte[] arr2 = s.getBytes(StandardCharsets.UTF_8);

        char c = arr.charAt(1);

        int idx = arr.indexOf('l');
        System.out.println(idx);
        int ldx = arr.lastIndexOf('0');
        System.out.println(ldx);
        boolean exist = arr.contains("java");
        System.out.println(exist);
        //TODO  StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("abc");
        System.out.println(sb.toString());
        sb.insert(3, "ddd");
        System.out.println(sb);
    }
}

