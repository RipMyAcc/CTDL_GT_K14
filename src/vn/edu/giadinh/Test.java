package vn.edu.giadinh;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner bienNhap= new Scanner(System.in);
        double diemNhap;
        diemNhap = 5.0;
        System.out.print("Nhập điểm: ");
        diemNhap = bienNhap.nextDouble();
        System.out.print("Điểm vừa nhập là: " + diemNhap);
    }
}
