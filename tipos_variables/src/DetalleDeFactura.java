// La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se 
// requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner 
// de la siguiente manera:

// 1) Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el 
//    nombre de la factura con espacios.
// 2) Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener 
//    precios con decimales (,).
// 3) Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

// Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), 
// el impuesto y el monto total neto incluyendo impuesto.

// Por ejemplo, el resultado podría ser algo así:

// La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto 
// después de impuesto es de 160.3882
import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        System.out.println("==========================================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre de factura o descripción: ");
        String nombreFactura = scanner.nextLine();

        System.out.print("Ingresa el precio del primer producto: ");
        
        double precioProductoUno = 0.0;
        double precioProductoDos = 0.0;
        try{
            precioProductoUno = scanner.nextDouble();
        } catch(InputMismatchException e){
            System.out.println("Error: Debía de ingresarse un número real.");
            main(args);
            System.exit(0);
        }

        System.out.print("Ingresa el precio del segundo producto: ");
        try{
            precioProductoDos = scanner.nextDouble();
        } catch(InputMismatchException e){
            System.out.println("Error: Debía de ingresarse un número real.");
            main(args);
            System.exit(0);
        }

        System.out.println(precioProductoUno);
        System.out.println(precioProductoDos);
    }
}
