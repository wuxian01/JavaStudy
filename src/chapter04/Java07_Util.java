package chapter04;

import java.util.Arrays;
import java.util.List;

// TODO 工具类
public class Java07_Util {
    public static void main(String[] args) {
        int[] arr = {1,7,8,3,4,5};
        System.out.println(Arrays.toString(arr));
        List<Integer> list = Arrays.asList(1,4,5,7,8,9);
        // 升序排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // 排序后的数组可以二分
        System.out.println(Arrays.binarySearch(arr,4));

        // 数组比较
        Boolean b = Arrays.equals(arr,new int[]{1,4,5,7,8,9});
        System.out.println(b);

        System.out.println(Arrays.equals(arr, 0, 2, new int[] {1,3,4,5}, 0,2));
        list.forEach(System.out::println);

    }
}
