package Lab2.baithem;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow = new Cow(15,"Western", "black" );
        System.out.println("Weight: " + cow.weight + "  Breed: " + cow.breed + "  Color: " + cow.color);        cow.weight = 17;
    }
}