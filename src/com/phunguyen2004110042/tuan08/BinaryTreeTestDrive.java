package com.phunguyen2004110042.tuan08;

public class BinaryTreeTestDrive {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(5, "A");
        bt.add(8, "B");
        bt.add(6, "C");
        bt.add(9, "D");
        bt.traverseInOrder(bt.root);
    }
}
