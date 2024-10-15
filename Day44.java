package coding100day;
import java.util.Scanner;
public class Day_44 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("masukkan angka ");
        int angka = sc.nextInt();
        System.out.println("masukkan nilai ");
        int nilai = sc.nextInt();
        System.out.println("hasil diatas hasilnya "+(angka>=nilai));
        System.out.println("masukkan ekor elang ");
        int elang = sc.nextInt();
        System.out.println("masukkan ekor ayam ");
        int ayam = sc.nextInt();
        System.out.println("hasil di atas adalah "+(elang<=ayam));
        
        System.out.println("kalau di gabungkan kedua hasil di atas hasilnya adalah "+(angka>=nilai&&elang<=ayam));
      
    }
    
}
