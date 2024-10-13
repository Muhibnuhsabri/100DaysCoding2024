package coding100day;
import java.util.Scanner;
public class Day_42 {
    
    public static void main(String[] args) {
        
        Scanner cabai = new Scanner(System.in);
        
        System.out.println("harga awal cabai adalah ");
        int hargaAwal = cabai.nextInt();
        
        System.out.println("harga cabai sekarang adalah ");
        int hargaSekarang = cabai.nextInt();
        
        System.out.println("apakah cabai harga nya tetap? = "+(hargaAwal == hargaSekarang));
        System.out.println("apakah cabai harga nya sudah berbeda? = "+(hargaAwal != hargaSekarang));
        
    }
    
}
