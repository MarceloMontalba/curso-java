public class EtiquetasBucleBuscar {
    public static void main(String[] args) {
        
        String frase = "tres  ttrigo trigotrigo tristres tigres tragan trigo en un trigal triatrigo";
        String palabraBuscar = "trigo";

        int largoPalabraBuscar = palabraBuscar.length();
        int largoFrase = frase.length() - largoPalabraBuscar + 1;

        int conteo = 0;

        bucle1:
        for(int i = 0; i< largoFrase;){
            int auxI = i;

            for(int j = 0; j< largoPalabraBuscar; j++){
                if(frase.charAt(auxI++) != palabraBuscar.charAt(j)){
                    i++;
                    continue bucle1;
                }
            }

            conteo++;
            i = i + largoPalabraBuscar;
        }

        System.out.println("La palabra '"+ palabraBuscar + "' se repite "+ conteo + " veces.");
    }
}
