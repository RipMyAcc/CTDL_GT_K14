package com.phunguyen2004110042.tuan03;

public class MayTinh {
    String nhaSX, HDH, ram, CPU;
    int namSX, gia, namBH;
    MayTinh(){
    }
    MayTinh(String nhasx){
        nhaSX = nhasx;
    }
    MayTinh(String nhasx, String hdh){
        nhaSX = nhasx;
        HDH = hdh;
    }
    MayTinh(String nhasx, String hdh, String r){
        nhaSX = nhasx;
        HDH = hdh;
        ram = r;
    }
    MayTinh(String nhasx, String hdh, String r, String cpu){
        nhaSX = nhasx;
        HDH = hdh;
        ram = r;
        CPU = cpu;
    }
    MayTinh(String nhasx, String hdh, String r, String cpu,int namsx){
        nhaSX = nhasx;
        HDH = hdh;
        ram = r;
        CPU = cpu;
        namSX = namsx;
    }
    MayTinh(String nhasx, String hdh, String r, String cpu,int namsx, int g){
        nhaSX = nhasx;
        HDH = hdh;
        ram = r;
        CPU = cpu;
        namSX = namsx;
        gia = g;
    }
    MayTinh(String nhasx, String hdh, String r, String cpu,int namsx, int g, int nBH){
        nhaSX = nhasx;
        HDH = hdh;
        ram = r;
        CPU = cpu;
        namSX = namsx;
        gia = g;
        namBH = nBH;
    }
}
