package coding100day;

public class Day_72 {
    
    public static void main(String[] args) {
        int angka = 3; 
        int hasil = hitungPenjumlahan(angka);
        System.out.println("3 + 2 + 1 = " + hasil);
    }

    public static int hitungPenjumlahan(int nilai) {
       
        if (nilai <= 0) {
            return 0;
        }
        
        return nilai + hitungPenjumlahan(nilai - 1);
    }
}
