package coding100day;
        
import java.util.Scanner;

public class Day_39 {
    
    public static void main(String[] args) {
        
        Scanner timnas = new Scanner(System.in);
        
        System.out.println("pendukung indo mau mendukung timnas ke stadion di cina ");
        System.out.println("jumlah pendukung timnas sebanyak = ");
        int jumlahPendukung = timnas.nextInt();
        
        System.out.println("lalu cina curang dengan cara mengurangi tempat duduk bagi pendukung timnas sebanyak = ");
        int curang = timnas.nextInt();
        
         jumlahPendukung %= curang;
        
        System.out.println("jadi, sisa timnas indo yang kekurangan tempat duduk yakni = "+jumlahPendukung);
        
    }
    
}
