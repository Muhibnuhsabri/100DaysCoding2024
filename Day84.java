package coding100day;

import java.util.Scanner;

public class Day_84 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        // soal 4
        System.out.print("Masukkan sebuah kalimat ");
        String a = sc.nextLine();
        String hurufA = a.toUpperCase();
        System.out.println(hurufA);
        
        // soal 5
        System.out.print("Masukkan sebuah kalimat ");
        String b = sc.nextLine();
        String hurufB = b.toLowerCase();
        System.out.println(hurufB);
    }
    
}
