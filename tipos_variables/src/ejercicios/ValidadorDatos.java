import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidadorDatos {
    public static void main(String[] args) {
        /*
         * EJERCICIO 3: Validador de Datos de Usuario
         * 
         * Crea un programa que pida al usuario ingresar:
         * 1) Una edad (int) usando Scanner.nextInt()
         * 2) Un nombre (String) usando Scanner.nextLine()
         * 3) Un saldo bancario (double) usando Scanner.nextDouble()
         * 
         * Luego valida que:
         * - La edad sea mayor a 0 y menor a 120 (usa operadores de comparación)
         * - El saldo sea positivo (usa comparación booleana)
         * - Convierte la edad a String usando Integer.toString() o String.valueOf()
         * 
         * Muestra un mensaje final indicando si los datos son válidos o no,
         * mostrando el nombre, edad y saldo del usuario.
         * 
         * Nota: Maneja posibles excepciones con try-catch (InputMismatchException)
         * 
         * Ejemplo de salida esperada (si datos son válidos):
         * El usuario Juan de 25 años con saldo 5000.50 ha ingresado datos válidos
         */

        Scanner scanner = new Scanner(System.in);

        // Variables de entrada
        int edadIngresada = 0;
        String nombreIngresado = "";
        double saldoIngresado = 0.0;

        System.out.print("\n==================================================================================\n");

        // Validación de ingreso de la edad del usuario
        System.out.print("Ingresar edad del usuario: ");
        try{
            edadIngresada = scanner.nextInt();
            scanner.nextLine();
        }catch(InputMismatchException e){
            main(args);
            System.exit(0);
        }

        // Validación de ingreso del nombre del usuario
        System.out.print("Ingresar nombre del usuario: ");
        try{
            nombreIngresado = scanner.nextLine();
        }catch(InputMismatchException e){
            main(args);
            System.exit(0);
        }

        // Validación de ingreso del saldo del usuario
        System.out.print("Ingresar saldo del usuario: ");
        try{
            saldoIngresado= scanner.nextDouble();
            scanner.nextLine();
        }catch(InputMismatchException e){
            main(args);
            System.exit(0);
        }
       
        // Variables validación
        boolean edadDentroIntervalo = edadIngresada>0 && edadIngresada<120;
        boolean saldoPositivo = saldoIngresado>0;
        String edadString = Integer.toString(edadIngresada);

        if(edadDentroIntervalo && saldoPositivo){
            System.out.println("El usuario "+nombreIngresado+" de "+edadString+" años con saldo "+saldoIngresado+" ha ingresado datos válidos");
        }
    }
}
