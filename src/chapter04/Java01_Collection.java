package chapter04;


// TODO 集合
// 1. Collection
//      List: 有序，可以重复， ArrayList, LinkedList
//      Set： 无序，不可重复, HashSet
//      Queue： 有序, ArrayBlockingQueue

import java.util.ArrayList;

// 2. Map
//       HashMap
//       HashTable
public class Java01_Collection {
    public static void main(String[] args) {
        // TODO ArrayList 有序 连续的数组, 自动扩容
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList list2 = new ArrayList(3); // 初始化长度
        // System.out.println(list1);
       // System.out.println(list2);
        list1.add("A");
        list2.add("B");
        list2.add(10);

        System.out.println(list2); // [B, 10]
        System.out.println(list2.size());
        Object obj = list2.get(1);
        System.out.println(obj);
        // 不关心顺序
        for(Object obj2 : list2){
            System.out.println(obj2);
        }
        Object old = list2.set(1,100); // 更改
        System.out.println(old);
        System.out.println(list2);
        Object old2 = list2.remove(0);
        System.out.println(list2.size());
        list1.clear(); // 删除
        list2.addAll(list1);
        list2.indexOf("A");

        Object list3 = list2.clone();
        list2.toArray();
    }
}
