package vn.edu.giadinh;

public class SinhVien {
    String mssv, hoTen, queQuan;
    int tuoi;
    public SinhVien(String no, String name, String bp, int age){
        mssv = no;
        hoTen = name;
        queQuan = bp;
        tuoi = age;
    }
    void inThongTin(){
        System.out.println("Mã số sinh viên: " + mssv + ", Họ tên: " + hoTen + ", Tuổi: " + tuoi + ", Quê quán: " + queQuan);       
    }
}
