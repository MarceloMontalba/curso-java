import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertidorNumerico {
    public static void main(String[] args) {
        /*
         * EJERCICIO 2: Convertidor de Sistemas Numéricos
         * 
         * Crea un programa que reciba un número entero en decimal (usa Scanner con nextInt())
         * y muestre su representación en binario, octal y hexadecimal.
         * 
         * Requisitos:
         * - Utiliza Scanner para capturar el número decimal
         * - Usa Integer.toBinaryString() para convertir a binario
         * - Usa Integer.toOctalString() para convertir a octal
         * - Usa Integer.toHexString() para convertir a hexadecimal
         * - Muestra todos los resultados en un solo String con saltos de línea (\n)
         * 
         * Ejemplo de salida esperada:
         * Número decimal: 100
         * Binario: 1100100
         * Octal: 144
         * Hexadecimal: 64
         */

        int enteroIngresado = 0;
        System.out.println("\n===================================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar un numero entero para realizar la conversión: ");

        try{
            enteroIngresado = scanner.nextInt();
        } catch(InputMismatchException e){
            main(args);
            System.exit(0);
        }

        String numeroBinario = Integer.toBinaryString(enteroIngresado);
        String numeroOctal   = Integer.toOctalString(enteroIngresado);
        String numeroHexa    = Integer.toHexString(enteroIngresado);
        
        System.out.println("===================================================================");
        String respuestaPantalla = "";

        respuestaPantalla += "Decimal     : "+enteroIngresado+'\n';
        respuestaPantalla += "Binario     : "+numeroBinario+'\n';
        respuestaPantalla += "Octal       : "+numeroOctal+'\n';
        respuestaPantalla += "Hexadecimal : "+numeroHexa;

        System.out.println(respuestaPantalla);
        System.out.println("===================================================================");
    }
}