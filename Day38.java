package coding100day;

import java.util.Scanner;

public class Day_38 {
    
    public static void main(String[] args) {
        
        Scanner sepatu = new Scanner (System.in);
        
        //pengisian perkalian
        
        System.out.println("daging ayam yang dimiliki orang hitam adalah = ");
        int dagingAyam = sepatu.nextInt();
        
        System.out.println("lalu saya kalikan ");
        int kali = sepatu.nextInt();
        
        dagingAyam *= kali;
        
        System.out.println("hasilnya adalah "+dagingAyam);
        
        //pengisian pembagian
        
        System.out.println("daging sapi yang dimiliki orang putih adalah = ");
        int daging = sepatu.nextInt();
        
        System.out.println("kalau saya bagi ");
        int bagi = sepatu.nextInt();
        
        daging /= bagi;
        
        System.out.println("hasilnya adalah "+daging);
        
    }
    
}
