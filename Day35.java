package coding100day;

import java.util.Scanner;

public class Day_35 {
    
    public static void main(String[] args) {
        
        Scanner baju = new Scanner (System.in);
        
        System.out.println("upin memiliki nilai = ");
        int hasilUpin = baju.nextInt();
        
        System.out.println("ipin memiliki nilai = ");
        int hasilIpin = baju.nextInt();
        
        //penjumlahan
        
        int kertasUpin = hasilUpin+hasilIpin ;
        
        //pengurangan
        
        int kertasIpin = hasilUpin-hasilIpin ;
        
        System.out.println("hasil gabungan dari nilai upin dan ipin = " +(kertasUpin+kertasIpin));
        
    }
    
}
