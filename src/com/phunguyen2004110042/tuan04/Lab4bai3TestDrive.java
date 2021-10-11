package com.phunguyen2004110042.tuan04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lab4bai3TestDrive {
    public static void main(String[] args) {
        menu();
}
    static ArrayList<Lab4bai3> SanPham =new ArrayList();
    static Scanner scanner = new Scanner(System.in);
    static public void menu(){
        System.out.println("1.	Nhập danh sách sản phẩm từ bàn phím");
        System.out.println("2.	Sắp xếp giảm dần theo giá và xuất ra màn hình");
        System.out.println("3.	Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
        System.out.println("4.	Xuất giá trung bình của các sản phẩm");
        System.out.println("5.	Kết thúc");
        System.out.print("Nhập số để thực hiện chức năng: ");
        int nhap = scanner.nextInt();
        switch(nhap){
            case 1: nhap(); break;
            case 2: sapxep(); break;
            case 3: xoa(); break;
            case 4: giatb(); break;
            case 5: System.exit(0);
        }
    }
    static public void nhap(){
        System.out.println("====Nhập sản phẩm====");
        while(true){
            scanner.nextLine();
            System.out.print("Tên:");
            String ten = scanner.nextLine();
            System.out.print("Giá:");
            Double gia = scanner.nextDouble();
            System.out.print("Giảm giá:");
            Double giamgia = scanner.nextDouble();
            System.out.print("Thuế:");
            Double thue = scanner.nextDouble(); 
            SanPham.add(new Lab4bai3(ten, gia, giamgia, thue));
            System.out.print("Nhập thêm (Y/N)? ");
            if(scanner.next().equals("N")){
            break;
            }
        }
        xuat();
        scanner.nextLine();
        menu();
    }
    static public void xuat(){
        System.out.println("====In danh sách sản phẩm===");
        for(Lab4bai3 sanpham:SanPham){
            sanpham.inthongtin();
            System.out.println();
        }
    }
    static public void sapxep(){
        Collections.sort(SanPham, new Comparator<Lab4bai3>(){
            @Override
            public int compare(Lab4bai3 o1, Lab4bai3 o2) {
                return o1.giamgia.compareTo(o2.giamgia);
            }
        });
        xuat();
        scanner.nextLine();
        scanner.nextLine();
        menu();
    }
    static public void xoa(){
        System.out.print("Nhập tên sản phẩm cần xoá: ");
        scanner.nextLine();
        String nhap = scanner.nextLine();
        int i=0;
        for(Lab4bai3 x:SanPham){
            if(x.ten.equals(nhap)){
                SanPham.remove(i);
                break;
            }
            i++;
        }
        xuat();
        scanner.nextLine();
        menu();
    }
    static public void giatb(){
        System.out.println("===Giá trung bình của tất cả sản phẩm===");
        int i=0;
        Double t=0.0;
        for(Lab4bai3 x:SanPham){
            t=t+x.gia-x.giamgia-x.thue;
            i++;
        }
        System.out.println("Kết quả: "+t/i);
        scanner.nextLine();
        scanner.nextLine();
        menu();
    }
}
