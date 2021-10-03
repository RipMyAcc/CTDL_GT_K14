package com.phunguyen2004110042.tuan03;

public class Lab3bai2 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++)
        {
            System.out.println("Bảng cửu chương "+i);
            for(int j=1;j<=10;j++)
            {
                System.out.printf("%d x %d = %d",i,j,i*j);
                System.out.println();
            }
        }
    }
}
