/*
    Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores a 5, 
    promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

    Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

    Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Double[] notas = new Double[3];
        int numeroNotas = notas.length;
    
        boolean finalizaPrograma = false;
        for(int i = 0; i<numeroNotas; i++){
            System.out.print("Favor de ingresar la nota del alumno N° "+(i+1)+": ");

            // Validación de que sea número
            try{
                notas[i] = scanner.nextDouble();
            } catch(InputMismatchException e){
                System.out.println("Error: El texto ingresado no es un número válido.");
                finalizaPrograma = true;
                break;
            }

            // Manejo de notas válidas
            if(notas[i] < 1 || notas[i] > 7){ 
                System.out.println("Error: El texto ingresado no es un número válido.");
                finalizaPrograma = true;
                break;
            }
        }

        if(finalizaPrograma) return;

        Double promedioTotal     = 0.0;
        Double promedioMayoresA5 = 0.0;
        Double promedioMenoresA4 = 0.0;

        int nNotasMayoresA5 = 0;
        int nNotasMenoresA4 = 0;
        int nNotas1 = 0;

        for(Double nota : notas){
            if(nota > 5.0){
                promedioMayoresA5 += nota;
                nNotasMayoresA5++;
            } else if(nota < 4.0){
                promedioMenoresA4 += nota;
                nNotasMenoresA4++;
            } 
            
            if(nota == 1.0) {
                nNotas1++;
            }

            promedioTotal += nota;
        }

        // Se obtienen y muestran los promedios
        promedioTotal /= numeroNotas;
        promedioMayoresA5 /= nNotasMayoresA5;
        promedioMenoresA4 /= nNotasMenoresA4;
        
        System.out.println("=============================================================");
        System.out.println("PROMEDIO TOTAL : " + promedioTotal);
        System.out.println("PROMEDIO NOTAS MAYORES A 5.0  : " + promedioMayoresA5);
        System.out.println("PROMEDIO NOTAS MENORES A 4.0  : " + promedioMenoresA4);
        System.out.println("NÚMERO NOTAS IGUALES A 1.0: : " + nNotas1);
        System.out.println("=============================================================");

    }
}
