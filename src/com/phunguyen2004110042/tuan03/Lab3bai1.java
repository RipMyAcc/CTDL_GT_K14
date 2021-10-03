package com.phunguyen2004110042.tuan03;

import java.util.Scanner;

public class Lab3bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 1 số:");
        double nhap = scanner.nextDouble();
        boolean ok = true;
        for(int i=2; i<nhap ;i++)
        {
            if(nhap%i==0)
            {
                ok=false;
                break;
            }
        }
        if(ok==true)
        {
            System.out.println("Số nguyên tố");
        }
        else
        {
            System.out.println("Không phải số nguyên tố");
        }
    }
}
