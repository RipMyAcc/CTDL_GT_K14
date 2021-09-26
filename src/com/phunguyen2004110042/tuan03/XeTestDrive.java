package com.phunguyen2004110042.tuan03;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe xe;
        xe = new Xe("Mr No Brake");
        System.out.println("Tên chủ xe: " + xe.ten);
        xe = new Xe("Mr No Brake", "Engine go brrrrr");
        System.out.println("Tên chủ xe: " + xe.ten);
        System.out.println("Hãng sản xuất: " + xe.hangSX);
        xe = new Xe("Mr No Brake", "Engine go brrrrr", "Death Head");
        System.out.println("Tên chủ xe: " + xe.ten);
        System.out.println("Hãng sản xuất: " + xe.hangSX);
        System.out.println("Dòng: " + xe.dong);
        xe = new Xe("Mr No Brake", "Engine go brrrrr", "Death Head", "0666X777");
        System.out.println("Tên chủ xe: " + xe.ten);
        System.out.println("Hãng sản xuất: " + xe.hangSX);
        System.out.println("Dòng: " + xe.dong);
        System.out.println("Giấy phép: " + xe.giayPhep);
        xe = new Xe("Mr No Brake", "Engine go brrrrr", "Death Head", "0666X777", 666);
        System.out.println("Tên chủ xe: " + xe.ten);
        System.out.println("Hãng sản xuất: " + xe.hangSX);
        System.out.println("Dòng: " + xe.dong);
        System.out.println("Giấy phép: " + xe.giayPhep);
        System.out.println("Dung tích xăng: " + xe.dungTichXang);
    }
}
