package vn.edu.giadinh;

import java.util.Stack;

public class StackTesting {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("Welcome");
        stack.push("to");
        stack.push("the summoner rift");
        System.out.println(stack);
        String poped = stack.pop();
        System.out.println("Đã lấy ra từ stack: "+poped);
        System.err.println("Còn lại: "+stack);
        stack.push("Thăm ngàn");
        String tham = stack.peek();
        System.out.println("Phần tử được thăm: "+tham);
        System.out.println(stack);
    }
}
