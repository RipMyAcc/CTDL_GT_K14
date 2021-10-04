package com.phunguyen2004110042.tuan01;

import java.util.Scanner;

public class Lab1bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm TB: ");
        Double diemTB = scanner.nextDouble();
        System.out.printf("%s %.2f",hoTen,diemTB);
    }
}
