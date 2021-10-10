package vn.edu.giadinh;

public class Dog {
    public int size;
    public String name, color;
    public Dog(){
    }
    public Dog(int z, String n, String c){
        name = n;
        size = z;
        color = c;
    }
    public void inthongtin(){
            System.out.println("Name: "+name +", Size: "+size + ", Color: "+color);
    }

}
