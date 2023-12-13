
package piramida;

import java.util.Scanner;

public class Piramida {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int i,j, angka;
        System.out.println("masukkan angka");
        angka = input.nextInt();
        
        for (i=1; i<=angka; i++){
            for(j=1; j<=i; j++){
            System.out.print(j);
    }
    
        System.out.println();
    }

    }
}

