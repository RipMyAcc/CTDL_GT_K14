package Lab1;

import java.util.Scanner;

public class Lab1bai3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập 1 cạnh của khối lập phương: ");
        Integer canh = nhap.nextInt();
        System.out.println("Thể tích khối lập phương: " + Math.pow(canh, 3));
    }
    
}
