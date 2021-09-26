package com.phunguyen2004110042.tuan03;

public class Sach {
    int gia, giaBan, soLuong, namXB ;
    String nhaXB, loai;
    Sach(){
    }
    Sach(int g){
        gia = g;

    }
    Sach(int g,int gB){
        gia = g;
        giaBan = gB;
    }
    Sach(int g,int gB, int sL){
        gia = g;
        giaBan = gB;
        soLuong = sL;
    }
    Sach(int g,int gB, int sL, int namxb){
        gia = g;
        giaBan = gB;
        soLuong = sL;
        namXB = namxb;
    }
    Sach(int g,int gB, int sL, int namxb, String nhaxb){
        gia = g;
        giaBan = gB;
        soLuong = sL;
        namXB = namxb;
        nhaXB = nhaxb;
    }
    Sach(int g,int gB, int sL, int namxb, String nhaxb, String l){
        gia = g;
        giaBan = gB;
        soLuong = sL;
        namXB = namxb;
        nhaXB = nhaxb;
        loai = l;
    }
}
