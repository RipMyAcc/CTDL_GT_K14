package com.phunguyen2004110042.tuan04;

public class NhanVIen {
    String ten, diaChi, boPhanLamViec, ngaySinh;
    int luong;
    NhanVIen(String t, String dC, String bPLV, String nS, int l){
        ten = t;
        diaChi = dC;
        boPhanLamViec = bPLV;
        ngaySinh = nS;
        luong = l;
    }
    void inthongtin(){
        System.out.println("Tên nhân viên: " + ten);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Bộ phận làm việc: " + boPhanLamViec);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Lương: " + luong);
    }
}
