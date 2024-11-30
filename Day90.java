package coding100day;

import java.util.Scanner;

public class Day_90 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("daftar merek hp");
        System.out.println("1. Redmi  : 3,000,000");
        System.out.println("2. Realme : 2,500,000");
        System.out.println("3. Oppo   : 3,500,000");
        System.out.print("Pilih HP yang ingin dibeli ");
        
        int pilih = sc.nextInt();
        sc.nextLine();
        int hargaAwal = 0;

        if (pilih == 1) {
            hargaAwal = 3000000;
        } else if (pilih == 2) {
            hargaAwal = 2500000;
        } else if (pilih == 3) {
            hargaAwal = 3500000;
        } else {
            System.out.println("tidak ada dalam pilihan.");
            return;
        }
        
        System.out.printf("Harga awal: Rp %,d\n", hargaAwal);
        System.out.println("kode diskon nya adalah mr bis");
        
        System.out.print("Apakah Anda memiliki kode diskon? (ya/tidak): ");
        String jawab = sc.nextLine();

        if (jawab.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan kode diskon: ");
            String kode = sc.nextLine();
            if (kode.equalsIgnoreCase("mr bis")) {
                int diskon = hargaAwal * 5 / 100;
                System.out.printf("Diskon: Rp %,d\n", diskon);
                System.out.printf("Harga setelah diskon: Rp %,d\n", hargaAwal - diskon);
            } else {
                System.out.println("Kode diskon tidak valid.");
                 System.out.printf("Harga yang harus Anda bayar: Rp %,d\n", hargaAwal);
            }
        } else {
            System.out.printf("Harga yang harus Anda bayar: Rp %,d\n", hargaAwal);
        }
    }
}
