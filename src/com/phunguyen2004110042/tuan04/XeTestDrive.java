package com.phunguyen2004110042.tuan04;

import java.util.Scanner;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe xelist[] = new Xe[2];
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập danh sách xe");
        for(int i=0; i<xelist.length;i++){
            System.out.println("Nhập xe thứ "+(i+1));
            System.out.print("Tên:");
            String ten=nhap.next();
            System.out.print("Hãng sản xuất");
            String hangSX=nhap.next();
            System.out.print("Dòng:");
            String dong=nhap.next();
            System.out.print("Giấy phép:");
            String giayPhep=nhap.next();
            System.out.print("Dung tích xăng:");
            int dungTichXang=nhap.nextInt();
            xelist[i] = new Xe(ten, hangSX, dong, giayPhep, dungTichXang);
        }
        System.out.println("====In danh sách tài khoản sau khi nhập===");
        for(Xe xe:xelist){
            xe.inthongtin();
        }
    }
}
