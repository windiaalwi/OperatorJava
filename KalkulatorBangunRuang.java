
package kalkulatorbangunruang;

import java.util.Scanner;


public class KalkulatorBangunRuang {

   
    public static void main(String[] args) {
        double V,R,T,L;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        R = input.nextDouble();
         System.out.print("Masukkan tinggi: ");
         T = input.nextDouble();
        
         V = Math.PI * R *R * T; 
         L = 2 * Math.PI * R * (R+T);
         System.out.println("Volume = " + V + "cm3");
         System.out.println("Luas = " + L + "cm2");
        
                
        
             
    }
    
}
