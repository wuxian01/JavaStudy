package chapter04;


import java.util.*;

//TODO Map
public class Java06_Map {
    public static void main(String[] args) {
        //TODO HashMap 存储无序, 底层数组+单向列表， K V可以为null

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>(10);
        Integer old = map.put("A",1);
        Integer old2 = map.put("A",2);
        map.put("B",2);
        map.put("C",3);
        map.putIfAbsent("C",4); // 不存在才放数据
        map.replace("C", 4);

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println( map.containsKey("A"));

        map.values().forEach(System.out::println);

        // 获取健值对
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        //map.entrySet().forEach(System.out::println);

        // TODO HashTable 与HashMap 实现不一样，默认容量也不一样， 父类不一样，KV不可以为null
        // TODO HashTable 用的是hashcode 定位数据，hashmap用的是hash算法， hashmap性能较高
        Hashtable<Integer,String> hashtable = new Hashtable<>(10);


        // TODO 迭代器
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ":" + map.get(key));
            if ("B".equals(key)) {
                // 只能删除当前数据
                iterator.remove();
            }
            System.out.println(key + ":" + map.get(key));
        }
    }
}
