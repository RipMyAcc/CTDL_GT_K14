package com.phunguyen2004110042.tuan04;

public class Xe {
    String ten, hangSX, dong, giayPhep;
    int dungTichXang;
    Xe(String t, String hsx, String d, String gP, int dtx){
        ten = t;
        hangSX = hsx;
        dong = d;
        giayPhep = gP;
        dungTichXang = dtx;
    }
    void inthongtin(){
        System.out.println("Tên chủ xe: " + ten);
        System.out.println("Hãng sản xuất: " + hangSX);
        System.out.println("Dòng: " + dong);
        System.out.println("Giấy phép: " + giayPhep);
        System.out.println("Dung tích xăng: " + dungTichXang);
    }
}
