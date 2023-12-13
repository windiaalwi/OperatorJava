
package latihanpercabangan;
import java.util.Scanner;
public class KonversiSuhu {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double celcius, hasil;
        String pilihan;
        System.out.println("Masukkan suhu celcius: ");
        celcius = input.nextDouble();
        
        input.nextLine();
        
        System.out.println("Masukkan pilihan: ");
        pilihan = input.nextLine();
        
        switch(pilihan) {
            case "R":
            case"r": 
                hasil = 0.8 * celcius;
                System.out.println("Hasil Konversi: " + hasil + "R");
                break;
             
            case "F":
            case "f":
                hasil = 1.8 * celcius + 32;
                System.out.println("Hasil Konversi: " + hasil + "F");
                break;
                
            case "K":
            case "k":
                hasil = celcius + 237;
                System.out.println("Hasil Konversi:" + hasil + "K");
                break;
            default:
                System.out.println("Pilihan salah: ");
                break;
                
                   
                
              
                
                
            
                
                
                
        }
        

    }
}
    
  
       
        
    
  
