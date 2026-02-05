package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primerNumero  = 0;
        int segundoNumero = 0;

        System.out.print("Ingresar primer número: ");

        try{
            primerNumero = scanner.nextInt();
        } catch(InputMismatchException e){
            main(args);
            return;
        }

        System.out.print("Ingresar segundo número: ");
        try{
            segundoNumero = scanner.nextInt();
        } catch(InputMismatchException e){
            main(args);
            return;
        }

        String numerosOrdenados = primerNumero > segundoNumero? primerNumero+", "+segundoNumero : segundoNumero+", "+primerNumero;
        System.out.println("Los números ordenados de mayor o menor se verían así: "+numerosOrdenados);

        scanner.close();
    }
}
