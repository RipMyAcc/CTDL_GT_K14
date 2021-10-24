package vn.edu.giadinh;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(4);
        linkedList.addHead(1);
        linkedList.addBefore(8, 7);
        linkedList.removeHead();
        linkedList.removeTail();
        linkedList.add(9);
        linkedList.remove(9);
        linkedList.addBefore(0, 5);
        linkedList.remove(5);
        linkedList.remove(7);
        linkedList.rewrite(8, 9);
        linkedList.print();
    }
}
