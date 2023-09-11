
package kategorinilai;

import java.util.Scanner;

public class KategoriNilai1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama");
        String nama = input.nextLine();
        System.out.println("Masukkan nilai ");
        double nilai = input.nextDouble();

        if (nilai >= 96 && nilai <= 100) {
            System.out.println("Nilai Anda A");
            System.out.println("Kriteria Sangat Baik");
        } else if (nilai >= 91 && nilai <= 95) {
            System.out.println("Nilai Anda A-");
            System.out.println("Kriteria Sangat Baik");
        } else if (nilai >= 86 && nilai < 90) {
            System.out.println("Nilai Anda B+");
            System.out.println("Kriteria Baik");
        } else if (nilai >= 81 && nilai <= 85) {
            System.out.println("Nilai Anda B");
            System.out.println("Kriteria Baik");
        } else if (nilai >= 75 && nilai <= 80) {
            System.out.println("Nilai Anda B");
            System.out.println("Kriteria Baik");
        } else if (nilai >= 70 && nilai <= 74) {
            System.out.println("Nilai Anda C");
            System.out.println("Kriteria Cukup");
        } else if (nilai >= 65 && nilai <= 69) {
            System.out.println("Nilai Anda C");
            System.out.println(" Kriteria Cukup");
        } else if (nilai >= 60 && nilai <= 64) {
            System.out.println("Nilai Anda C-");
            System.out.println("Kriteria Cukup");
        } else if (nilai >= 55 && nilai <= 59) {
            System.out.println("Nilai Anda D+");
            System.out.println("Kriteria Kurang");
        } else if (nilai >= 0 && nilai >= 54) {
            System.out.println("Nilai Anda D");
            System.out.println(" Kriteria Kurang");

        }

    }
}

