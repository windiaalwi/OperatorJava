
package latihanpercabangan;

import java.util.Scanner;

public class tagihanListrik {

    public static void main(String[] args) {
        int biayaPemakaian, biayaTotal, biayaAwal;

        Scanner input = new Scanner(System.in);
        System.out.println("Berapa pemakain listrik: ");
        biayaPemakaian = input.nextInt();

        if (biayaPemakaian <= 50) {
            biayaAwal = biayaPemakaian * 100;
            biayaTotal = biayaAwal + ((biayaAwal * 20) / 100);
            System.out.println("BIAYA TARIF:" + biayaTotal);

        } else if (biayaPemakaian <= 150) {
            biayaAwal = biayaPemakaian * 150;
            biayaTotal = biayaAwal + ((biayaAwal * 20) / 100);
            System.out.println("Biaya tarif" + biayaTotal);

        } else if (biayaPemakaian <= 250) {
            biayaAwal = biayaPemakaian * 250;
            biayaTotal = biayaAwal + ((biayaAwal * 20) / 100);
            System.out.println("Biaya tarif" + biayaTotal);

        } else if (biayaPemakaian > 250) {
            biayaAwal = biayaPemakaian * 300;
            biayaTotal = biayaAwal + ((biayaAwal * 20) / 100);
            System.out.println("Biaya tarif" + biayaTotal);

        }
    }

}
