package coding100day;

import java.util.Scanner;

public class Day_91 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        for (;;) {
            System.out.print("masukkan angka: ");
            int a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println("genap");
            }
            else {
                System.out.println("You and I, end");
                break;
            }
        }
    } 
}
