
package homeworkproduktif;

import java.util.Scanner;

public class HomeWorkProduktif {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int harga,jumlah,total=0;
        String barang = null;
        char yn;
        
        do {
            System.out.println(" 1. sabun cuci\n 2. minyak goreng\n 3. telur\n 4. beras\n 5. gula");
            
            System.out.println("masukkan barang yang ingin dipilih");
            
            switch (barang) { 
                case "1" :
                    harga = 15000;
                    total = total+harga;
                    break;
                    
                case "2" :
                    harga = 40000;
                    total = total+harga;
                    break;
                    
                case "3" :
                    harga = 25000;
                    total = total+harga;
                    break;
                    
                case "4" :
                    harga = 13500;
                    total = total+harga;
                    break;
                    
                case "5" :
                    harga = 12500;
                    total = total+harga;
                    break;
                default :
                    System.out.println("barang tidak ada");
                    continue;
                            
                            
            }
            
            
            System.out.println("mau lanjut: (Y/N)");
            yn = input.nextLine().charAt(0);
            if (yn == 'Y') {
                
            } else if (yn == 'N'){
                break;
            
            }else{
                System.out.println("NICE TRY");
                return;
            }
        } while (true);
        
        System.out.println("harga total: " + total);

    }

}
