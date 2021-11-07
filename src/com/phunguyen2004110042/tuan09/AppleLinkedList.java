package com.phunguyen2004110042.tuan09;

import java.util.Scanner;

public class AppleLinkedList {
    AppleLinkedList(){}
    Apple head;
    Apple tail;
    Apple current;
    Apple previous;
    Apple check;
    Apple temp;
    Apple save;
    Scanner nhapSo = new Scanner(System.in);
    Scanner nhapKiTu = new Scanner(System.in);
    Apple dienThongTin(){
        System.out.println("-------------------");
        System.out.print("Nhập id: ");
        String ma = nhapKiTu.nextLine();
        System.out.print("Nhập khối lượng: ");
        double khoiluong = nhapSo.nextDouble();
        System.out.print("Nhập màu: ");
        String mau = nhapKiTu.nextLine();
        Apple apple = new Apple(ma, khoiluong, mau);
        return apple;
    }
    void add(){
        Apple apple = dienThongTin();
        if(head==null){
            head=apple;
            tail=apple;
        }
        else{
            tail.next=apple;
            tail=apple;
        }
    }
    void inThongTin(){
        current= head;
        if(head==null){
            System.out.println("Danh sách không có táo");
            return;
        }
        System.out.println("Các quả táo trong danh sách:");
        while(current!=null){
            current.inthongtin();
            current=current.next;
        }
    }
    void tangDanSelection(){
        current=head;
        while(current!=null){
            check=current;
            save=current;
            while(check!=null){
                if(check.weight<save.weight){
                    save=check;
                }
                check=check.next;
            }
            swapInfo();
            current=current.next;
        }
    }
    void giamDanSelection(){
        current=head;
        while(current!=null){
            check=current;
            save=current;
            while(check!=null){
                if(check.weight>save.weight){
                    save=check;
                }
                check=check.next;
            }
            swapInfo();
            current=current.next;
        }
    }
    void swapInfo(){
        temp = new Apple();
        temp.color=save.color;
        temp.id=save.id;
        temp.weight=save.weight;
        save.color=current.color;
        save.id=current.id;
        save.weight=current.weight;
        current.color=temp.color;
        current.id=temp.id;
        current.weight=temp.weight;
    }
    boolean timTheoMaTuyenTinh(String ma){
        current = head;
        boolean result = false;
        while(current!=null){
            if(current.id.equals(ma)){
                current.inthongtin();
                result =true;
            }
            current=current.next;
        }
        return result;
    }
    void checkTimTheoMaTuyenTinh(String ma){
        if(false==timTheoMaTuyenTinh(ma)){
            System.out.println("Không tìm thấy");
        }
    }
    boolean timTheoCanNangTuyenTinh(double from, double to){
        current = head;
        boolean result = false;
        while(current!=null){
            if(current.weight>=from&&current.weight<=to){
                current.inthongtin();
                result =true;
            }
            current=current.next;
        }
        return result;
    }
    void checkTimTheoCanNangTuyenTinh(double from, double to){
        if(false==timTheoCanNangTuyenTinh(from, to)){
            System.out.println("Không tìm thấy");
        }
    }
    boolean timTheoMauTuyenTinh(String mau){
        current = head;
        boolean result = false;
        while(current!=null){
            if(current.color.equals(mau)){
                current.inthongtin();
                result =true;
            }
            current=current.next;
        }
        return result;
    }
    void checkTimTheoMauTuyenTinh(String mau){
        if(false==timTheoMauTuyenTinh(mau)){
            System.out.println("Không tìm thấy");
        }
    }
}
