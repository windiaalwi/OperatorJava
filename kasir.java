
import java.util.Scanner;


public class kasir {
    public static void main(String[] args) {
          System.out.println("Menu Makanan");
            System.out.println("1.Soto Ayam");
            System.out.println("2. Rawon Daging");
            System.out.println("3. Mie Goreng");     
            System.out.println("4. Tahu Telor");
            System.out.println("Sate Kambing");
            
            int Soto= 15000;
            int Rawon= 17000;
            int Mie= 5000;
            int Tahu= 8000;
            int Sate= 20000;
            
           int total,bayar,kembali;
           Scanner input= new Scanner (System.in);
            System.out.println("Jumlah beli Soto: ");
            int jumlahBeliSoto= input.nextInt();
            total=jumlahBeliSoto*Soto;
            
             System.out.println("Jumlah beli Rawon: ");
            int jumlahBeliRawon= input.nextInt();
            total+=jumlahBeliRawon*Rawon;
            
            System.out.println("Total:"+total);
            System.out.println("Pembayaran:");
            bayar=input.nextInt();
            kembali=bayar-total;
            System.out.println("Kembalian"+kembali);
            
             System.out.println("Jumlah beli Mie: ");
            int jumlahBeliMie= input.nextInt();
            total+=jumlahBeliMie*Mie;
            
            System.out.println("Total:"+total);
            System.out.println("Pembayaran:");
            bayar=input.nextInt();
            kembali=bayar-total;
            System.out.println("Kembalian"+kembali);
            
             System.out.println("Jumlah beli Tahu: ");
            int jumlahBeliTahu= input.nextInt();
            total+=jumlahBeliTahu*Tahu;
            
            System.out.println("Total:"+total);
            System.out.println("Pembayaran:");
            bayar=input.nextInt();
            kembali=bayar-total;
            System.out.println("Kembalian"+kembali);
            
             System.out.println("Jumlah beli Sate: ");
            int jumlahBeliSate= input.nextInt();
            total+=jumlahBeliSate*Sate;
            
            System.out.println("Total:"+total);
            System.out.println("Pembayaran:");
            bayar=input.nextInt();
            kembali=bayar-total;
            System.out.println("Kembalian"+kembali);
                    
            
            
            
            
            
    }
    
}
