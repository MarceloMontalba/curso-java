public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt: "+numeroInt);

        String realStr = "98231.23e-2"; // Notación de cientifica/punto flotante
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble: "+realDouble);

        String logicoStr = "true";
        // String logicoStr = "1";   // Java no lo transforma a boolean. Así que se setea en falso
        // String logicoStr = "TruE";   // Java lo procesará como boolean verdadera, ya que el pase no hara caso al CASE.
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean: "+logicoBoolean);

        var numeroStrVar = "31";

        var numeroIntVar = Integer.parseInt(numeroStrVar);
        System.out.println("numeroIntVar: "+numeroIntVar);

        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt: "+ otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr: "+ otroNumeroStr);

        // Otra forma de convertir a string
        int otroNumeroInt2 = 140;

        System.out.println("otroNumeroInt2: "+ otroNumeroInt2);

        String otroNumeroStr2 = String.valueOf(otroNumeroInt2);
        System.out.println("otroNumeroStr2: "+ otroNumeroStr2);
        
        double otroRealDouble = 123123.23e-4;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(3213123.34F);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 32768;
        short s = (short)i; // SE FUERZA LA CONVERSION, A PESAR DE QUE SE PUEDA PERDER INFORMACIÓN, SI ESQUE EL NUMERO CONTENIDO SUPERA EL LIMITE DEL SHORT
                            // SI SUPERA EL TAMAÑO MAXIMO DEL SHORT NO SERÁ CAPAZ DE SOPORTAR LA CONVERSIÓN
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);

        // boolean b = (boolear) i;    // Convertir de int a boolean no es posible, ya que son incompatibles
        char b = (char) i;
        System.out.println("i = " + b); // En el caso de char traduce el decimal en su respectivo simbolo unicode
    }
}
