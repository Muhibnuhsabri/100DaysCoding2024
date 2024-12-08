package coding100day;

import java.util.Scanner;

public class Day_98 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan x: ");
        int x = sc.nextInt();

        System.out.print("Masukkan y: ");
        int y = sc.nextInt();

        if (x > y) {
            System.out.println("Nilai x harus lebih kecil atau sama dengan nilai y.");
            return;
        }

        int total = 0;

        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }

        System.out.println("Total penjumlahan bilangan genap dari " + x + " ke " + y + " adalah: " + total);
    }
}
