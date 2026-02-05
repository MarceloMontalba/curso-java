/*
    Obtener el nombre mas largo de tres personas, según los siguientes requerimientos

    1) Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros 
    de la familia o amigos usando la clase JOptionPane y método showInputDialog().

    2) Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en 
    cantidad de caracteres) (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)

    3) Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, 
    y con el indice cero accedemos al nombre de la persona.

    Restricción no usar loops en el desarrollo de la tarea.

    Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."

*/


package ejercicios;

import javax.swing.JOptionPane;

public class ObtenerNombreMasLargo {
    public static void main(String[] args) {
        JOptionPane control = new JOptionPane();

        // Obtención de datos
        String primerNombre  = control.showInputDialog("Ingresar el primer nombre");
        String segundoNombre = control.showInputDialog("Ingresar el segundo nombre");
        String tercerNombre  = control.showInputDialog("Ingresar el tercer nombre");

        // Obtención de largo de los nombres
        int largoPrimerNombre  = primerNombre.trim().split(" ")[0].length();
        int largoSegundoNombre = segundoNombre.trim().split(" ")[0].length();
        int largoTercerNombre  = tercerNombre.trim().split(" ")[0].length();


        // Comparativa con operador ternario
        String nombreGanador = "";
        int largoGanador     = 0;

        // Comparativa dos primeros nombres
        if(largoPrimerNombre>largoSegundoNombre){
            nombreGanador = primerNombre;
            largoGanador  = largoPrimerNombre;
        }else{
            nombreGanador = segundoNombre;
            largoGanador  = largoSegundoNombre;
        }

        // Comparativa con el tercer nombre
        if(largoTercerNombre>largoGanador){
            nombreGanador = tercerNombre;
            largoGanador  = largoTercerNombre;
        }

        JOptionPane.showMessageDialog(control, nombreGanador+" tiene el nombre más largo.");
    }
}
