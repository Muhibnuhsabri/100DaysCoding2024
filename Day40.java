package coding100day;
import java.util.Scanner;
public class Day_40 {
    
    public static void main(String[] args) {
        
        Scanner banding = new Scanner(System.in);
        
        System.out.println("masukkan nilai untuk huruf A");
        int nilaiA = banding.nextInt();
        
        System.out.println("masukkan nilai untuk huruf B");
        int nilaiB = banding.nextInt();
        
        System.out.println("apakah rill nilai A lebih besar di bandingkan nilai B? = "+(nilaiA > nilaiB));
        System.out.println("apakah rill nilai A lebih kecil di bandingkan nilai B? = "+(nilaiA < nilaiB));
        
    }
    
}
