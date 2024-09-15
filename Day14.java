package latihan;

public class Latihan {

    public static void main(String[] args) {
//        type data long memiliki kapasitas yag paling besar yaitu 64bit(8byte)
//        di antara type data yang lain dengan rentan -9,223,372,036,854,775,808 hingga 
//        9,223,372,036,854,775,807.
        
        long NilaiMinimal = -9_223_372_036_854_77_808L;
        long NilaiMaksimal = 9_223_372_036_854_775_807L;
        
        System.out.println("nilai minimal long adalah: " + NilaiMinimal);
        System.out.println("nilai maksimal long adalah: " + NilaiMaksimal);
                
    }

}
