public class IgualdadDeCadenas {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("PrograMacIón Java");
        
        // Es falso debido a que se hace la comparación a la referencia de objeto en memoria y no al valor
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 : " + esIgual);

        // Se comparan valores
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) : " + esIgual);

        // Se comparan valores sin importar el tamaño de la letra
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) : " + esIgual);

        // Comparación de dos objetos String que se instanciaron en la literal
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 : " + esIgual);     // Es true debido a que java reconoce que ya hay un objeto con el mismo valor
                                                                // por ende en vez de crear una nueva instancia, se asigna una referencia al objeto ya existente
                                                                // en memoria.
        }

}
