package com.phunguyen2004110042.tuan04;

public class MayTinh {
    String nhaSX, HDH, ram, CPU;
    int namSX, gia, namBH;
    MayTinh(String nhasx, String hdh, String r, String cpu,int namsx, int g, int nBH){
        nhaSX = nhasx;
        HDH = hdh;
        ram = r;
        CPU = cpu;
        namSX = namsx;
        gia = g;
        namBH = nBH;
    }
    void inthongtin(){
        System.out.println("Nhà sản xuất: " + nhaSX);
        System.out.println("Hệ điều hành: " + HDH);
        System.out.println("Ram: " + ram);
        System.out.println("CPU: " + CPU);
        System.out.println("Năm sản xuất: " + namSX);
        System.out.println("Giá: " + gia);
        System.out.println("Năm bảo hành: " + namBH);
    }
}
