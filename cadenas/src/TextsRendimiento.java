import java.util.InputMismatchException;
import java.util.Scanner;

public class TextsRendimiento {
    public static void main(String[] args) {
        // Comparativa de tiempo transcurrido al realizar operaciones de
        // concatenacion de las diversas funciones de java

        String a  = "a";
        String b = "b";
        String c = a;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar el numero de iteraciones que desea realizar : ");
        
        Long i;
        Long iFinal = 0L;

        try {
            iFinal = scanner.nextLong();
        } catch(InputMismatchException e) {
            System.out.println("El valor ingresado debe ser un entero.");
            System.out.println("===========================================================================================================================");
            main(args);
            return;
        }

        // =============================================================================
        // Con más
        // =============================================================================
        long inicioTimer = System.currentTimeMillis();
        String concConMas = "";
        for(i=0L; i<iFinal; i++){
            // Con +
            concConMas += a + b + c + "\n";
        }
        long finTimer = System.currentTimeMillis();

        System.out.println("===========================================================================================================================");
        System.out.println("* La concatenación por suma con un ciclo de "+ i+ " iteraciones tardó                     : "+(finTimer-inicioTimer)+"ms.");

        // =============================================================================
        // Con concat
        // =============================================================================
        inicioTimer = System.currentTimeMillis();
        String concConConcat = "";
        for(i=0L; i<iFinal; i++){
            concConConcat = concConConcat.concat(a).concat(b).concat(c).concat("\n");
        }
        finTimer = System.currentTimeMillis();
        System.out.println("* La concatenación por funcion concat con un ciclo de "+ i+ " iteraciones tardó           : "+(finTimer-inicioTimer)+"ms.");


        // =============================================================================
        // Con StringBuilder
        // =============================================================================
        inicioTimer = System.currentTimeMillis();
        StringBuilder concConStringBuilder = new StringBuilder(""); 


        for(i=0L; i<iFinal; i++){
            concConStringBuilder.append(a).append(b).append(c).append("\n");
        }
        finTimer = System.currentTimeMillis();
        System.out.println("* La concatenación mediante clase StringBuilder con un ciclo de "+ i+ " iteraciones tardó : "+(finTimer-inicioTimer)+"ms.");

        // =============================================================================
        // Se da aviso al usuario si las cadenas tienen igual valor
        // =============================================================================
        System.out.println("===========================================================================================================================");
        if(concConMas.equals(concConConcat) && concConMas.equals(concConStringBuilder.toString())){
            System.out.println("Las tres cadenas resultantes tienen el mismo valor.");
        } else {
            System.out.println("Las tres cadenas resultantes no tienen el mismo valor.");
        }
        System.out.println("===========================================================================================================================");
    
        scanner.close();
        /*  Prueba de mejora significativa con StringBuilder :
            Ingresar el numero de iteraciones que desea realizar : 231231
            ===========================================================================================================================
            * La concatenación por suma con un ciclo de 231231 iteraciones tardó                     : 17633ms.
            * La concatenación por funcion concat con un ciclo de 231231 iteraciones tardó           : 68028ms.
            * La concatenación mediante clase StringBuilder con un ciclo de 231231 iteraciones tardó : 29ms.
            ===========================================================================================================================
            Las tres cadenas resultantes tienen el mismo valor.
            ===========================================================================================================================
        */
    }
}
