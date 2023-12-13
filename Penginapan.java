
package latihanpercabangan;

import java.util.Scanner;

public class Penginapan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama, jenis;
        int malam, harga;

        System.out.println("====eoseo oseyo=====");
        System.out.println("Masukkan nama");
        nama = input.nextLine();
        System.out.println("Masukkan kamar");
        jenis = input.nextLine();
        System.out.println("Masukan jumlah permalam");
        malam = input.nextInt();

        switch (jenis) {
            case "Levana":
                harga = 450000 * malam;
                System.out.println("total bayar" + "Rp" + harga);
                break;
            case "Merapi":
                harga = 750000 * malam;
                System.out.println("total bayar" + "Rp" + harga);
                break;

            case "Sativa":
                harga = 900000 * malam;
                System.out.println("total bayar" + "Rp" + harga);
            break;
            
            default:
                System.out.println("Salah input kamar");
                
                
                System.out.println("=====arigatou gozaimasu");

        }
    }

}
