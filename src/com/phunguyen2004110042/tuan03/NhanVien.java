package com.phunguyen2004110042.tuan03;

public class NhanVien {
    String ten, diaChi, boPhanLamViec, ngaySinh;
    int luong;
    NhanVien(){
    }
    NhanVien(String t){
        ten = t;
    }
    NhanVien(String t, String dC){
        ten = t;
        diaChi = dC;
    }
    NhanVien(String t, String dC, String bPLV){
        ten = t;
        diaChi = dC;
        boPhanLamViec = bPLV;
    }
    NhanVien(String t, String dC, String bPLV, String nS){
        ten = t;
        diaChi = dC;
        boPhanLamViec = bPLV;
        ngaySinh = nS;
    }
    NhanVien(String t, String dC, String bPLV, String nS, int l){
        ten = t;
        diaChi = dC;
        boPhanLamViec = bPLV;
        ngaySinh = nS;
        luong = l;
    }
}
