package Lab1;

import java.util.Scanner;

public class Lab1bai4 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập a b c: ");
        Integer a, b, c, d;
        a = nhap.nextInt();
        b = nhap.nextInt();
        c = nhap.nextInt();
        System.out.println("Căn delta: " + Math.sqrt(Math.pow(b, 2) - 4*a*c));        
    }
    
}
