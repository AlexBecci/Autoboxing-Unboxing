
package test;

public class TestAutoboxingUnboxing {
    
    public static void main(String[] args) {
        //Clases Envolventes de tipos primitivos
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        */
        
        Integer entero = 10;//Autoboxing ya que estamos envolviendo el tipo primitivo en un tipo Object
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.doubleValue());
        
        int entero2 = entero;//Unboxing extraemos el tipo Object a un tipo primitivo
        System.out.println("entero2 = " + entero2);
    }
 
}
