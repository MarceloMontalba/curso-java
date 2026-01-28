public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;

        System.out.println("\n========================================================================================");
        System.out.println("La variable datoLOgico es igual a: "+ datoLogico);

        float numeroFlotante = 123.231e2F;
        double numeroDoble   = 672.23e-2;
        
        datoLogico = numeroDoble > numeroFlotante;
        System.out.println("La variable datoLOgico es igual a: "+ datoLogico);

        datoLogico = ((3-2) == 1);

        System.out.println("La variable datoLOgico es igual a: "+ datoLogico);

    }
}
