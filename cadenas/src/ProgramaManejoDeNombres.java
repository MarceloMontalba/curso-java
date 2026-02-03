import java.util.Scanner;

public class ProgramaManejoDeNombres {
    /* 
        La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

        1. Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o 
        amigos como argumentos de línea de comandos.

        2. Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter 
        pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. 
        Por ejemplo para Andres debe quedar como N.es

        3. Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).


        Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

        N.es_A.ia_E.pe
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos
        System.out.println("\n===============================================");
        System.out.print("Ingresar primer nombre: ");
        String primerNombreIngresado = scanner.nextLine();

        System.out.print("Ingresar segundo nombre: ");
        String segundoNombreIngresado = scanner.nextLine();

        System.out.print("Ingresar tercer nombre: ");
        String tercerNombreIngresado = scanner.nextLine();

        // Transformación de datos
        StringBuilder respuesta = new StringBuilder("");
        
        char[] arreglo1 = primerNombreIngresado.toCharArray();
        char[] arreglo2 = segundoNombreIngresado.toCharArray();
        char[] arreglo3 = tercerNombreIngresado.toCharArray();


        // Llenado de información

        // primerNombreIngresado
        if(arreglo1.length>=2){
            respuesta.append(Character.toString(arreglo1[1]).toUpperCase()+".");
        } else {
            respuesta.append(".");
        }

        if(arreglo1.length-2>=0){
            respuesta.append(primerNombreIngresado.substring(arreglo1.length-2) + "_");
        } else {
            respuesta.append("_");
        }

        // segundoNombreIngresado
        if(arreglo2.length>=2){
            respuesta.append(Character.toString(arreglo2[1]).toUpperCase()+".");
        } else {
            respuesta.append(".");
        }

        if(arreglo2.length-2>=0){
            respuesta.append(segundoNombreIngresado.substring(arreglo2.length-2) + "_");
        } else {
            respuesta.append("_");
        }

        // tercerNombreIngresado
        if(arreglo3.length>=2){
            respuesta.append(Character.toString(arreglo3[1]).toUpperCase()+".");
        } else {
            respuesta.append(".");
        }

        if(arreglo3.length-2>=0){
            respuesta.append(tercerNombreIngresado.substring(arreglo3.length-2));
        }

        System.out.println("===============================================");
        System.out.println("Resultado : "+ respuesta);
        System.out.println("===============================================");
    }
}
