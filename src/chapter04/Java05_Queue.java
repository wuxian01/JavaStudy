package chapter04;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Java05_Queue {
    public static void main(String[] args) {
        //TODO QUEUE

        Queue<String> queue = new ArrayDeque<String>();
        ArrayBlockingQueue<String> q = new ArrayBlockingQueue<>(3); // 阻塞的queue，队列满了继续新增数据会阻塞
        //ArrayDeque<String> dq = new ArrayDeque<>();

        try {
            q.put("a");
        }catch (Exception e){
            e.printStackTrace();
        }
        q.offer("a");
        q.offer("b");

        String s = q.poll();
      //  String s1 = q.take(); // 阻塞的取数据
        q.size();
        q.isEmpty();

    }
}
