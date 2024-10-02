package coding100day;

public class Day_31 {
    
    public static void main(String[] args) {
        
        String ayamInt = "123";
        String sapiDouble = "123.45";
        String gorillaBoolean = "true";
        
        int intNilai = Integer.parseInt(ayamInt);
        System.out.println("String ke int nilai "+ intNilai);
        
        double doubleNilai = Double.parseDouble(sapiDouble);
        System.out.println("String ke double nilai"+ doubleNilai);
        
        boolean booleanHasil = Boolean.parseBoolean(gorillaBoolean);
        System.out.println("String ke Boolean nilai" + booleanHasil);
       
        
    }
    
}
