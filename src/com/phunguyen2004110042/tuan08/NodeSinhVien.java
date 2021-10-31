package com.phunguyen2004110042.tuan08;

public class NodeSinhVien {
    double diem;
    String hoten;
    NodeSinhVien next;
    public NodeSinhVien(){
    }
    public NodeSinhVien(double d, String t){
        diem = d;
        hoten = t;
        next=null;
    }
    public NodeSinhVien(double d, String t, NodeSinhVien n){
        diem = d;
        hoten = t;
        next= n;
    }
    void inthongtin(){
        System.out.println("Họ tên: "+hoten);
        System.out.println("Điểm: "+diem);
        System.out.println();
    }
}
