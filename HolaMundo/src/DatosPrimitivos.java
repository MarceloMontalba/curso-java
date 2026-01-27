public class DatosPrimitivos {
    public static void main(String[] args) {
        boolean bandera = true;
        char char1 = 'a';
        char char2 = '\u0046';

        // Enteros Wrapper - Limites
        Byte minLimByte = Byte.MIN_VALUE;
        Byte maxLimByte = Byte.MAX_VALUE;

        Short minLimShort = Short.MIN_VALUE;
        Short maxLimShort = Short.MAX_VALUE;

        Integer minLimInt = Integer.MIN_VALUE;
        Integer maxLimInt = Integer.MAX_VALUE;

        Long minLimLong = Long.MIN_VALUE;
        Long maxLimLong = Long.MAX_VALUE;

        // Enteros - Primitivos
        byte entero1  = 127;
        short entero2 =  32767;
        int entero3   = 2147483647;
        long entero4  = 9223372036854775807L;


        System.out.println("La bandera es igual a: "+ bandera);
        System.out.println("El char1 es igual a: "+ char1);
        System.out.println("El char2 es igual a: "+ char2);
        System.out.println("========================================================================================");
    
        System.out.println("El valor minimo de un byte es "+minLimByte+" y el valor maximo es de "+maxLimByte);
        System.out.println("El valor minimo de un short es "+minLimShort+" y el valor maximo es de "+maxLimShort);
        System.out.println("El valor minimo de un int es "+minLimInt+" y el valor maximo es de "+maxLimInt);
        System.out.println("El valor minimo de un long es "+minLimLong+" y el valor maximo es de "+maxLimLong);
        System.out.println("========================================================================================");

        System.out.println("El valor del entero1: "+entero1);
        System.out.println("El valor del entero2: "+entero2);
        System.out.println("El valor del entero3: "+entero3);
        System.out.println("El valor del entero4: "+entero4);
    }
}
