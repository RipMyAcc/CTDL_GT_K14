package com.phunguyen2004110042.tuan09;

public class Apple {
    String id;
    double weight;
    String color;
    Apple next;
    public Apple(){}
    public Apple(String ma, double khoiluong, String mau){
        id=ma;
        weight=khoiluong;
        color=mau;
        next=null;
    }
    public Apple(String ma, double khoiluong, String mau, Apple n){
        id=ma;
        weight=khoiluong;
        color=mau;
        next=n;
    }
    void inthongtin(){
        System.out.println("-------------------");
        System.out.println("Mã id táo: "+id);
        System.out.println("Khối lượng: "+weight);
        System.out.println("Màu: "+color);
    }
}
