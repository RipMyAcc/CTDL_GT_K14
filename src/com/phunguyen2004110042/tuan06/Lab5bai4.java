package com.phunguyen2004110042.tuan06;

public class Lab5bai4 {
    String ten;
    Double gia, giamgia, thue;
    Lab5bai4(){};
    Lab5bai4(String t, Double g, Double  gg, Double th){
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
