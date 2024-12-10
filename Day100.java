package coding100day;

import java.time.LocalTime;

public class Day_100 {

    public static void main(String[] args) {
        String nama = "Ibnu";
        LocalTime waktuSekarang = LocalTime.now();

        System.out.println("==================================");
        if (waktuSekarang.isBefore(LocalTime.NOON)) {
            System.out.println("Selamat Pagi, " + nama);
        } else if (waktuSekarang.isBefore(LocalTime.of(17, 0))) {
            System.out.println("Selamat siang, " + nama);
        } else {
            System.out.println("Selamat malam, " + nama);
        }
        System.out.println("Program Anda Telah Selesai");
        System.out.println("==================================");

    }
}
