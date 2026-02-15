public class EtiquetasEnBucles {
    public static void main(String[] args) {
        
        bucle1:
        for(int i =1; i<= 7; i++){

            int j = 1;
            while(j<=8){
                if(i == 6 || i == 7) {
                    System.out.println("El día "+i+" es de descanso.");
                    continue bucle1;
                }

                System.out.println("Trabajando en el día "+i+" a las "+j+" hrs.");
                j++;
            }
        }

        System.out.print("==========================================================================");
        etiqueta2:
        for(int i = 0; i < 5; i++){

            System.out.println("");
            for(int j = 0; j<10; j++){
                if (i == 1) continue etiqueta2;

                System.out.print("i = " + i + ", j = "+j+", ");
            }
        }

        System.out.print("\n==========================================================================");
        etiqueta3:
        for(int i = 0; i < 5; i++){

            System.out.println("");
            for(int j = 0; j<10; j++){
                if (i == 3) break etiqueta3;

                System.out.print("i = " + i + ", j = "+j+", ");
            }
        }
    }
}
