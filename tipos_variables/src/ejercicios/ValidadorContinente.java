import java.util.Scanner;
import java.util.InputMismatchException;

public class ValidadorContinente {
    public static void main(String[] args) {
        /*
         * EJERCICIO 5: Clasificador de Edades
         * 
         * Crea un programa que reciba la edad de una persona (int) usando Scanner.nextInt()
         * y clasifique su grupo etario:
         * - Si edad < 13: "Niño"
         * - Si edad entre 13 y 17: "Adolescente"
         * - Si edad entre 18 y 64: "Adulto"
         * - Si edad >= 65: "Adulto Mayor"
         * - Si edad es negativa o mayor a 150: "Edad inválida"
         * 
         * Requisitos:
         * - Utiliza Scanner.nextInt() para capturar la edad
         * - Usa operadores de comparación (<, >, ==, >=, <=)
         * - Implementa múltiples condicionales para clasificar
         * - Maneja InputMismatchException con try-catch
         * - Convierte la edad a String usando String.valueOf()
         * - Muestra un mensaje completo con edad y clasificación
         * 
         * Ejemplo de salida esperada:
         * Ingrese su edad: 25
         * La edad 25 corresponde a: Adulto
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n==============================================");
        System.out.print("Ingrese su edad: ");

        int edadIngresada;

        try{
            edadIngresada = scanner.nextInt();
        } catch(InputMismatchException e){
            main(args);
            return;
        }

        String clasificacionEdad = "";

        if(edadIngresada<0 || edadIngresada>150){
            clasificacionEdad = "Edad inválida";
        }

        if(edadIngresada>= 0 && edadIngresada<13){
            clasificacionEdad = "Niño";
        }

        if(edadIngresada>=13 && edadIngresada<=17){
            clasificacionEdad = "Adolescente";
        }

        if(edadIngresada>=18 && edadIngresada<=64){
            clasificacionEdad = "Adulto";
        }

        if(edadIngresada>=65 && edadIngresada<=150){
            clasificacionEdad = "Adulto Mayor";
        }
        
        System.out.println("La edad "+edadIngresada+" corresponde a: "+clasificacionEdad);
    }
}
