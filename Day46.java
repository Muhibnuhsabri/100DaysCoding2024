package coding100day;
import java.util.Scanner;
public class Day_46 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("masukkan angka 1 ");
        int angka1 = sc.nextInt();
        System.out.println("masukkan angka 2");
        int angka2 = sc.nextInt();
        System.out.println("hasil diatas hasilnya "+!(angka1>=angka2));
        
        System.out.println("masukkan ekor kucing ");
        int kucing = sc.nextInt();
        System.out.println("masukkan ekor kodok ");
        int kodok = sc.nextInt();
        System.out.println("hasil di atas adalah "+(kucing<=kodok));
        
        System.out.println("kalau di gabungkan kedua hasil di atas hasilnya adalah "+(angka1>=angka2||kucing<=kodok));
        
    }
    
}
