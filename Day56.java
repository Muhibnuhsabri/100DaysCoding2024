package coding100day;
import java.util.Scanner;
public class Day_56 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //evaluasi besar 2
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        //soal 1
        
        if (a <= 0) {
            System.out.println("air membeku ");
        }else if (a >= 0 && a <= 100) {
            System.out.println("air mulai mencair ");
        }else{
        System.out.println("air mendidih");
        }
        
        //soal 2
        
        
        
        //soal 3
        
        if (a < 0 || b < 0) {
            System.out.println("salah satu bilangan negatif ");
        }else if (a < 0 && b < 0) {
            System.out.println("kedua bilangan negatif ");
        }else{System.out.println("kedua bilangan positif");}
        
        //soal 4
        
        for (int i = 7; i < 70; i+=7) {
            System.out.print(i+" ");
        }
        
        //soal 5
        
        switch (a) {
            case 1:
                System.out.println("senin ");
                break;
            case 2:
                System.out.println("selasa");
                break;
            case 3:
                System.out.println("rabu ");
                break;
            case 4:
                System.out.println("kamis ");
                break;
            case 5:
                System.out.println("jumat ");
                break;
            case 6:
                System.out.println("sabtu ");
                break;
            case 7:
                System.out.println("minggu ");
                break;
            default:
                System.out.println("\ninput tidak valid ");
                break;
        
        }

        //soal 6
        
        System.out.println("masukkan bilangan bulat ");
        
        String hasil = (a > 0) ? "positif " :(a < 0) ? "negatif " : "nol ";
        
        System.out.println("bilangan tersebut adalah " +hasil);

        //soal 7
        
        for (int i = 2; i <= 20; i+=2) {
            System.out.print(i +" ");
        }
        System.out.println();
        for (int i = 0; i <= 20; i+=3) {
            System.out.print(i +" ");
        }

        }
}
