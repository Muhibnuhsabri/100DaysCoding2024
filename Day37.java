package coding100day;

import java.util.Scanner;

public class Day_37 {
    
    public static void main(String[] args) {
        
        Scanner celana = new Scanner (System.in);
        
        //pengisian nilai
        
        System.out.println("silahkan isi nilai mulyono disini = ");
        int mulyono = celana.nextInt();
        
        System.out.println("hasil mulyono adalah = " +mulyono);
        
        //pengisian dan penambahan
        
        System.out.println("masukkan nilai mulyono yang mau anda tambahkan = ");
        int gibran = celana.nextInt();
        
        mulyono += gibran;
        
        System.out.println("nilai mulyono setelah saya tambah = "+mulyono);
        
        //pengisian dan pengurangan
        
        System.out.println("nilai mas anis adalah = ");
        int masAnis = celana.nextInt();
        
        System.out.println("masukkan nilai mas anis yang mau anda kurangi = ");
        int fufufafa = celana.nextInt();
           
        masAnis -= fufufafa;
        
        System.out.println("nilai mas anis setelah saya kurangi = "+masAnis);
        
    }
    
}
