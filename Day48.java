package coding100day;
import java.util.Scanner;
public class Day_48 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("apakah nilai yang anda masukkan cocok kalau nilai lebih besar dari angka? ");
        int nilai = sc.nextInt();
        int angka = sc.nextInt();
        
        if (nilai < angka) {
            System.out.println("tidak valid ");
        } else {
            System.out.println("cocok ");
        }
        
        
    }
    
}
