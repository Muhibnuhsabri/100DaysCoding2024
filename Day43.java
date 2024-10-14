package coding100day;
import java.util.Scanner;
public class Day_43 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("baju saya ada = ");
        int baju = sc.nextInt();
        
        System.out.println("baju teman saya ada = ");
        int bajuTeman = sc.nextInt();
        
        System.out.println("apakah baju saya lebih banyak dari teman saya? "+ (baju>= bajuTeman));
        System.out.println("apakah baju saya lebih sedikit dari teman saya? "+ (baju<= bajuTeman));
        
    }
    
}
