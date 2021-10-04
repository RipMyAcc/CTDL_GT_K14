package com.phunguyen2004110042.tuan02.baithem;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow = new Cow(15,"Western", "write" );
        System.out.println("Weight: " + cow.weight + "  Breed: " + cow.breed + "  Color: " + cow.color);        cow.weight = 17;
    }
}
