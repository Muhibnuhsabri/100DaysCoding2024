package coding100day;

import java.util.Scanner;

public class Day_96 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan angka ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = a; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = a - 1; i >= 1; i--) {
            for (int j = a; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
