package coding100day;

import java.util.Scanner;

public class Day_34 {
    
    public static void main(String[] args) {
        
        Scanner panggil = new Scanner(System.in);
        
        System.out.println("silahkan isi nama anda = ");
        String nama = panggil.nextLine();
        
        System.out.println("umur nya juga = ");
        int umur = panggil.nextInt();
        
        System.out.println("masukkan berat badan anda = ");
        double beratBadan = panggil.nextDouble();
        
        System.out.println("tinggi badan anda juga = ");
        float tinggiBadan = panggil.nextFloat();
        
        System.out.println("jenis kelamin anda = ");
        char jenisKelamin = panggil.next().charAt(0);
        
        System.out.println("nama " +nama + " umur " +umur + " berat badan " + beratBadan + " tinggi badan " + tinggiBadan + " jenis kelamin " +jenisKelamin);
        
    }
    
}
