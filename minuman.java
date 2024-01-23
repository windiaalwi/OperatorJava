
package polymorphism;
import java.util.Scanner;

public abstract class minuman {
    public void jenisMinuman(String jenis){
        int harga = 0;
        if (jenis.equals("coffe")){
            System.out.println("coffe latte \n Mocacino");
            switch (jenis){
                case "coffe": harga= 15000;
                break;
                case "tea": harga = 7500;
                break;
                default: harga= 0;
                break;
            }
            
        }
       
    }
    
}
