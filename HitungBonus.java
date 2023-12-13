
package latihanpercabangan;
import java.util.Scanner;
public class HitungBonus {
    public static void main(String[] args) {
        int namaKaryawan, gajiKaryawan, masaKerja, bonus;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama karyawan: ");
        String nama = input.nextLine();
        System.out.println("Berapa masa kerja: ");
        masaKerja = input.nextInt();

        if (masaKerja > 3) {
            bonus = 300000;
        } else {
            bonus = 150000;

        }

        gajiKaryawan = 3000000 + bonus;
        System.out.println("Gaji yang diterima Rp" + gajiKaryawan);

    }

}
