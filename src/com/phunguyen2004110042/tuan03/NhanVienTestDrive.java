package com.phunguyen2004110042.tuan03;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanvien;
        nhanvien = new NhanVien("NTR man");
        System.out.println("Tên nhân viên: " + nhanvien.ten);
        nhanvien = new NhanVien("NTR man", "69/96, 666, Chad");
        System.out.println("Tên nhân viên: " + nhanvien.ten);
        System.out.println("Địa chỉ: " + nhanvien.diaChi);
        nhanvien = new NhanVien("NTR man", "69/96, 666, Chad", "Giám đốc");
        System.out.println("Tên nhân viên: " + nhanvien.ten);
        System.out.println("Địa chỉ: " + nhanvien.diaChi);
        System.out.println("Bộ phận làm việc: " + nhanvien.boPhanLamViec);
        nhanvien = new NhanVien("NTR man", "69/96, 666, Chad", "Giám đốc", "6/9/69");
        System.out.println("Tên nhân viên: " + nhanvien.ten);
        System.out.println("Địa chỉ: " + nhanvien.diaChi);
        System.out.println("Bộ phận làm việc: " + nhanvien.boPhanLamViec);
        System.out.println("Ngày sinh: " + nhanvien.ngaySinh);
        nhanvien = new NhanVien("NTR man", "69/96, 666, Chad", "Giám đốc", "6/9/69", 123456000);
        System.out.println("Tên nhân viên: " + nhanvien.ten);
        System.out.println("Địa chỉ: " + nhanvien.diaChi);
        System.out.println("Bộ phận làm việc: " + nhanvien.boPhanLamViec);
        System.out.println("Ngày sinh: " + nhanvien.ngaySinh);
        System.out.println("Lương: " + nhanvien.luong);
    }
}
