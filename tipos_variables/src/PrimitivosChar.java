public class PrimitivosChar {
    public static void main(String[] args) {
        char simbolo  = '@';
        char caracter = '\u0040';
        char entero   = 64;
        var charEnVar1 = '\u0040';
        var charEnVar2 = 64;

        System.out.println("\n========================================================================================");
        System.out.println("El simbolo es igual a: "+ simbolo);
        System.out.println("El caracter es igual a: "+ caracter);
        System.out.println("El entero es igual a: "+ entero);
        System.out.println("El simbolo=caracter es: "+ (simbolo==caracter));
        System.out.println("El simbolo=entero es: "+ (simbolo==entero));

        System.out.println("\n========================================================================================");
        System.out.println("El caracter unicode en una variable var1 es igual a: "+ charEnVar1);
        System.out.println("El caracter unicode en una variable var2 es igual a: "+ charEnVar2);

        System.out.println("\n========================================================================================");
        System.out.println("El tamaño en bytes del char es igual a: "+Character.BYTES);
        System.out.println("El tamaño en bites del char es igual a: "+Character.SIZE);
        System.out.println("El contenido maximo de un char es igual a: "+ Character.MAX_VALUE);
        System.out.println("El contenido minimo de un char es igual a: "+ Character.MIN_VALUE);

        char espacio = '\u0020';
        char retroceso = '\b'; // BORRAR
        char tabulador = '\t';
        char nuevaLinea = '\n';    
        char retornoCarro = '\r';

        System.out.println("\n========================================================================================");
        System.out.println("El tamaño en bytes del char es igual a:"+espacio+Character.BYTES);
        System.out.println("El tamaño en bites del char es igual a:"+retroceso+Character.SIZE);
        System.out.println("El contenido maximo de un char es igual a"+tabulador+Character.MAX_VALUE);
        System.out.println("El tamaño en bytes del char es igual a:"+nuevaLinea+Character.BYTES);
        System.out.println("El tamaño en bites del char es igual a:"+retornoCarro+Character.SIZE);

        // En caso de no saber cual es el caracter unicode para el sistema operativo actual se utiliza el metodo getProperty de la clase System
        System.out.println("El tamaño en bytes del char es igual a:"+System.getProperty("line.separator")+Character.BYTES);
        System.out.println("El tamaño en bytes del char es igual a:"+System.lineSeparator()+Character.BYTES);
    }
}
