package com.phunguyen2004110042.tuan04;

import java.util.Scanner;

import Lab2.baithem.NhanVien;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVIen nhanvienlist[] = new NhanVIen[2];
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập danh sách nhân viên");
        for(int i=0; i<nhanvienlist.length;i++){
            System.out.println("Nhập nhân thứ "+(i+1));
            System.out.print("Tên:");
            String ten=nhap.next();
            System.out.print("Địa chỉ:");
            String diaChi=nhap.next();
            System.out.print("Bộ phận làm việc:");
            String boPhanLamViec=nhap.next();
            System.out.print("Ngày sinh:");
            String ngaySinh=nhap.next();
            System.out.print("Lương:");
            int luong=nhap.nextInt();
            nhanvienlist[i] = new NhanVIen(ten, diaChi, boPhanLamViec, ngaySinh, luong);
        }
        System.out.println("====In danh sách nhân viên sau khi nhập===");
        for(NhanVIen nhanvien:nhanvienlist){
            nhanvien.inthongtin();
        }
    }
}
