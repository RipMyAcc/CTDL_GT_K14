package com.phunguyen2004110042.kiemtragiuaky;

public class AppleNode {
    String id;
    double khoiluong;
    String mau;
    AppleNode next;
    public AppleNode(){}
    public AppleNode(String i, double k, String m){
        id=i;
        khoiluong=k;
        mau=m;
        next=null;
    }
    public AppleNode(String i, double k, String m, AppleNode n){
        id=i;
        khoiluong=k;
        mau=m;
        next=n;
    }
    void inthongtin(){
        System.out.println("Mã id táo: "+id);
        System.out.println("Khối lượng: "+khoiluong);
        System.out.println("Màu: "+mau);
        System.out.println();
    }
}
