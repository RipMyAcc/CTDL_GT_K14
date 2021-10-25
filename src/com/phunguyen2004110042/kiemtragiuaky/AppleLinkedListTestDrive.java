package com.phunguyen2004110042.kiemtragiuaky;

import java.util.Scanner;

public class AppleLinkedListTestDrive {
    public static void main(String[] args) {
        AppleLinkedList appleLinkedList = new AppleLinkedList();
        appleLinkedList.add("0001", 0.5, "Red");
        appleLinkedList.add("0002", 0.7, "Purple");
        appleLinkedList.add("0001", 1.2, "Yellow");
        menu();
    }
    static AppleLinkedList appleLinkedList = new AppleLinkedList();
    static Scanner scanner = new Scanner(System.in);
    static public void menu(){
        System.out.println("=========Menu=========");
        System.out.println("1.	Thêm táo vào đầu danh sách");
        System.out.println("2.	Thêm táo vào cuối danh sách");
        System.out.println("3.	Tìm táo theo mã id");
        System.out.println("4.	In danh sách táo");
        System.out.println("5.	Thêm táo trước trái táo tìm được");
        System.out.println("6.	Xoá táo ở cuối danh sách");
        System.out.println("7.	Kết thúc");
        System.out.print("Nhập số để thực hiện chức năng: ");
        int nhap = scanner.nextInt();
        switch(nhap){
            case 1: addHead(); ; break;
            case 2: addTail(); ; break;
            case 3:  ; break;
            case 4:  ; break;
            case 5:  ; break;
            case 6:  ; break;
            case 7: System.exit(0);
        }
    }
    static public void addHead(){
        System.out.println("====Thêm táo vào đầu danh sách====");
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
            appleLinkedList.addHead(i, k, m);
            System.out.print("Nhập thêm (Y/N)? ");
            if(scanner.nextLine().equals("N")){
            break;
            }
            c++;
        }
        menu();
    }
    static public void addTail(){
        System.out.println("====Thêm táo vào đầu danh sách====");
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
            appleLinkedList.add(i, k, m);
            System.out.print("Nhập thêm (Y/N)? ");
            if(scanner.nextLine().equals("N")){
            break;
            }
            c++;
        }
        menu();
    }
    public static void search(){
        
        menu();
    }
}
