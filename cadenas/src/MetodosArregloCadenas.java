public class MetodosArregloCadenas {
    public static void main(String[] args) {
        String cadenaPrueba = "caracteres";

        int largoCadena = cadenaPrueba.length();

        // De String a arreglo de caracteres mediante toCharArray()
        System.out.println("\n===toString()===");
        char[] arregloCaracteres = cadenaPrueba.toCharArray();
        for(int i=0; i<largoCadena; i++){
            System.out.println("caracter : "+arregloCaracteres[i]);
        }

        // De String a arreglo de subcadenas mediante split()
        System.out.println("\n===split()===");
        String[] arregloCadenas = cadenaPrueba.split("a");

        int largoAregloCadenas = arregloCadenas.length;
        for(int i=0; i<largoAregloCadenas; i++){
            System.out.println("subcadena: "+arregloCadenas[i]);
        }
    }
}
