
package latihanpercabangan;
import java.util.Scanner;
public class biayaKuliah {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String jalurMasuk;
        int pendapatan, SPP, DSP, jumlahBulanSPP, bayarSPP;
        
        System.out.println("pilihan jalu masuk: ");
        System.out.println("A. SNMPTN\nB. SBMPTN\nC. Mandiri: ");
        System.out.println("Masukkan pilihan anda");
        jalurMasuk = input.nextLine();
        System.out.println("Masukkan pendapatan orang tua: Rp");
        pendapatan = input.nextInt();
        System.out.println("Masukkan jumlah bulan yang ingin dibayar (SPP): ");
        jumlahBulanSPP = input.nextInt();
        
        
        switch (jalurMasuk) {
            
            case "A":
            case "a":
                if (pendapatan < 2000000)
                {
                    
                    DSP = 7000000;
                    SPP = 5000000;
                    
                } else if (pendapatan >= 2000000 && pendapatan <= 10000000)
                {
                    DSP = 17000000;
                    SPP = 1000000;
                } else {
                    
                    DSP = 35000000;
                    SPP = 1000000;
                }
                System.out.println("Biaya DSP: Rp " + DSP);
                System.out.println("Biaya SPP per bulan: Rp " + SPP);
                bayarSPP = SPP * jumlahBulanSPP;
                System.out.println("SPP yang dibayar: Rp " + bayarSPP);
                
                break;
                    
            case "B":
            case "b":
                
                if (pendapatan >=2000000 && pendapatan <= 1000000000)
                {
                    DSP = 17000000;
                    SPP = 1000000;
                } else if (pendapatan > 10000000)
                { 
                    DSP = 30000000;
                    SPP = 2000000;
                } else {
                    
                    DSP = 15000000;
                    SPP = 1000000;
                    
                    
                    
                    
                    
                   
                
                    
                }
            
            
            
        }
        
        
    }
    
}
