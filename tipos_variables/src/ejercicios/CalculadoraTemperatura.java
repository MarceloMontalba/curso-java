import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraTemperatura {
    public static void main(String[] args) {
        /*
         * EJERCICIO 1: Convertidor de Temperaturas
         * 
         * Crea un programa que reciba una temperatura en grados Celsius (usa Scanner con nextDouble())
         * y la convierta a grados Fahrenheit usando la fórmula: F = (C * 9/5) + 32
         * 
         * Requisitos:
         * - Utiliza Scanner para la entrada de datos
         * - Declara variables de tipo double para almacenar los valores
         * - Realiza la conversión matemática
         * - Muestra el resultado con System.out.println() indicando ambas temperaturas
         * 
         * Ejemplo de salida esperada:
         * 30 grados Celsius equivalen a 86.0 grados Fahrenheit
         */

        double temperaturaIngresada = 0.0;
        System.out.println("\n=======================================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar la temperatura en grados Celsius : ");

        try {
            temperaturaIngresada = scanner.nextDouble();
        } catch(InputMismatchException e){
            main(args);
            System.exit(0);
        }

        double temperaturaFahrenheit = (temperaturaIngresada * 9/5) + 32;
        System.out.println("La temperatura de "+temperaturaIngresada+"° Celsius equivale a "+temperaturaFahrenheit+"° Fahrenheit.");
        
        scanner.close();
    }
}
