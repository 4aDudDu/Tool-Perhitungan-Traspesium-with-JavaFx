import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi atas trapesium: ");
        double panjangSisiAtas = scanner.nextDouble();

        System.out.print("Masukkan panjang sisi bawah trapesium: ");
        double panjangSisiBawah = scanner.nextDouble();

        System.out.print("Masukkan tinggi trapesium: ");
        double tinggi = scanner.nextDouble();

        Trapesium trapesium = new TrapesiumSikuSiku(panjangSisiAtas, panjangSisiBawah, tinggi);

        System.out.println("Luas trapesium: " + trapesium.hitungLuas());

        System.out.print("Masukkan panjang sisi miring trapesium siku-siku: ");
        double sisiMiring = scanner.nextDouble();

        // yang ini menggunakan Polymorphism pak (Overloading)
        TrapesiumSikuSiku trapesiumSikuSiku = new TrapesiumSikuSiku(panjangSisiAtas, panjangSisiBawah, tinggi);
        System.out.println("Luas trapesium siku-siku: " + trapesiumSikuSiku.hitungLuas(sisiMiring));

        scanner.close();
    }
}