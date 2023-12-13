 package perulanganforwhilee;

import java.util.Scanner;

public class HitungNilai {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah nilai");

        int jumlah = input.nextInt();
        int jumlahNilai = 0;
        int rataRata = 0;
        for (int i = 1; i <= jumlahNilai; i++) {

            System.out.print("nilai " + i + " : ");
            int nilai = input.nextInt();
            jumlahNilai += nilai;

        }

        System.out.println("Hasil Nilai: " + jumlahNilai);
        System.out.println("Rata-Rata: " + jumlahNilai / jumlah);

//        int angka= 1;
//        while (angka<=100){
//            System.out.println(angka);     
//            angka++;
    }
    } 
}
