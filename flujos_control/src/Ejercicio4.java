/*
    Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, 
    usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar 
    el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:

    1) Calcular el menor número e imprimir el valor.

    2) Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero 
    menor es igual o mayor que 10!".
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numeroValores = 0;

        do{
            System.out.print("Ingresar número de valores a solicitar: ");
            try{
                numeroValores = scanner.nextInt();
            } catch(InputMismatchException e){
                System.out.println("El texto ingresado no es un número entero, favor de ingresar un dato valido.\n");
                main(args);
                return;
            }

            if(numeroValores<10){
                System.out.println("El minimo de valores a ingresar es 10.\n");
            }
        } while(numeroValores<10);

        int[] numeros = new int[numeroValores];

        for(int i = 0; i < numeroValores; i++){
            boolean numeroValido = true;

            do{
                numeroValido = true;
                System.out.print("Ingresar el valor N° "+(i+1)+": ");

                try{
                    numeros[i] = scanner.nextInt();
                } catch(InputMismatchException e) {
                    System.out.println("El texto ingresado no es un número entero, favor de ingresar un dato valido.\n");
                    scanner.nextLine();
                    numeroValido = false;
                }
            } while(!numeroValido);
        }

        int numeroMenor = 0;
        for(int num : numeros){
            numeroMenor = numeroMenor>num? num : numeroMenor;
        }

        System.out.println("==============================================================================");
        System.out.println("El número más pequeño que se ha ingresado es el "+numeroMenor+".");
        System.out.println(numeroMenor<10?"El número menor es menor que 10!":"El numero menor es igual o mayor que 10!");
    }
}
