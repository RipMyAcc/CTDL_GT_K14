package com.phunguyen2004110042.tuan05;

public class Bai {
    String ten;
    Double diem;
    Bai(String t, Double d){
        ten = t;
        diem = d;
    }
    void inthongtin(){
        System.out.println("Tên: "+ten);
        System.out.println("Điểm trung bình: "+diem);
    }
}
