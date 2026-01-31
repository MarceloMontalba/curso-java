public class ValidacionCadenas {
    public static void main(String[] args) {
        String cadenaNula = null;
        
        // cadenaNula = cadenaNula.concat("Esto dará error"); // Causará error NullPointerException

        boolean esNula = cadenaNula == null;

        System.out.println("cadenaNula = " + esNula);

        if(esNula){    // Se asegura que la cadena tenga algo
            cadenaNula = "        ";
        }

        // Vacio es que no tiene nada (ni espacios, ni caracteres)
        boolean esVacio = cadenaNula.length() == 0;

        if(!esVacio){
            System.out.println("La cadena tiene algo.");
        } else{
            System.out.println("La cadena no tiene nada.");
        }

        boolean esVacio2 = cadenaNula.isEmpty();
        System.out.println("Comprobación con funcion isEmpty : "+esVacio2);


        // Mas restrictivo que isEmpty. Comprueba que la cadena no tenga nada (los espacios en blanco los considera como nada)
        boolean esBlanca = cadenaNula.isBlank();
        System.out.println("Comprobación con funcion isBlank : "+esBlanca);
    }
}
