import java.util.Scanner;

public class NumeroDeDiasMes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar número mes a evaluar (1-12): ");
        int mesIngresado  = scanner.nextInt();

        System.out.print("Ingresar año a evaluar (YYYY): ");
        int anioIngresado = scanner.nextInt();

        int numeroDias = 0;

        if(mesIngresado==1 || mesIngresado==3 || mesIngresado==5 || mesIngresado==7 || 
           mesIngresado==8 || mesIngresado==10 || mesIngresado==12){
            numeroDias = 31;
        } else if(mesIngresado==4 || mesIngresado==6 || mesIngresado==9 || mesIngresado==11){
            numeroDias = 30;
        } else if(mesIngresado==2){
            // Febrero tiene 29 dias si es un año bisiesto. De lo contrario tiene 28
            if(anioIngresado % 400 == 0 || ( (anioIngresado % 4 == 0) && !(anioIngresado % 100 == 0))){
                numeroDias = 29;
            } else {
                numeroDias = 28;
            }
        }

        System.out.println("El mes "+mesIngresado+" del año "+anioIngresado+" tiene "+numeroDias+" días!");
    }
}
