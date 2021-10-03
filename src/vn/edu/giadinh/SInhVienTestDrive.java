package vn.edu.giadinh;

public class SInhVienTestDrive {
    public static void main(String[] args) {
        SinhVien DanhSachSinhVien[] = new SinhVien[5];
        SinhVien sinhvien1 = new SinhVien("01", "Nguyễn Văn A", "HCM", 18);
        SinhVien sinhvien2 = new SinhVien("02", "Nguyễn Văn B", "HCM", 19);
        SinhVien sinhvien3 = new SinhVien("03", "Nguyễn Văn C", "HCM", 22);
        SinhVien sinhvien4 = new SinhVien("04", "Nguyễn Văn D", "HCM", 20);
        SinhVien sinhvien5 = new SinhVien("05", "Nguyễn Văn E", "HCM", 21);
        DanhSachSinhVien[0] = sinhvien1;
        DanhSachSinhVien[1] = sinhvien2;
        DanhSachSinhVien[2] = sinhvien3;
        DanhSachSinhVien[3] = sinhvien4;
        DanhSachSinhVien[4] = sinhvien5;
        for(int i=0; i<DanhSachSinhVien.length;i++){
            DanhSachSinhVien[i].inThongTin();
        }
    }
}
