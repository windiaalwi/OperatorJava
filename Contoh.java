
package contoh;

import java.util.Scanner;
public class Contoh {

        public static void main(String[] args) {
            
            
            Scanner input = new Scanner(System.in);
            
            double modal, biayaBahanBaku, biayaKemasan, biayaOperasional, biayaKeuntungan, persentaseKeuntungan, keuntungan,hargaJual, jumlahKue;
            
            System.out.println("biayaBahanBaku: ");
            biayaBahanBaku = input.nextDouble();
            System.out.println("biaya kemasan: ");
            biayaKemasan = input.nextDouble();
            System.out.println("biaya operasional: ");
            biayaOperasional = input.nextDouble(); 
            System.out.println("biaya keuntungan: ");
            System.out.println("Masukan Presentase Keuntungan");
            persentaseKeuntungan = input.nextDouble();
            biayaKeuntungan = input.nextDouble();
            System.out.println(" masukkan jumlah kue: ");
            jumlahKue = input.nextDouble();
            
            modal = (biayaBahanBaku+biayaKemasan+biayaOperasional);
            System.out.println("modal: " + modal);
            keuntungan = (modal*persentaseKeuntungan)/100;
            System.out.println("keuntungan: " + keuntungan);
            hargaJual = (modal+keuntungan)/jumlahKue;
            System.out.println("harga jual: "+ hargaJual);
            
            
            
           
            
       
    }
    
}
