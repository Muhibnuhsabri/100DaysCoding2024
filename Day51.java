package coding100day;
import java.util.Scanner;
public class Day_51 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("silahkan dengar nama kalian di absen");
        String absen = sc.nextLine();
        
        switch (absen) {
            case "upin":
                System.out.println("hadir pak ");
                break;
            case "ipin":
                System.out.println("hadir pak ");
                break;
            default:
                System.out.println(absen+" tidak hadir pak ");
                break;
            
        }
        
    }
    
}
