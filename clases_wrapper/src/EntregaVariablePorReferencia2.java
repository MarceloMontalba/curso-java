class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class EntregaVariablePorReferencia2 {
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.modificarNombre("Marcelo");
        

        System.out.println("====================================================");
        System.out.println("Antes de llamar al metodo test");
        System.out.println("persona = " + persona.leerNombre());

        test(persona);

        System.out.println("====================================================");
        System.out.println("Despues de llamar al metodo test");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Finaliza metodo main con datos modificados");

        /* Los objetos derivados de clases creadas por el usuario entregan la referencia al objeto. Por lo tanto si
           se modifica un valor de dicha referencia, tambien se modifica el valor en el objeto principal.
        */
    }

    public static void test(Persona individuo){
        System.out.println("====================================================");
        System.out.println("Inicia el metodo test");
        individuo.modificarNombre("Nehemias");
        System.out.println("Finaliza el metodo test");
    }
}
