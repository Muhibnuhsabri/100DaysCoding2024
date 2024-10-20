package coding100day;
import java.util.Scanner;
public class Day_49 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("masukkan nilai ");
        int nilai = sc.nextInt();
        
        if (nilai > 0) {
            System.out.println("bilangan positif ");
        } else if (nilai < 0) {
            System.out.println("bilangan negatif");
        }
    }
    
}
