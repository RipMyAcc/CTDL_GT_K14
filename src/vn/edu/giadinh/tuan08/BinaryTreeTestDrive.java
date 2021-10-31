package vn.edu.giadinh.tuan08;

public class BinaryTreeTestDrive {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int temp;
            bt.add(6);
            bt.add(4);
            bt.add(8);
            bt.add(3);
            bt.add(5);
            bt.add(7);
            bt.add(9);
    bt.traverseInOrder(bt.root);
    bt.delete(4);
    System.out.println();
    bt.traverseInOrder(bt.root);
    System.out.println();
    System.out.println(bt.containsNode(6));
    }
}
