import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int primerNumero  = 0;
        int segundoNumero = 0;

        System.out.print("Ingresar el primer número: ");
        primerNumero = scanner.nextInt();

        System.out.print("Ingresar el segundo número: ");
        segundoNumero = scanner.nextInt();

        int primerNumeroAbsoluto  = primerNumero<0? Integer.parseInt(Integer.toString(primerNumero).substring(1)):primerNumero;
        int segundoNumeroAbsoluto = segundoNumero<0? Integer.parseInt(Integer.toString(segundoNumero).substring(1)):segundoNumero;

        int resultado = 0;

        for(int i = 0; i<segundoNumeroAbsoluto; i++){
            resultado += primerNumeroAbsoluto;
        }

        // En caso de que alguno de los numeros ingresados sea negativo
        if((primerNumero<0 && segundoNumero>=0) || (primerNumero>=0 && segundoNumero<0)){
            resultado = -resultado;
        }

        System.out.println(primerNumero+" X "+segundoNumero+" = "+resultado);

        scanner.close();
    }
}
