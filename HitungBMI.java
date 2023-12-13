  package hitungbmi;

import java.util.Scanner;

public class HitungBMI {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.println("Masukkan Tinggi Badan (m) " +nama);
        double tinggi = input.nextDouble();
        System.out.println("Masukkan Berat Badan (kg): ");
        double berat = input.nextDouble();
        
         double BMI = berat / (tinggi*tinggi);
         
         System.out.println("Nama" +nama);
         if(BMI < 18.5){
             System.out.println("Berat Badan Kurang");
         }else if (BMI >18.5 && BMI < 24.9){
             System.out.println("Berat Badan Normal");
         }else if (BMI > 25 && BMI < 29.9){
                     System.out.println("Berat Badan Berlebih");
                  
                     }else{
    }   System.out.println("Berat Badan Obesitas");
                             
             }
         }
        
        
    
    
