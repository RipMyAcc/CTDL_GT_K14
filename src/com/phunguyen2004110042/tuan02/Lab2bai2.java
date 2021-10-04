package com.phunguyen2004110042.tuan02;

import java.util.Scanner;

public class Lab2bai2 {
    public static void main(String[] args) {
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
    
}
