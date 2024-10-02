package coding100day;

public class Day_31 {
    
    public static void main(String[] args) {
        
        String strInt = "123";
        String strDouble = "123.45";
        String strBoolean = "true";
        String strChar = "IKAN";
        
        int intVal = Integer.parseInt(strInt);
        System.out.println("String ke int "+ intVal);
        
        double doubleVal = Double.parseDouble(strDouble);
        System.out.println("String ke double "+ doubleVal);
        
        boolean booleanVal = Boolean.parseBoolean(strBoolean);
        System.out.println("String ke Boolean " + booleanVal);
        
        char charVal = strChar.charAt(0);
        System.out.println("String ke Char " + charVal);
        
    }
    
}
