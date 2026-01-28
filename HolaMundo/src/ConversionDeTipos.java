public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt: "+numeroInt);

        String realStr = "98231.23e-2"; // Notación de punto flotante
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble: "+realDouble);
    }
}
