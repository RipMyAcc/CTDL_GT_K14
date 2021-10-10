package vn.edu.giadinh;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add("I");
        a.add("am");
        a.add("single");
        a.add("it's");
        a.add(true);
        a.add(1);
        a.add(new Dog(3000, "Nasus", "Blown"));
        Dog dog = (Dog)a.get(6);
        System.out.println("Size "+ dog.size+" Name "+dog.name+" Color "+dog.color);
    }
}
