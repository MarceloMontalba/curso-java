public class OperadoresIncrementales {
    public static void main(String[] args) {
        // Pre incremento 
        System.out.println("Pre Incremento");
        int i = 1; 
        int k = ++i; // Primero se incrementa i a 2; y luego ese valor tambien se asigna a k

        System.out.println("i = "+ i);
        System.out.println("k= "+ k);

        // Post incremento
        System.out.println("\nPost Incremento");
        i = 2; 
        k = i++; // Primeramente se asigna el valor de i a k y luego i se aumenta en uno

        System.out.println("i = "+ i);
        System.out.println("k = "+ k);

        // Pre decremento
        System.out.println("\nPre decremento");
        i = 5; 
        k = --i; // Primero se decrementa i a 4; y luego ese valor tambien se asigna a k

        System.out.println("i = "+ i);
        System.out.println("k = "+ k);

        // Post decremento
        System.out.println("\nPost decremento");
        i = 5; 
        k = i--; // Primeramente se asigna el valor de i a k y luego i se decrementa en uno

        System.out.println("i = "+ i);
        System.out.println("k = "+ k);

        System.out.println("k = "+ (k++));  // Devuelve 5, pero el valor de k es 6
        System.out.println("k = "+ (--k));  // Devuelve 5 y su valor es 5
        System.out.println("k = "+ (++k));  // Devuelve 6 y su valor es 6
    }
}
