package com.phunguyen2004110042.kiemtragiuaky;

public class Apple {
    String id;
    double khoiluong;
    String mau;
    Apple(){}
    Apple(String i, double k, String m){
        id=i;
        khoiluong=k;
        mau=m;
    }
    void inthongtin(){
        System.out.println("Mã id táo: "+id);
        System.out.println("Khối lượng: "+khoiluong);
        System.out.println("Màu: "+mau);
        System.out.println();
    }
}
