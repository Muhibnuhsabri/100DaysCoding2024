package coding100day;

import java.util.Scanner;

public class Day_94 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan angka ");
        int a = sc.nextInt();
        
        for (int i = 1; i <= a; i++) {
            
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
