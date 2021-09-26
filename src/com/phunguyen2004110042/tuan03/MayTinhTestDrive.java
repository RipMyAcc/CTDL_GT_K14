package com.phunguyen2004110042.tuan03;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh maytinh;
        maytinh = new MayTinh("Dell");
        System.out.println("Nhà sản xuất: " + maytinh.nhaSX);
        maytinh = new MayTinh("Dell", "Window 10");
        System.out.println("Nhà sản xuất: " + maytinh.nhaSX);
        System.out.println("Hệ điều hành: " + maytinh.HDH);
        maytinh = new MayTinh("Dell", "Window 10", "4 GB");
        System.out.println("Nhà sản xuất: " + maytinh.nhaSX);
        System.out.println("Hệ điều hành: " + maytinh.HDH);
        System.out.println("Ram: " + maytinh.ram);
        maytinh = new MayTinh("Dell", "Window 10", "4 GB", "core i5 8th gen");
        System.out.println("Nhà sản xuất: " + maytinh.nhaSX);
        System.out.println("Hệ điều hành: " + maytinh.HDH);
        System.out.println("Ram: " + maytinh.ram);
        System.out.println("CPU: " + maytinh.CPU);
        maytinh = new MayTinh("Dell", "Window 10", "4 GB", "core i5 8th gen", 2016);
        System.out.println("Nhà sản xuất: " + maytinh.nhaSX);
        System.out.println("Hệ điều hành: " + maytinh.HDH);
        System.out.println("Ram: " + maytinh.ram);
        System.out.println("CPU: " + maytinh.CPU);
        System.out.println("Năm sản xuất: " + maytinh.namSX);
        maytinh = new MayTinh("Dell", "Window 10", "4 GB", "core i5 8th gen", 2016, 15600000);
        System.out.println("Nhà sản xuất: " + maytinh.nhaSX);
        System.out.println("Hệ điều hành: " + maytinh.HDH);
        System.out.println("Ram: " + maytinh.ram);
        System.out.println("CPU: " + maytinh.CPU);
        System.out.println("Năm sản xuất: " + maytinh.namSX);
        System.out.println("Giá: " + maytinh.gia);
        maytinh = new MayTinh("Dell", "Window 10", "4 GB", "core i5 8th gen", 2016, 15600000, 2019);
        System.out.println("Nhà sản xuất: " + maytinh.nhaSX);
        System.out.println("Hệ điều hành: " + maytinh.HDH);
        System.out.println("Ram: " + maytinh.ram);
        System.out.println("CPU: " + maytinh.CPU);
        System.out.println("Năm sản xuất: " + maytinh.namSX);
        System.out.println("Giá: " + maytinh.gia);
        System.out.println("Năm bảo hành: " + maytinh.namBH);
    }
}
