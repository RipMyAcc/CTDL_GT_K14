package com.phunguyen2004110042.tuan04;

import java.util.Scanner;

public class MayTinhTestDrive {
    public static void main(String[] args) {
    MayTinh maytinhlist[] = new MayTinh[2];
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập danh sách máy tính");
        for(int i=0; i<maytinhlist.length;i++){
            System.out.println("Nhập máy tính thứ "+(i+1));
            System.out.print("Nhà sản xuất: ");
            String nhaSX=nhap.nextLine();
            System.out.print("Hệ điều hành: ");
            String HDH=nhap.nextLine();
            System.out.print("Ram: ");
            String ram=nhap.nextLine();
            System.out.print("CPU: ");
            String CPU=nhap.nextLine();
            System.out.print("Năm sản xuất: ");
            int namSX=nhap.nextInt();
            System.out.print("Giá: ");
            int gia=nhap.nextInt();
            System.out.print("Năm bảo hành: ");
            int namBH=nhap.nextInt();
            maytinhlist[i] = new MayTinh(nhaSX, HDH, ram, CPU, namSX, gia, namBH);
        }
        System.out.println("====In danh sách máy tính sau khi nhập===");
        for(MayTinh maytinh:maytinhlist){
            maytinh.inthongtin();
            System.out.println();
        }
    }
}
