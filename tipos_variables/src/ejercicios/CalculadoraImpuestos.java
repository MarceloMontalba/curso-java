import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraImpuestos {
    public static void main(String[] args) {
        /*
         * EJERCICIO 4: Calculadora de Impuestos y Descuentos
         * 
         * Crea un programa que reciba un monto de compra (double) usando Scanner
         * y calcule automáticamente:
         * - Un descuento del 10% si la compra es mayor a 100
         * - Un descuento del 5% si la compra está entre 50 y 100
         * - Sin descuento si es menor a 50
         * - Aplica un impuesto del 16% al monto después del descuento
         * 
         * Requisitos:
         * - Utiliza Scanner.nextDouble() para la entrada
         * - Usa operadores de comparación (>, <, ==) para validar el rango
         * - Realiza cálculos matemáticos con doubles
         * - Usa try-catch para manejar InputMismatchException
         * - Convierte el resultado a String usando String.valueOf()
         * - Muestra en un solo mensaje: monto original, descuento aplicado, impuesto y total final
         * 
         * Ejemplo de salida esperada:
         * Monto original: 150.0
         * Descuento aplicado: 15.0 (10%)
         * Monto después descuento: 135.0
         * Impuesto (16%): 21.6
         * Total a pagar: 156.6
         */

        double montoCompra = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el monto de la compra : ");

        try {
            montoCompra = scanner.nextDouble();
        } catch (InputMismatchException e) {
            main(args);
            System.exit(0);
        }

        // Se calcula el descuento
        float descuentoPtj = 0;

        if(montoCompra>=50 && montoCompra<=100){
            descuentoPtj = 5;
        }

        if(montoCompra>100){
            descuentoPtj = 10;
        }
        
        double descuentoValor = montoCompra*descuentoPtj/100; 
        double montoConDescuento = montoCompra - descuentoValor;

        String mensajePantalla = "";
         mensajePantalla += "* Monto original: "+montoCompra+'\n';
         mensajePantalla += "* Descuento aplicado: "+descuentoValor+" ("+descuentoPtj+"%)"+'\n';
         mensajePantalla += "* Monto después descuento: "+montoConDescuento+'\n';

         // Se calcula el impuesto
         float impuestoPtj  = 16;

         double impuestoValor = montoConDescuento * impuestoPtj / 100;
         double montoTotal    = montoConDescuento + impuestoValor;
         
         mensajePantalla += "* Impuesto ("+impuestoPtj+"%): "+impuestoValor+'\n';
         mensajePantalla += "* Total a pagar: "+montoTotal;

         System.out.println("======================================================================");
         System.out.println(mensajePantalla);
         System.out.println("======================================================================");

         scanner.close();
    }
}
