package vn.edu.giadinh;

public class Dog {
    int size;
    String name, color;
    public Dog(){
    }
    public Dog(int z, String n, String c){
        name = n;
        size = z;
        color = c;
    }
    void inthongtin(){
            System.out.println("Name: "+name +", Size: "+size + ", Color: "+color);
    }

}
