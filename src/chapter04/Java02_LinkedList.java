package chapter04;

import java.util.LinkedList;

public class Java02_LinkedList {
    public  static void main(String[] args) {
        // TODO  LinkedList 双向链表
        LinkedList list = new LinkedList();
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("A");
        list2.add("B");
        System.out.println(list2);
        System.out.println(list2.getFirst());
        System.out.println(list2.getLast());
        list2.addLast("C");
        list2.addFirst("D");
        System.out.println(list2);
        list2.add(2, "E");
        System.out.println(list2);
        System.out.println(list2.get(2));
        list2.set(2, "F");
        System.out.println(list2);
        list2.remove(2);
        System.out.println(list2);

    }
}
