package coding100day;
import java.util.Scanner;
public class Day_36 {
    
    public static void main(String[] args) {
        
        Scanner tulang = new Scanner(System.in);
        
        System.out.println("tulang manusia ada berapa = ");
        int hasilTulang = tulang.nextInt();
        
        System.out.println("tubuh manusia ada berapa = ");
        int hasilTubuh = tulang.nextInt();
        
        //perkalian
        
        System.out.println("jika saya gabungkan kedua nilai tersebut = " +(hasilTulang*hasilTubuh));
        
        //pembagian
        
        System.out.println("jika saya bagi kedua nilai tersebut = " +(hasilTulang/hasilTubuh));
        
        //sisa bagi
        
        System.out.println("sisa kedua nilai tersebut adalah = " +(hasilTulang%hasilTubuh));
        
        
        
    }
    
}
