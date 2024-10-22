package coding100day;
import java.util.Scanner;
public class Day_51 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("yang tidak jawab akan di hukum ");
        System.out.println("siapa mau angkat tangan");
        
        String nama = sc.nextLine();
        
        switch (nama) {
            case "upin":
                System.out.println("saya pak ");
                break;
            case "ipin":
                System.out.println("saya pak ");
                break;
            default:
                System.out.println("silahkan keluar bagi yang nda jawab");
                break;
            
        }
        
    }
    
}
