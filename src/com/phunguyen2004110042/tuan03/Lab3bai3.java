package com.phunguyen2004110042.tuan03;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();
        int mang[] = new int [n];
        System.out.println("Nhập các phần tử của mảng:");
        for(int i=0;i<n;i++)
        {
            System.out.printf("mang[%d] = ",i);
            mang[i] = scanner.nextInt();
        }
        int min= mang[0];
        for (int i=1;i<mang.length;i++)
        {
            min= Math.min(min, mang[i]);
        }
        System.out.println("Số nhỏ nhất là: "+min);
        Arrays.sort(mang);
        System.out.println("Mảng sau khi sắp xếp: ");
        for(int i=0;i<n;i++)
        {
            System.out.printf("mang[%d] = %d",i,mang[i]);
            System.out.println();
        }
        int t=0;
        int dem=0;
        for(int i=0;i<n;i++)
        {
            if(mang[i]% 3 == 0)
            {
                t=t+mang[i];
                dem++;
            }
        }
        System.out.println("Trung bình cộng các phần tử chia hết cho 3: "+t/dem);
    }
}
