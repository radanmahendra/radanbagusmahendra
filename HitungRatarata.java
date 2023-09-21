
package pkg5.hitungratarata;
import java.util.Scanner;
/**
 *
 * Radan Bagus Mahendra
 * C2183207051
 * PTI B
 */
public class HitungRatarata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            boolean selesai = false;
            
            while (!selesai) {
                int total = 0;
                int jumlahAngka = 0;
                
                System.out.println("Masukkan serangkaian angka (Ketik 'selesai' untuk menghitung):");
                
                while (input.hasNext()) {
                    if (input.hasNextInt()) {
                        int angka = input.nextInt();
                        total += angka;
                        jumlahAngka++;
                    } else {
                        String kata = input.next();
                        if (kata.equalsIgnoreCase("selesai")) {
                            break;
                        } else {
                            System.out.println("Input tidak valid. Masukkan angka atau 'selesai'.");
                        }
                    }
                }
                
                if (jumlahAngka > 0) {
                    double rataRata = (double) total / jumlahAngka;
                    System.out.println("Nilai rata-rata adalah: " + rataRata);
                } else {
                    System.out.println("Tidak ada angka yang dimasukkan.");
                }
                
                System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
                String jawaban = input.next();
                
                if (!jawaban.equalsIgnoreCase("ya")) {
                    selesai = true;
                }
            }
            
            System.out.println("Terima kasih telah menggunakan program ini.");
        }
    }
    
}