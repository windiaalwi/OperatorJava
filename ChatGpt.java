
package chatgpt;
import java.util.Scanner;
public class ChatGpt {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("masukkan bilangan, TERSERAHHHH");
        int bilangan = input.nextInt();
        
        if ( bilangan % 2 == 0){
            System.out.println("Bilangan genap");
            
     } else {
            System.out.println("Bilangan ganjil");
        }
    
    
}
}