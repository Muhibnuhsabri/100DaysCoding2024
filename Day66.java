package coding100day;

public class Day_66 {
    
    public static void main(String[] args) {
        System.out.println("pola persegi ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
        System.out.println("pola persegi panjang ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 15; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
