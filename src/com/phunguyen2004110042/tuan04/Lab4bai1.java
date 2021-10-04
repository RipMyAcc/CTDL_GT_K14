package com.phunguyen2004110042.tuan04;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4bai1 {
    public static void main(String[] args) {
        ArrayList<Double> list=new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        while(true){
            Double x = scanner.nextDouble(); 
            list.add(x);
            System.out.print("Nhập thêm (Y/N)? ");
            if(scanner.nextLine().equals("N")){
            break;
            }
        }
        System.out.println("Các số vừa nhập là:");
        for(double x:list){
            System.out.println(x);
        }
    }
}
