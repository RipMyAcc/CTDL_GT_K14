package Lab2;

import java.util.Scanner;

public class Lab2bai4 {
    public static void main(String[] args) {
        Menu();
    }
    public static void Menu() {
        System.out.println("+________________________________+");
        System.out.println("  1.Giải phương trình bậc nhất");
        System.out.println("  2.Giải phương trình bậc 2");
        System.out.println("  3.Tính tiền điện");
        System.out.println("  4.Kết thúc");
        System.out.println("+________________________________+");
        System.out.print("Chọn chức năng: ");
        Scanner nhap = new Scanner(System.in);
        Integer so = nhap.nextInt();
        switch(so){
            case 1: PTB1(); break;
            case 2: PTB2(); break;
            case 3: tiendien(); break;
            case 4: System.exit(0);
        }
    }
    public static void PTB1() {
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
    public static void PTB2() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập a b c: ");
        Integer a, b, c;
        a = nhap.nextInt();
        b = nhap.nextInt();
        c = nhap.nextInt();
        if(a==0){
            if(b==0){
                if(c==0)
                    System.out.println("Vô số nghiệm");
                else
                    System.out.println("Vô nghiệm");
            }
            else
                System.out.println("Nghiệm là: " + -c/b);
        }
        else{
            double d = Math.pow(b, 2) - 4*a*c;
            if(d>0){
                System.out.println("Nghiệm 1: " + (-b+Math.sqrt(d))/2*a);
                System.out.println("Nghiệm 2: " + (-b-Math.sqrt(d))/2*a);
            }
            else if(d==0)
                System.out.println("Nghiệm kép: " + -b/2*a);
            else
               System.out.println("Vô nghiệm");
        }
    }
    public static void tiendien() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập số điện: ");
        Integer dien = nhap.nextInt();
        int tien = 0;
        if(dien<51)
            tien = dien*1000;
        else if(dien>50)
            tien = 50*1000 - (dien-50)*1200;
        System.out.println("Tiền điện: " + tien);
    }
}
