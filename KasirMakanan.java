 

package com.mycompany.kasirmakanan;

import java.util.Scanner;


public class KasirMakanan {

    public static void main(String[] args) {
        System.out.println("Menu Makanan");
        System.out.println ("1. Soto Ayam (15000)");
        
        int soto= 15000;
        int jumlahBeli,total,bayar,kembali;
        Scanner input= new Scanner (System.in);
        System.out.println("Jumlah beli: ");
        jumlahBeli= input.nextInt();
        total=jumlahBeli*soto;
        System.out.println("Total Pembelian: "+total);
        System.out.println("Masukkan Pembayaran:");
        bayar=input.nextInt();
        kembali=bayar-total;
        System.out.println("Jumlah Kembalian:"+kembali);
        
         
            System.out.println("Menu Makanan");
            System.out.println("1.Soto Ayam");
            System.out.println("2. Rawon Daging");
            System.out.println("3. Mie Goreng");     
            System.out.println("4. Tahu Telor");
            System.out.println("5. Sate Kambing");
            
            int Soto= 15000;
            int Rawon= 17000;
            int Mie= 5000;
            int Tahu= 8000;
            int Sate= 20000;
            
           
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
           
            
           
                    
    }


        
        
    } 
    
    
    
    


