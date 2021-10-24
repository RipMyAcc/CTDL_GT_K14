package com.phunguyen2004110042.tuan06;

import java.util.Scanner;


public class Lab5bai4TestDrive {
    public static void main(String[] args) {
        menu();
    }
    static Lab5bai4 DsSanPham[];
    static Lab5bai4 temp[];
    static Scanner scanner = new Scanner(System.in);
    static int n=0;
    static public void menu(){
        System.out.println("1.	Nhập danh sách sản phẩm mới từ bàn phím");
        System.out.println("2.	Sắp xếp giảm dần theo giá và xuất ra màn hình");
        System.out.println("3.	Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
        System.out.println("4.	Xuất giá trung bình của các sản phẩm");
        System.out.println("5.	Thêm sản phẩm tại vị trí");
        System.out.println("6.	Kết thúc");
        System.out.print("Nhập số để thực hiện chức năng: ");
        int nhap = scanner.nextInt();
        switch(nhap){
            case 1: nhap(); break;
            case 2: sapxep(); break;
            case 3: xoa(); break;
            case 4: giatb(); break;
            case 5: them(); break;
            case 6: System.exit(0);
        }
    }
    static public void nhap(){
        System.out.println("====Nhập danh sách sản phẩm mới====");
        System.out.print("Nhập số lượng sản phẩm: ");
        n=scanner.nextInt();
        DsSanPham = new Lab5bai4[n];
        for(int i=0;i<n;i++){
            System.out.printf("Nhập sản phẩm thứ %d",i+1);
            System.out.println();
            System.out.print("Tên:");
            scanner.nextLine();
            String ten = scanner.nextLine();
            System.out.print("Giá:");
            Double gia = scanner.nextDouble();
            System.out.print("Giảm giá:");
            Double giamgia = scanner.nextDouble();
            System.out.print("Thuế:");
            Double thue = scanner.nextDouble();
            DsSanPham[i] = new Lab5bai4(ten, gia, giamgia, thue);
        }
        System.out.println();
        xuat();
        scanner.nextLine();
        menu();
    }
    static public void xuat(){
        System.out.println("====In danh sách sản phẩm===");
        for(int i=0;i<n;i++){
            DsSanPham[i].inthongtin();
            System.out.println();
        }
    }
    static public void sapxep(){
        scanner.nextLine();
        Lab5bai4 temp = new Lab5bai4();
        for(int j=0;j<n+1;j++){
            for(int i=0;i<n-1;i++){
                if(DsSanPham[i].gia<DsSanPham[i+1].gia){
                    temp=DsSanPham[i];
                    DsSanPham[i]=DsSanPham[i+1];
                    DsSanPham[i+1]=temp;
                }
            }
        }
        System.out.println("Đã sắp xếp");
        xuat();
        scanner.nextLine();
        menu();
    }
    static public int tim(){
        int i=0;
        int result = -1;
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        scanner.nextLine();
        String temp = scanner.nextLine();
        for (Lab5bai4 x : DsSanPham) {
            if(x.ten.equals(temp)){
                result=i;
                break;
            }
            i++;
        }
        return result;
    }
    static public void xoa(){
        int result = tim();
        if(result == -1){
            System.out.println("Không tìm thấy");
        }
        else{
            for(int i=result;i<n-1;i++){
                DsSanPham[i]=DsSanPham[i+1];
            }
            n--;
            System.out.println("Đã xoá");
            xuat();
        }
        scanner.nextLine();
        menu();
    }
    static public void giatb(){
        double tong =0;
        for(int i=0;i<n;i++){
            tong=tong + DsSanPham[i].gia - DsSanPham[i].giamgia - DsSanPham[i].thue; 
        }
        tong=tong/n;
        System.out.println("Giá trung bình: "+ tong);
        scanner.nextLine();
        scanner.nextLine();
        menu();
    }
    static public void them(){
        System.out.println("Số sản phẩm hiện tại: "+n);
        System.out.print("Nhập vị trí để thêm sản phẩm sau vị trí đó: ");
        int them=scanner.nextInt();
        if(them<=n){
            addArrray();
            for(int i=n-1;i>them;i--){
                DsSanPham[i]=DsSanPham[i-1];
            }
            System.out.print("Tên:");
            scanner.nextLine();
            String ten = scanner.nextLine();
            System.out.print("Giá:");
            Double gia = scanner.nextDouble();
            System.out.print("Giảm giá:");
            Double giamgia = scanner.nextDouble();
            System.out.print("Thuế:");
            Double thue = scanner.nextDouble();
            DsSanPham[them] = new Lab5bai4(ten, gia, giamgia, thue);
            xuat();
            scanner.nextLine();
            menu();
        }
        else{
            System.out.println("Hãy nhập lại");
            them();
        }
    }
    static public void addArrray(){
        temp= new Lab5bai4[n];
        for(int i=0;i<n;i++){
            temp[i]=DsSanPham[i];
        }
        n++;
        DsSanPham= new Lab5bai4[n];
        for(int i=0;i<n-1;i++){
            DsSanPham[i]=temp[i];
        }
    }
}
