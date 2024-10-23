package coding100day;
import java.util.Scanner;
public class Day_52 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
      
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka " + angka + " adalah " + hasil);
        
    }
    
}
