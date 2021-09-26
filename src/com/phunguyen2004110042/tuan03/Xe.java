package com.phunguyen2004110042.tuan03;

public class Xe {
    String ten, hangSX, dong, giayPhep;
    int dungTichXang;
    Xe(){
    }
    Xe(String t){
        ten = t;

    }
    Xe(String t, String hsx){
        ten = t;
        hangSX = hsx;
    }
    Xe(String t, String hsx, String d){
        ten = t;
        hangSX = hsx;
        dong = d;
    }
    Xe(String t, String hsx, String d, String gP){
        ten = t;
        hangSX = hsx;
        dong = d;
        giayPhep = gP;
    }
    Xe(String t, String hsx, String d, String gP, int dtx){
        ten = t;
        hangSX = hsx;
        dong = d;
        giayPhep = gP;
        dungTichXang = dtx;
    }
}
