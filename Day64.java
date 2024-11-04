package coding100day;

public class Day_64 {
    
    public static void main(String[] args) {
        
        System.out.println("angka i dan j");
        a: 
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
                
                if (j == 2) {
                    break a;
                }
            }
    }
             
}
    
}
