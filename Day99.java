package coding100day;

import java.util.Scanner;

public class Day_99 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan angka");
        double a = sc.nextDouble();

        System.out.println("masukkan operator (+, -, *, /)");
        char b = sc.next().charAt(0);

        System.out.println("masukkan angka kedua");
        int c = sc.nextInt();

        double hasil;

        switch (b) {
            case '+':
                hasil = a + c;
                System.out.println("hasil " + hasil);
                break;
            case '-':
                hasil = a - c;
                System.out.println("hasil " + hasil);
                break;
            case '*':
                hasil = a * c;
                System.out.println("hasil " + hasil);
                break;
            case '/':
                if (c != 0) {
                    hasil = a / c;
                    System.out.println("hasil " + hasil);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("tidak ada operasi begituan, gunakan sesuai operator diatas");

        }
    }

}
