package coding100day;

public class Day_31 {
    
    public static void main(String[] args) {
        
        String ayamInt = "123";
        String sapiDouble = "123.45";
        String gorillaBoolean = "true";
        
        int intVal = Integer.parseInt(ayamInt);
        System.out.println("String ke int adalah "+ intVal);
        
        double doubleVal = Double.parseDouble(sapiDouble);
        System.out.println("String ke double "+ doubleVal);
        
        boolean booleanVal = Boolean.parseBoolean(gorillaBoolean);
        System.out.println("String ke Boolean " + booleanVal);
       
        
    }
    
}
