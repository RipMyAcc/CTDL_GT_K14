package Lab1;

import java.util.Scanner;

public class Lab1bai2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập lần lượt 2 cạnh của hình chữ nhật: ");
        Integer canh1, canh2;
        canh1 = nhap.nextInt();
        canh2 = nhap.nextInt();
        System.out.println("Chu vi: " + (canh1+canh2)*2);
        System.out.println("Diện tích: " + canh1*canh2);
        System.out.println("Cạnh nhỏ nhất: " + Math.min(canh1, canh2));
    }
    
}
