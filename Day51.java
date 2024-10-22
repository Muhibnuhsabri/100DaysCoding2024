package coding100day;
import java.util.Scanner;
public class Day_51 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("masukkan hari ini");
        String hari = sc.nextLine();
        
        switch (hari) {
            case "senin":
                System.out.println("hari ini adalah hari senin ");
                break;
            case "selasa":
                System.out.println("hari ini adalah hari selasa ");
                break;
            case "rabu":
                System.out.println("hari ini adalah hari rabu ");
                break;
            case "kamis":
                System.out.println("hari ini adalah hari kamis ");
                break;
            case "jumat":
                System.out.println("hari ini adalah hari jumat ");
                break;
            case "sabtu":
                System.out.println("hari ini adalah hari sabtu ");
                break;
            case "minggu":
                System.out.println("hari ini adalah hari libur ");
                break;
        }
        
    }
    
}
