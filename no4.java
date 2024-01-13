package TK3;
import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        double distance = getDistanceInput();

        CarDriving carActivity = new CarDriving();
        Biking bikeActivity = new Biking();

        // Menggunakan Lambda Expression untuk menyederhanakan pemanggilan displayInfo
        carActivity.displayInfo(() -> carActivity.openDoor());

        double carCarbonFootprint = carActivity.calculateCarbonFootprint(distance);
        System.out.println("\nJejak Karbon dari Mengendarai Mobil: " + carCarbonFootprint + " gram CO2e");

        // Menggunakan Lambda Expression untuk menyederhanakan pemanggilan displayInfo
        bikeActivity.displayInfo(() -> bikeActivity.pumpTires());

        double bikeCarbonFootprint = bikeActivity.calculateCarbonFootprint(distance);
        System.out.println("Jejak Karbon dari Mengayuh Sepeda: " + bikeCarbonFootprint + " gram CO2e");
    }

    private static double getDistanceInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak perjalanan (km): ");
        double distance = Double.parseDouble(scanner.nextLine());

        scanner.close();
        return distance;
    }
}

