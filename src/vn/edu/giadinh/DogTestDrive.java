package vn.edu.giadinh;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog DanhSachDog[] = new Dog[7];
        Dog Dog1 = new Dog(23, "Cậu Vàng", "Vàng");
        Dog Dog2 = new Dog(53, "Hound", "Đen");
        Dog Dog3 = new Dog(100, "Cyberus", "Đỏ sậm");
        Dog Dog4 = new Dog(133, "Warwick", "Xám");
        Dog Dog5 = new Dog(24, "Cat", "Tím");
        Dog Dog6 = new Dog(22, "Nimba", "Da");
        Dog Dog7 = new Dog(1000, "Nasus", "Đen");
        DanhSachDog[0] = Dog1;
        DanhSachDog[1] = Dog2;
        DanhSachDog[2] = Dog3;
        DanhSachDog[3] = Dog4;
        DanhSachDog[4] = Dog5;
        DanhSachDog[5] = Dog6;
        DanhSachDog[6] = Dog7;
        for(int i = 0; i < DanhSachDog.length; i++){
            DanhSachDog[i].inthongtin();
        }
    }
}
