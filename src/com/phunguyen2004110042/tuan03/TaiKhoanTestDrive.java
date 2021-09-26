package com.phunguyen2004110042.tuan03;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        TaiKhoan taikhoan = new TaiKhoan("Mr Suspicious", "999999X666", 999999999);
        System.out.println("Tên chủ tài khoản: " + taikhoan.ten);
        System.out.println("Số tài khoản: " + taikhoan.soTK);
        System.out.println("Số dư trong tài khoản: " + taikhoan.soDu);
    }
}
