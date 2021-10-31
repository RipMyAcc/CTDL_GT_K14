package com.phunguyen2004110042.tuan08;

public class StackTestDrive {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(7.5, "Nguyễn A");
        stack.push(5.4, "Nguyễn B");
        NodeSinhVien temp;
        temp = stack.peek();
        temp.inthongtin();
        stack.print();
        System.out.println("Lấy ra");
        temp = stack.pop();
        temp.inthongtin();
        System.out.println("Lấy ra");
        temp = stack.pop();
        temp.inthongtin();
    }
}
