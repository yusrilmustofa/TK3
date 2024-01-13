package TK3;
import java.util.Scanner;

// Kelas pengecualian khusus untuk input yang tidak valid
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}


interface DisplayInfoFunction {
    void displayInfo();
}

public class no3 {
    public static void main(String[] args) {
        try {
            double distance = getDistanceInput();

            CarDriving carActivity = new CarDriving();
            Biking bikeActivity = new Biking();

            double carCarbonFootprint = carActivity.calculateCarbonFootprint(distance);
            double bikeCarbonFootprint = bikeActivity.calculateCarbonFootprint(distance);

            System.out.println("\nJejak Karbon dari Mengendarai Mobil: " + carCarbonFootprint + " gram CO2e");
            System.out.println("Jejak Karbon dari Mengayuh Sepeda: " + bikeCarbonFootprint + " gram CO2e");
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Metode untuk mendapatkan input jarak dengan penanganan exception
    private static double getDistanceInput() throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan jarak perjalanan (km): ");
            double distance = Double.parseDouble(scanner.nextLine());

            if (distance < 0) {
                throw new InvalidInputException("Jarak tidak boleh negatif.");
            }

            return distance;
        } catch (NumberFormatException ex) {
            throw new InvalidInputException("Input tidak valid. Masukkan bilangan bulat atau non-negatif.");
        } finally {
            scanner.close();
        }
    }
}
