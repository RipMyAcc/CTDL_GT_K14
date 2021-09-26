package com.phunguyen2004110042.tuan03;

import java.net.Socket;

public class TaiKhoan {
    String ten, soTK;
    int  soDu;
    TaiKhoan(){
    }
    TaiKhoan(String t){
        ten = t;
    }
    TaiKhoan(String t, String stk){
        ten = t;
        soTK = stk;
    }
    TaiKhoan(String t, String stk, int sd){
        ten = t;
        soTK = stk;
        soDu = sd;
    }
}
