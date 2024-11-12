public class BalloonTester {
    public static void main(String[] args) {
        Balloon balloon = new Balloon();

        balloon.addAir(100);
        System.out.println("After adding 100 cm^3 of air:");
        System.out.printf("Volume: %.2f cm^3%n", balloon.getVolume());
        System.out.printf("Radius: %.2f cm%n", balloon.getRadius());
        System.out.printf("Surface Area: %.2f cm^2%n", balloon.getSurfaceArea());

        balloon.addAir(100);
        System.out.println("\nAfter adding another 100 cm^3 of air:");
        System.out.printf("Volume: %.2f cm^3%n", balloon.getVolume());
        System.out.printf("Radius: %.2f cm%n", balloon.getRadius());
        System.out.printf("Surface Area: %.2f cm^2%n", balloon.getSurfaceArea());
    }
}
