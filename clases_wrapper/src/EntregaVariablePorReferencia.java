public class EntregaVariablePorReferencia {
    public static void main(String[] args) {
        
        int[] numero = {34, 45, 12};

        for(int i: numero){
            System.out.println("edad[i] = " + i);
        }

        System.out.println("====================================================");
        System.out.println("Antes de llamar al metodo test");
        test(numero);

        System.out.println("====================================================");
        System.out.println("Despues de llamar al metodo test");
        for(int i: numero){
            System.out.println("edad[i] = " + i);
        }
        System.out.println("Finaliza metodo main con datos modificados");

        /* A diferencia de variables primitivas o clases number o string que solo entregan valor o 
           son inmutables respectivamente. Los objetos como arreglos entregan la referencia.
           Por lo tanto si algo cambia un valor  de donde se referencia. En la instancia original tambien.
        */
    }

    public static void test(int[] arreglo){
        System.out.println("====================================================");
        System.out.println("Inicia el metodo test");
        int largoArreglo = arreglo.length;
        
        for(int i = 0; i < largoArreglo; i++){
            arreglo[i] = arreglo[i] + 10;
        }
        
        System.out.println("Finaliza el metodo test");
    }
}
