package com.phunguyen2004110042.tuan04;

import java.util.Scanner;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach sachlist[] = new Sach[2];
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập danh sách sách");
        for(int i=0; i<sachlist.length;i++){
            System.out.println("Nhập sách thứ "+(i+1));
            System.out.print("Giá: ");
            int gia=nhap.nextInt();
            System.out.print("Giá bán: ");
            int giaBan=nhap.nextInt();
            System.out.print("Số lượng: ");
            int soLuong=nhap.nextInt();
            System.out.print("Năm xuất bản: ");
            int namXB=nhap.nextInt();
            System.out.print("Nhà xuất bản");
            String nhaXB=nhap.nextLine();
            System.out.print("Loại: ");
            String loai=nhap.nextLine();
            sachlist[i]=new Sach(gia, giaBan, soLuong, namXB, nhaXB, loai);
        }
        System.out.println("====In danh sách sách sau khi nhập===");
        for(Sach sach:sachlist){
            sach.inthongtin();
        }
        Sach sachlist1[] = new Sach[3];
        for(int i=0;i<2;i++){
        sachlist1[i] = sachlist[i];
        }
        System.out.println("Nhập sách thứ "+3);
        System.out.print("Giá: ");
        int gia=nhap.nextInt();
        System.out.print("Giá bán: ");
        int giaBan=nhap.nextInt();
        System.out.print("Số lượng: ");
        int soLuong=nhap.nextInt();
        System.out.print("Năm xuất bản: ");
        int namXB=nhap.nextInt();
        System.out.print("Nhà xuất bản");
        String nhaXB=nhap.nextLine();
        System.out.print("Loại: ");
        String loai=nhap.nextLine();
        sachlist1[3]=new Sach(gia, giaBan, soLuong, namXB, nhaXB, loai);
        System.out.println("====In danh sách sách sau khi thêm===");
        for(Sach sach:sachlist1){
            sach.inthongtin();
        }
    }
}
