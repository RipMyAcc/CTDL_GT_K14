package com.phunguyen2004110042.tuan03;

import java.util.Scanner;

public class Lab3bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sd;
        String ss;
        System.out.print("Nhập số sinh viên:");
        int n = scanner.nextInt();
        String sinhvien[] = new String[n];
        double diem[] = new double[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("Sinh viên thứ %d: ",i+1);
            sinhvien[i]=scanner.next();
            System.out.print("Điểm: ");
            diem[i]=scanner.nextDouble();
        }
        System.out.println("Danh sách vừa nhập:");
        for(int i=0;i<n;i++)
        {
            System.out.println("Họ tên: "+sinhvien[i]);
            System.out.println("Điểm: "+diem[i]);
            System.out.print("Học lực: ");
            if(diem[i]<5){
                System.out.println("Yếu");
            }
            else if(diem[i]>=5&diem[i]<6.5){
                System.out.println("Trung bình");
            }
            else if(diem[i]>=6.5&diem[i]<7.5){
                System.out.println("Khá");
            }
            else if(diem[i]>=7.5&diem[i]<9){
                System.out.println("Giỏi");
            }
            else{
                System.out.println("Xuất xắc");
            }
        }
    
        for(int i=0;i<n;i++){
            if(diem[i]>diem[i+1]){
                sd=diem[i];
                diem[i]=diem[i+1];
                diem[i+1]=sd;
                ss=sinhvien[i];
                sinhvien[i]=sinhvien[i+1];
                sinhvien[i+1]=ss;
            }
        }

    }
}
