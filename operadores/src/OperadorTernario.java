import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String variable = 7==5? "Si es verdadero" : "Si es falso";
        System.out.println("variable = "+variable);

        String estado = "";
        double matematicas = 0.0;
        double ciencias    = 0.0;
        double historia    = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar la nota de matemáticas entre 2,0 - 7,0: ");
        matematicas = scanner.nextDouble();

        System.out.print("Ingresar la nota de ciencias entre 2,0 - 7,0: ");
        ciencias = scanner.nextDouble();

        System.out.print("Ingresar la nota de historia entre 2,0 - 7,0: ");
        historia = scanner.nextDouble();

        double promedio = (matematicas + ciencias + historia)/3;
        estado = promedio>=5.49? "Aprobado":"Reprobado";

        System.out.println("estado = "+estado);

        scanner.close();
    }
}
