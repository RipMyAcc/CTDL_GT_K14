package com.phunguyen2004110042.tuan09;

import java.util.Scanner;

public class AppleTestDrive {
    static AppleLinkedList dsApple = new AppleLinkedList();
    static Scanner nhapSo = new Scanner(System.in);
    static Scanner nhapKiTu = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    static void menu(){
        System.out.println("> > > > MENU > > > >");
        System.out.println("1.  Thêm táo vào danh sách");
        System.out.println("2.  In danh sách");
        System.err.println("3.  Sắp xếp danh sách táo tăng dần theo cân nặng");
        System.out.println("4.  Sắp xếp danh sách táo giảm dần theo cân nặng");
        System.out.println("5.  Tìm táo theo mã");
        System.out.println("6.  Tìm táo theo cân nặng");
        System.out.println("7.  Tìm táo theo màu");
        System.out.print("Nhập số để thực hiện chức năng: ");
        String number = nhapKiTu.nextLine();
        switch(number){
            case "1": them(); break;
            case "2": inThongTin(); break;
            case "3": sapXepTang(); break;
            case "4": sapXepGiam(); break;
            case "5": timTheoMa(); break;
            case "6": timTheoCanNang(); break;
            case "7": timTheoMau(); break;
            default: {
                System.out.println("Số nhập vào không hợp lệ");
                nhanEnterDeTiepTuc();
                menu();
                break;
            }
        }
    }
    static void nhanEnterDeTiepTuc(){
        System.out.println("Nhấn Enter để tiếp tục");
        nhapKiTu.nextLine();
    }
    static void them(){
        while (true){
            dsApple.add();
            System.out.println("Thêm táo (y/n): ");
            if(nhapKiTu.nextLine().equals("n")){
                break;
            }
        }
        nhanEnterDeTiepTuc();
        menu();

    }
    static void inThongTin(){
        dsApple.inThongTin();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void sapXepTang(){
        dsApple.tangDanSelection();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void sapXepGiam(){
        dsApple.giamDanSelection();
        nhanEnterDeTiepTuc();
        menu();
    }
    static void timTheoMa(){
        System.out.print("Nhập mã táo cần tìm: ");
        String ma = nhapKiTu.nextLine();
        dsApple.checkTimTheoMaTuyenTinh(ma);
        nhanEnterDeTiepTuc();
        menu();
    }
    static void timTheoCanNang(){
        System.out.println("Nhập khoảng cân nặng cần tìm ");
        System.out.print("Từ: ");
        double from = nhapSo.nextDouble();
        System.out.print("Đến: ");
        double to = nhapSo.nextDouble();
        dsApple.checkTimTheoCanNangTuyenTinh(from, to);
        nhanEnterDeTiepTuc();
        menu();
    }
    static void timTheoMau(){
        System.out.print("Nhập màu táo cần tìm: ");
        String mau = nhapKiTu.nextLine();
        dsApple.checkTimTheoMauTuyenTinh(mau);
        nhanEnterDeTiepTuc();
        menu();
    }
}
