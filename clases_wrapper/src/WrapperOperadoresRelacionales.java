public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 1000; // Particularidad de Java: Maximo con numeros de hasta 127 java compara los valores de los objetos en vez de su instancia, ya mayores que eso solo compara por instancia o referencia
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));
        System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));
        System.out.println("Son el mismo objeto? " + (num1.intValue() == num2.intValue()));

        // Operadores relaciones como menor y mayor que siempre comparan valores. En cambio el igual igual por referencia en caso de numero mayores a 127
        num1 = 5000;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() > num2.intValue();
        System.out.println("condicion2 = " + condicion2);
    }
}
