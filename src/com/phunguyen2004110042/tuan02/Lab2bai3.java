package Lab2;

import java.util.Scanner;

public class Lab2bai3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập số điện: ");
        Integer dien = nhap.nextInt();
        int tien = 0;
        if(dien<51)
            tien = dien*1000;
        else if(dien>50)
            tien = 50*1000 - (dien-50)*1200;
        System.out.println("Tiền điện: " + tien);
    }
}
