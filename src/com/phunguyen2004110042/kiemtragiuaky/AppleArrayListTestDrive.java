package com.phunguyen2004110042.kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleArrayListTestDrive {
    public static void main(String[] args) {
        khoApple.add(new Apple("00001", 1.1, "Black"));
        khoApple.add(new Apple("00002", 1.3, "White"));
        khoApple.add(new Apple("00003", 2.0, "Golden"));
        menu();
    }
    static ArrayList<Apple> khoApple = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static public void menu(){
        System.out.println("=========Menu=========");
        System.out.println("1.	Thêm táo vào kho");
        System.out.println("2.	Tìm táo theo màu");
        System.out.println("3.	In danh sách táo");
        System.out.println("4.	Kết thúc");
        System.out.print("Nhập số để thực hiện chức năng: ");
        int nhap = scanner.nextInt();
        switch(nhap){
            case 1: them(); ; break;
            case 2: tim(); ; break;
            case 3: indanhsach(); ; break;
            case 4: System.exit(0);
        }
    }
    static public void them(){
        System.out.println("====Thêm táo vào kho====");
        int c=1;
        while(true){
            System.out.println("Thêm táo thứ "+c);
            scanner.nextLine();
            System.out.print("Mã (id): ");
            String i = scanner.nextLine();
            System.out.print("Khối lượng: ");
            Double k = scanner.nextDouble(); 
            System.out.print("Màu sắc: ");
            scanner.nextLine();
            String m = scanner.nextLine();
            khoApple.add(new Apple(i, k, m));
            System.out.print("Nhập thêm (Y/N)? ");
            if(scanner.nextLine().equals("N")){
            break;
            }
            c++;
        }
        menu();
    }
    static public void tim(){
        System.out.println("====Tìm táo theo màu===");
        scanner.nextLine();
        System.out.print("Nhập màu táo cần tìm: ");
        String nhap = scanner.nextLine();
        if(kt(nhap)==false){
            System.out.println("Không tìm thấy");
        }
        scanner.nextLine();
        menu();
    }
    static public boolean kt(String nhap){
        boolean kq = false;
        for(Apple x:khoApple){
            if(x.mau.equals(nhap)){
                x.inthongtin();
                kq = true;
            }            
        }
        return kq;
    }
    static public void indanhsach(){
        System.out.println("=====Thông tin tất cả táo trong kho=====");
        for (Apple x : khoApple) {
            x.inthongtin();
        }
    }
}
