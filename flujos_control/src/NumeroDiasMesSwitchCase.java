import java.util.Scanner;

public class NumeroDiasMesSwitchCase {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar número mes a evaluar (1-12): ");
        int mesIngresado  = scanner.nextInt();

        System.out.print("Ingresar año a evaluar (YYYY): ");
        int anioIngresado = scanner.nextInt();

        int numeroDias = 0;

        switch(mesIngresado){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                // Febrero tiene 29 dias si es un año bisiesto. De lo contrario tiene 28
                if(anioIngresado % 400 == 0 || ( (anioIngresado % 4 == 0) && !(anioIngresado % 100 == 0))){
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                numeroDias = 0;
        }

        System.out.println("El mes "+mesIngresado+" del año "+anioIngresado+" tiene "+numeroDias+" días!");
    }
}
