/*
Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un 
programa que pida la medida actual en litros y mostrar el resultado de la forma: 
Insuficiente, Suficiente, Medio...

La medida o capacidad actual del estanque puede ser en tipo double, para una 
mejor precisión, pero tambien puede ser del tipo int.

    1) Si la capacidad actual es 70 litros: imprimir Estanque lleno

    2) Si está entre 60 y menor a 70: imprimir Estanque casi lleno

    3) Si está entre 40 y menor a 60: imprimir Estanque 3/4

    4) Si está entre 35 y menor a 40: imprimir Medio Estanque

    5) Si está entre 20 y menor a 35: imprimir Suficiente

    6) Si está entre 1 y menor a 20: imprimir Insuficiente
*/

package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CapacidadEstanque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar cantidad actual en litros: ");
        
        double litrosIngresados = 0.0; 

        try{
            litrosIngresados = scanner.nextDouble();
        }catch(InputMismatchException e){
            main(args);
            return;
        }

        String categoriaEstanque = "";
        if(litrosIngresados>=1 && litrosIngresados<20) categoriaEstanque = "Insuficiente";
        if(litrosIngresados>=20 && litrosIngresados<35) categoriaEstanque = "Suficiente";
        if(litrosIngresados>=35 && litrosIngresados<40) categoriaEstanque = "Medio Estanque";
        if(litrosIngresados>=40 && litrosIngresados<60) categoriaEstanque = "Estanque 3/4";
        if(litrosIngresados>=60 && litrosIngresados<70) categoriaEstanque = "Estanque casi lleno";
        if(litrosIngresados==70) categoriaEstanque = "Estanque lleno";

        System.out.println(categoriaEstanque);
    }
}
