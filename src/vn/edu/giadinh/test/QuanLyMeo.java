package vn.edu.giadinh.test;

import java.util.Scanner;

public class QuanLyMeo {
    public QuanLyMeo(){}
    Meo head;
    Meo tail;
    Meo current;
    Meo previous;
    Scanner bienNhap = new Scanner(System.in);
    Meo dienThongTin(){
        System.out.println("Nhập tên: ");
        String ten = bienNhap.nextLine();
        System.out.println("Nhập Tuổi: ");
        int tuoi = bienNhap.nextInt();
        System.out.println("Màu Sắc: ");
        bienNhap.nextLine();
        String mausac = bienNhap.nextLine();
        System.out.println("Giống: ");
        String giong = bienNhap.nextLine();
        Meo meo = new Meo(ten, tuoi, mausac, giong);
        return meo;
    }
    void add(){
        Meo meo = dienThongTin();
        if(head==null){
            head=meo;
            tail=meo;
        }
        else{
            tail.next=meo;
            tail=meo;
        }
    }
    void inThongTin(){
        current= head;
        if(head==null){
            System.out.println("Danh sách không có con mèo nào");
            return;
        }
        System.out.println("Các con mèo trong danh sách:");
        while(current!=null){
            current.inThongTin();
            current=current.next;
        }
    }
    boolean tim(String ten){
        current = head;
        boolean result = false;
        while(current!=null){
            if(current.ten.equals(ten)){
                result =true;
                return result;
            }
            current=current.next;
        }
        return result;
    }
    void timXongInthongTin(String ten){
        if(true==tim(ten)){
            current.inThongTin();
        }
        else{
            System.out.println("Không tìm thấy");
        }
    }
    void timMeoRoiThemVaoDangTruoc(String ten){
        if(true==tim(ten)){
            if(current==head){
                addHead();
            }
            else{
                timDangTruoc();
                Meo meo = dienThongTin();
                previous.next=meo;
                previous.next.next=current;
            }
        }
        else{
            System.out.println("Không tìm thấy");
        }
    }
    void timDangTruoc(){
        previous = head;
        while(previous!=null){
            if(previous.next==current){
                return;
            }
            previous=previous.next;
        }
    }
    void addHead(){
        Meo meo = dienThongTin();
        meo.next=head;
        head=meo;
    }
}
