
package luas.segitiga;
import java.util.Scanner;


public class LuasSegitiga {

    /**
     * Radan Bagus Mahendra  
     * C2183207051
     * PTI B
     * @param args
     */
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            double alas, tinggi;
            System.out.print("Masukkan panjang alas segitiga: ");
            alas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            tinggi = input.nextDouble();
            double luas = 0.5 * alas * tinggi;
            System.out.println("Luas segitiga adalah: " + luas);
        }

    }
    
}