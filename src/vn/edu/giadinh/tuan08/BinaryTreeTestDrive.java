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
    
            bt.containsNode(7);
            assertTrue(bt.containsNode(6));
    assertTrue(bt.containsNode(4));
 
    assertFalse(bt.containsNode(1));
    }
}
