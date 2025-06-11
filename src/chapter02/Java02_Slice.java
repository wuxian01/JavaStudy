package chapter02;

// TODO 数组
public class Java02_Slice {
    public static void main(String[] args) {
        // TODO 数组声明：类型[] 变量
        // TODO 创建： new 类型[容量]
        // 初始化

        String[] s = new String[3];
        s[0] = "zhangsan";
        s[1] = "lisi";
        s[2] = "wangwu";

        slice[] sl  = new slice[2];
        for(int j=0;j<sl.length;j++){
            sl[j] = new slice();
        }
        for(Object obj:sl){
            System.out.println(obj);
        }

        int[] nums = {1,2,3,};


        // TODO 二维数组
        int[][] arr = {{1,2,3},{4,5,6}};

        int[][] arr1 = new int[][]{{1,2,3},{4,5,6}};
        int[][] arr2 = new int[3][3];


    }
}

class slice{

}

