package vn.edu.giadinh.test;

import java.util.Scanner;

public class QuanLyMeoTestDrive {
    static QuanLyMeo qlmeo = new QuanLyMeo();
    static Scanner bienNhap = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    static void menu(){
        System.out.println("> > > > MENU > > > >");
        System.out.println("1.  Thêm mèo vào danh sách");
        System.out.println("2.  In danh sách");
        System.err.println("3. Tìm mèo trong danh sách");
        System.out.print("Nhập số để thực hiện chức năng: ");
        String number = bienNhap.nextLine();
        switch(number){
            case "1": themMeo(); break;
            case "2": inThongTin(); break;
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
        bienNhap.nextLine();
    }
    static void themMeo(){
        while (true){
            qlmeo.add();
            System.out.println("Thêm mèo(y/n): ");
            if(bienNhap.nextLine().equals("n")){
                break;
            }
        }
        nhanEnterDeTiepTuc();
        menu();

    }
    static void inThongTin(){
        qlmeo.inThongTin();
        bienNhap.nextLine();
        nhanEnterDeTiepTuc();
        menu();
    }
}
