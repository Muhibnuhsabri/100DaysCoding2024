package coding100day;
import java.util.Scanner;
public class Day_45 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("masukkan nilai ");
        int nilai = sc.nextInt();
        System.out.println("masukkan angka ");
        int angka = sc.nextInt();
        System.out.println("hasil diatas hasilnya "+(nilai>=angka));
        
        System.out.println("masukkan ekor singa ");
        int singa = sc.nextInt();
        System.out.println("masukkan ekor harimau ");
        int harimau = sc.nextInt();
        System.out.println("hasil di atas adalah "+(singa<=harimau));
        
        System.out.println("kalau di gabungkan kedua hasil di atas hasilnya adalah "+(nilai>=angka||singa<=harimau));
        
    }
    
}
