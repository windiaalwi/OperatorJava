
package javaarray;

import java.util.Scanner;
public class JavaArray3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("===DATA SISWA===");
        System.out.println("masukkan jumlah data: ");
        int jumlah = input.nextInt();
        input.nextLine();
        String[] namaSiswa = new String[jumlah];
        
        for (int i = 0; i < jumlah; i++){ 
            
            System.out.println("Nama ke-" + (i+1) + ":");
            namaSiswa[i] = input.nextLine();
            
        }
         System.out.println("DAFTAR SISWA");
         for (int i = 0; i< jumlah; i++){
             System.out.print(namaSiswa[i] +"," );
             
         }
                System.out.println();
}
    
                 
            
}
