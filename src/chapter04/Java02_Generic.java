package chapter04;

import java.util.ArrayList;
import java.util.Comparator;

// TODO 插入速度 LinkedList快
//      追加新增 ArrayList快
public class Java02_Generic {
    public static void main(String[] args) {
        Node<Node2> n = new Node<>();
        n.data = new Node2();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(4);

        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}

class Node<E> {
    E element;
    Node<E> next;
    public E data;
}

class Node2{

}

class NumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}