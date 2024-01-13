package TK3;

import java.util.Scanner;

class Activity {
    private String name;
    private double carbonFactor;

    public Activity(String name, double carbonFactor) {
        this.name = name;
        this.carbonFactor = carbonFactor;
    }

    public void displayInfo() {
        System.out.println("Aktivitas: " + name);
        System.out.println("Faktor Emisi: " + carbonFactor);
    }

    public double calculateCarbonFootprint(double distance) {
        return distance * carbonFactor;
    }

    public void displayInfo(Runnable displayFunction) {
        displayFunction.run();
    }

   
}

class CarDriving extends Activity {
    public CarDriving() {
        super("Mengendarai Mobil", 0.2);
    }

    public void openDoor() {
        System.out.println("Mobil dengan pintu sedang dibuka.");
    }
}

class Biking extends Activity {
    public Biking() {
        super("Mengayuh Sepeda", 0.02);
    }

    public void pumpTires() {
        System.out.println("Ban sepeda sedang dipompa.");
    }
}

public class no2 {
    public static void main(String[] args) {
        double distance = getDistanceInput();

        CarDriving carActivity = new CarDriving();
        Biking bikeActivity = new Biking();

        carActivity.displayInfo();
        carActivity.openDoor();
        double carCarbonFootprint = carActivity.calculateCarbonFootprint(distance);

        System.out.println("\nJejak Karbon dari Mengendarai Mobil: " + carCarbonFootprint + " gram CO2e");

        bikeActivity.displayInfo();
        bikeActivity.pumpTires();
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
