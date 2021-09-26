package Lab2;

import java.util.Scanner;

public class Lab2bai1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập a b");
        Integer a, b;
        a = nhap.nextInt();
        b = nhap.nextInt();
        if(a==0){
            if(b==0)
                System.out.println("Vô số nghiệm");
            else
                System.out.println("Vô nghiệm");
        }
        else
            System.out.println("Nghiệm là: " + -b/a);
    }
}
