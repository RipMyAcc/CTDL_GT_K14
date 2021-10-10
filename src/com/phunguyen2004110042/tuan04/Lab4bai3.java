package com.phunguyen2004110042.tuan04;

public class Lab4bai3 {
    String ten;
    Double gia, giamgia, thue;
    Lab4bai3(String t, Double g, Double  gg, Double th){
        ten = t;
        gia = g;
        giamgia = gg;
        thue = th;
    }
    void inthongtin(){
        System.out.println("Tên: "+ten);
        System.out.println("Giá: "+gia);
        System.out.println("Giảm giá: "+giamgia);
        System.out.println("Thuế: "+thue);
    }
}
