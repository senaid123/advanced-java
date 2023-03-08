public class Main {
    public static void main(String[] args) {
        MountainBike b = new MountainBike(2,3,5);
        System.out.println(b.getGear());
        b.setGear(3);
        System.out.println(b.getGear());
    }
}