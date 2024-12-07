package coding100day;

import java.util.Scanner;

public class Day_97 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka n: ");
        int n = sc.nextInt();

        System.out.println("Bilangan prima dari 1 hingga " + n + " adalah:");
        for (int i = 2; i <= n; i++) {
            boolean apakah = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    apakah = false;
                    break;
                }
            }
            if (apakah) {
                System.out.print(i + " ");
            }
        }
    }
    
}
