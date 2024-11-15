import java.util.Scanner;

public class D0224503 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //soal 1
        for (int i = 100; i >= 71; i--) {
       
            if (i == 71) {
                break;
            }
            System.out.println(i);
        }
        

        //soal 2
        System.out.print("Masukkan angka awal: ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka akhir: ");
        int b = sc.nextInt();
        
        int kecil,besar;
        
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }

        //soal 3
        System.out.println("masukkan angka");
        int a = sc.nextInt();
        int genap = 0;
        int ganjil = 0;
        
        for (int i = 0; i <= a; i++) {
            if (i %2 == 0) {
            genap++;
        }else {ganjil++;
            }
        }
        System.out.println("genap "+genap);
        System.out.println("ganjil "+ganjil);
        
        //soal 4
        
        int angka = 0;

        while (true) {
            System.out.print("Masukkan angka: ");
            angka = sc.nextInt();
            if (angka == 9) {
                break;
            }
        }

    }
}
