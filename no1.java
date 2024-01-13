package TK3;
import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Carbon Footprint Calculator ===");

        // Input dari pengguna
        System.out.print("Masukkan jumlah kilometer yang Anda tempuh dengan mobil per hari(Km): ");
        double kmPerDay = scanner.nextDouble();

        System.out.print("Masukkan jumlah kilometer yang Anda tempuh dengan sepeda per hari(Km): ");
        double kmBikePerDay = scanner.nextDouble();

        System.out.print("Masukkan jumlah kilometer yang Anda tempuh dengan transportasi umum per hari(Km): ");
        double kmPublicTransportPerDay = scanner.nextDouble();

        System.out.print("Masukkan jumlah jam penggunaan listrik per hari(Jam): ");
        double hoursElectricityPerDay = scanner.nextDouble();

        // Hitung jejak karbon
        double carbonFootprint = calculateCarbonFootprint(kmPerDay, kmBikePerDay, kmPublicTransportPerDay, hoursElectricityPerDay);

        // Tampilkan hasil
        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.printf("Jejak Karbon Anda: %.2f gram CO2 per hari%n", carbonFootprint);

        scanner.close();
    }

    private static double calculateCarbonFootprint(double kmCar, double kmBike, double kmPublicTransport, double hoursElectricity) {
        double emissionFactorCar = 0.2;  // contoh faktor untuk mobil 
        double emissionFactorBike = 0.02;  // contoh faktor untuk sepeda
        double emissionFactorPublicTransport = 0.03;  // contoh faktor untuk transportasi umum
        double emissionFactorElectricity = 0.5;  // contoh faktor untuk listrik 

        // Perhitungan total jejak karbon
        double carbonFootprintCar = kmCar * emissionFactorCar;
        double carbonFootprintBike = kmBike * emissionFactorBike;
        double carbonFootprintPublicTransport = kmPublicTransport * emissionFactorPublicTransport;
        double carbonFootprintElectricity = hoursElectricity * emissionFactorElectricity;

        return carbonFootprintCar + carbonFootprintBike + carbonFootprintPublicTransport + carbonFootprintElectricity;
    }
}

