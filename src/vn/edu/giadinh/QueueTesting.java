package vn.edu.giadinh;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTesting {
    public static void main(String[] args) {
        Queue<Integer> queue;
        queue = new LinkedList<>();
        queue.add(3);
        queue.add(5);
        queue.add(7);
        System.out.println(queue);
        int remove = queue.remove();
        System.out.println("Lấy ra: "+remove);
        System.out.println("Còn lại: "+queue);
        int tham = queue.peek();
        System.out.println("Phần tử được thăm: "+tham);
        System.out.println("Còn lại sau khi thăm: "+queue);
    }
}
