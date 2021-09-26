package com.phunguyen2004110042.tuan03;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach sach;
        sach = new Sach(1500);
        System.out.println("Giá :" + sach.gia);
        sach = new Sach(1500, 1800);
        System.out.println("Giá :" + sach.gia);
        System.out.println("Giá bán: " + sach.giaBan);
        sach = new Sach(1500, 1800, 20);
        System.out.println("Giá :" + sach.gia);
        System.out.println("Giá bán: " + sach.giaBan);
        System.out.println("Số lượng: " + sach.soLuong);
        sach = new Sach(1500, 1800, 20, 2020);
        System.out.println("Giá :" + sach.gia);
        System.out.println("Giá bán: " + sach.giaBan);
        System.out.println("Số lượng: " + sach.soLuong);
        System.out.println("Năm xuất bản: "+ sach.namXB);
        sach = new Sach(1500, 1800, 20, 2020, "Mr.X");
        System.out.println("Giá :" + sach.gia);
        System.out.println("Giá bán: " + sach.giaBan);
        System.out.println("Số lượng: " + sach.soLuong);
        System.out.println("Năm xuất bản: "+ sach.namXB);
        System.out.println("Nhà xuất bản: " + sach.nhaXB);
        sach = new Sach(1500, 1800, 20, 2020, "Mr.X", "XXX");
        System.out.println("Giá :" + sach.gia);
        System.out.println("Giá bán: " + sach.giaBan);
        System.out.println("Số lượng: " + sach.soLuong);
        System.out.println("Năm xuất bản: "+ sach.namXB);
        System.out.println("Nhà xuất bản: " + sach.nhaXB);
        System.out.println("Loại: " + sach.loai);
    }
}
