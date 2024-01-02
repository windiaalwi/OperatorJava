
package reviewmateri;

import java.util.Scanner;

public class ReviewMateri {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama;
        int jumlah, harga;

        System.out.println("===selamat datang di lancar jaya===");
        System.out.println("Masukkan nama barang");
        nama = input.nextLine();
        System.out.println("masukkan jumlah barang");
        jumlah = input.nextInt();

        switch (nama) {
            case "es krim jagung":
                harga = 3000 * jumlah;
                System.out.println("total bayar " + "Rp" + harga);
                break;

            case "minyak bimoli":
                harga = 15000 * jumlah;
                System.out.println("total bayar " + "Rp" + harga);
                break;
            case "sosis kenzler":
                harga = 9000 * jumlah;
                System.out.println("total bayar " + "Rp" + harga);
                break;

            default:
                System.out.println("Salah input barang");

        }
        System.out.println("====TERIMA KASIH, SILAHKAN DATANG KEMBALI====");
    }

}
