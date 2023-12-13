
package reviewperulangan;
import java.util.Scanner;
public class season2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int total = 0;
        System.out.println("masukkan batas atas: ");
        int atas = input.nextInt();;
        System.out.println("masukkan batas bawah: ");
        int bawah = input.nextInt(); 
        int i = atas;
        
        do{
         if (i%2==0){
             System.out.print(i + ",");
             total+=i;
         }
   i++;
        }
        while (i<bawah);
        
        System.out.print("total: " +total);
    }
}

