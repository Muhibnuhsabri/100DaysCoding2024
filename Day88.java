package coding100day;

import java.util.Scanner;

public class Day_88 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("masukkan jumlah mahasiswa :");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine();
        
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("masukkan nama mahasiswa ke "+(i+1)+":");
            namaMahasiswa[i] = sc.nextLine();
        }
        System.out.println("daftar nama yang dimasukkan:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println(namaMahasiswa[i]);
        }
        
    }
        
}
