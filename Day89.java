package coding100day;
import java.util.Scanner;
public class Day_89 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Berapa banyak teman kamu? ");
        int jumlahTeman = sc.nextInt();
        sc.nextLine(); 

        String[] fren = new String[jumlahTeman + 1]; 

        for (int i = 1; i <= jumlahTeman; i++) {
            System.out.print("Masukkan nama teman ke-" + i + ": ");
            fren[i] = sc.nextLine();
        }

        System.out.println("Daftar teman Anda:");
        for (int i = 1; i <= jumlahTeman; i++) { 
            System.out.println(i + ". " + fren[i]);
        }
        
        System.out.print("Masukkan nomor teman yang ingin diubah: ");
        int nomor = sc.nextInt();
        sc.nextLine();

        if (nomor >= 1 && nomor <= jumlahTeman) {
            System.out.print("Masukkan nama baru untuk nomor " + nomor + ": ");
            fren[nomor] = sc.nextLine();
        }

        System.out.println("Daftar teman setelah diperbarui:");
        for (int i = 1; i <= jumlahTeman; i++) { 
            System.out.println(i + ". " + fren[i]);
        }
    }
}
