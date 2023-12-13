
package com.mycompany.kalkultorsuhu;

import java.util.Scanner;

public class KalkultorSuhu {

    public static void main(String[] args) {
        double C,F,R,K;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam celcius");
        C = input.nextDouble();
         F = (9.0/ 5.0 * C)+ 32.0;
         R = (4.0 / 5.0* C);
         K = C + 273.0;
         
         System.out.println("R = " + R);
         System.out.println("F = " + F);
         System.out.println("K =" + K); 
         
         
               
     
    }
}
