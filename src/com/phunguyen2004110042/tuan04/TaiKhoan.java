package com.phunguyen2004110042.tuan04;

public class TaiKhoan {
    String ten, soTK;
    int  soDu;
    TaiKhoan(String t, String stk, int sd){
        ten = t;
        soTK = stk;
        soDu = sd;
    }
    void inthongtin(){
        System.out.println("Tên chủ tài khoản: " + ten);
        System.out.println("Số tài khoản: " + soTK);
        System.out.println("Số dư trong tài khoản: " + soDu);
    }
}
