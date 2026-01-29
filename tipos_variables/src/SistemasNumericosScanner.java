import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        //String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;

        try{
            numeroDecimal =  scanner.nextInt(); //Integer.parseInt(numeroStr);
        } catch (InputMismatchException e){
            System.out.println("\n=======================================================================================");
            System.out.println("Error, debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }

        System.out.println("\n=======================================================================================");
        String mensaje = "Numero en decimal es igual a: "+numeroDecimal;
        mensaje += "\nNumero en binario es igual a: "+Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNumero en octal es igual a: "+Integer.toOctalString(numeroDecimal);
        mensaje += "\nNumero en hexadecimal es igual a: "+Integer.toHexString(numeroDecimal);

        System.out.println(mensaje);
    }
}   