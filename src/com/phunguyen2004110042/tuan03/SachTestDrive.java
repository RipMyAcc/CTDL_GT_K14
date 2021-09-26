package com.phunguyen2004110042.tuan03;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach sach = new Sach(1500, 1800, 20, 2020, "Mr.X", "XXX");
        System.out.println("Giá :" + sach.gia);
        System.out.println("Nhà xuất bản: " + sach.nhaXB);
        System.out.println("Năm xuất bản: "+ sach.namXB);
        System.out.println("Giá bán: " + sach.giaBan);
        System.out.println("Số lượng: " + sach.soLuong);
        System.out.println("Loại: " + sach.loai);
    }
}
