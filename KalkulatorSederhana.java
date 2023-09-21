
package pkg3.kalkulatorsederhana;
import java.util.Scanner;


/**
 *
 * Radan Bagus Mahendra
 * C2183207051
 * PTI B
 */
public class KalkulatorSederhana {
public static void main(String[] args) {
      
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        
        
        int hasilPenjumlahan = angka1 + angka2;
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);

        int hasilPengurangan = angka1 - angka2;
        System.out.println("Hasil pengurangan: " + hasilPengurangan);
        
        
        int hasilPerkalian = angka1 * angka2;
        System.out.println("Hasil perkalian: " + hasilPerkalian);
        
        
        double hasilPembagian = (double) angka1 / angka2;
        System.out.println("Hasil pembagian: " + hasilPembagian);
    }
    }
    
}