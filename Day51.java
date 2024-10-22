package coding100day;
import java.util.Scanner;
public class Day_51 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("baju anda biasa warna apa");
        String baju = sc.nextLine();
        
        switch (baju) {
            case "hitam":
                System.out.println("baju yang saya pakai kalau kuliah warna hitam ");
                break;
            case "abu abu":
                System.out.println("baju yang saya pakai kalau kuliah warna abu abu ");
                break;
            case "merah":
                System.out.println("baju yang saya pakai kalau kuliah warna merah ");
                break;
            case "biru tua":
                System.out.println("baju yang saya pakai kalau kuliah warna biru tua ");
                break;
        }
        
    }
    
}
