import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        // Credenciales
        /*
        String usuario1 = "marcelo";
        String clave1   = "123456";

        String usuario2 = "chelo";
        String clave2   = "09876";

        String usuario3 = "admin";
        String clave3   = "672";
        */

        /*
        String[] usuarios = new String[3];
        String[] claves   = new String[3];

        usuarios[0] = "marcelo";
        claves[0]   = "123456";

        usuarios[1] = "chelo";
        claves[1]   = "09876";

        usuarios[2] = "admin";
        claves[2]   = "672";
        */

        String[] usuarios = {"marcelo", "chelo", "admin"};
        String[] claves   = {"123456", "09876", "672"};

        // Obtención de ingreso de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Ingrese la contraseña de usuario: ");
        String claveIngresada = scanner.nextLine();

        boolean esAutenticado = false;

        for(int i=0; i<usuarios.length; i++){
            // Operador ternario
            esAutenticado = (usuarios[i].equals(usuarioIngresado) && claves[i].equals(claveIngresada))? true : esAutenticado;

            if(esAutenticado){
                break;
            }
        }

        String mensaje = esAutenticado? "Bienvenido usuario *"+ usuarioIngresado +"*." : 
                                        "El usuario y/o contraseña ingresada no son correctas.";
        if(esAutenticado){
            System.out.println("================================================");
            System.out.println(mensaje );
            System.out.println("================================================");
        } else {
            System.out.println(mensaje);
        }

        scanner.close();
    }
}
