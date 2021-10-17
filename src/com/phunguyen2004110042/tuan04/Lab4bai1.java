package com.phunguyen2004110042.tuan04;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4bai1 {
    public static void main(String[] args) {
        ArrayList<Double> list=new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Nhập số: ");
            Double x = scanner.nextDouble(); 
            list.add(x);
            System.out.print("Nhập thêm (Y/N)? ");
            if(scanner.next().equals("N")){
            break;
            }
        }
        double tong=0;
        System.out.println("Các số vừa nhập là:");
        for(double x:list){
            tong+=x;
            System.out.println(x);
        }
        System.out.println("Tổng của nó là: "+ tong);
    }
}
