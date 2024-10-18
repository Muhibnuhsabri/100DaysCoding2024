package coding100day;
import java.util.Scanner;
public class Day_47 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
                
        System.out.println("berapa jumlah laptop saya ");
        int laptop = sc.nextInt();
        
        if (laptop > 0) {
            System.out.println("laptop saya ada "+laptop);
        }
        
    }
    
}
