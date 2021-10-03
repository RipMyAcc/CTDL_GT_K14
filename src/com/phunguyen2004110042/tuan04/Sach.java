package com.phunguyen2004110042.tuan04;

public class Sach {
    int gia, giaBan, soLuong, namXB ;
    String nhaXB, loai;
    Sach(int g,int gB, int sL, int namxb, String nhaxb, String l){
        gia = g;
        giaBan = gB;
        soLuong = sL;
        namXB = namxb;
        nhaXB = nhaxb;
        loai = l;
    }
    void inthongtin(){
        System.out.println("Giá :" + gia);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Năm xuất bản: "+ namXB);
        System.out.println("Nhà xuất bản: " + nhaXB);
        System.out.println("Loại: " + loai);
        System.out.println();
    }
}
