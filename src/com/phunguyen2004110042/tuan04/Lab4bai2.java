package com.phunguyen2004110042.tuan04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Lab4bai2 {
    public static void main(String[] args) {
        memu();
    }
    static ArrayList<String> list=new ArrayList();
    static Scanner scanner = new Scanner(System.in);
    static void memu(){
        System.out.println();
        System.out.println("1.  Nhập danh sách họ và tên");
        System.out.println("2.	Xuất danh sách");
        System.out.println("3.	Sắp xếp ngẫu nhiên");
        System.out.println("4.	Sắp xếp giảm dần");
        System.out.println("5.	Tìm và xóa họ tên nhập từ bàn phím");
        System.out.println("6.	Kết thúc");
        System.out.print("Nhập số để thực hiện chức năng: ");
        Scanner scanner = new Scanner(System.in);
        int nhap = scanner.nextInt();
        switch(nhap){
            case 1:nhap(); break;
            case 2:xuat(); break;
            case 3:ngaunhien(); break;
            case 4:sapxep(); break;
            case 5:xoa(); break;
            case 6: System.exit(0);
        }
    }
    static public void nhap(){
        String x;
        System.out.print("Nhập họ và tên: ");
        while(true){
            x = scanner.nextLine(); 
            list.add(x);
            System.out.print("Nhập thêm (Y/N)? ");
            if(scanner.next().equals("N")){
            break;
            }
            scanner.nextLine();
        }
        memu();
    }
    static public void xuat(){
        System.out.println("Xuất danh sách:");
        for(String x:list){
            System.out.println(x);
        }
        scanner.nextLine();
        memu();
    }
    static public void ngaunhien(){
        Collections.shuffle(list);
        xuat();
        scanner.nextLine();
        memu();
    }
    static public void sapxep(){
        Collections.sort(list);
        Collections.reverse(list);
        xuat();
        scanner.nextLine();
        memu();
    }
    static public void xoa(){
        System.out.println("Nhập họ tên cần xoá");
        String hoten = scanner.nextLine();
        for(String x: list){
            if(x.equals(hoten)){
                list.remove(x);
                break;
            }
        }
        xuat();
        scanner.nextLine();
        memu();
    }
}
