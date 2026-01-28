public class PrimitivosFloat {
    public static void main(String[] args) {
        float decimal1 = 1500.0f;
        float decimal2 = 1.5E3F;            // Declarado con sistema de punto flotante
        float decimalMinLim = 1.4E-45F;     // Declarado con sistema de punto flotante
        float decimalMinLim2 = 0.0000000000000000000000000000000000000000000014F;

        System.out.println("\n========================================================================================");
        System.out.println("El valor del decimal1 es igual a : "+decimal1);
        System.out.println("El valor del decimal2 es igual a : "+decimal2);
        System.out.println("El valor del decimalMinLim es igual a : "+decimalMinLim);
        System.out.println("El valor del decimalMinLim2 es igual a : "+decimalMinLim2);
        System.out.println("El limite positivo de un flotante es igual a "+Float.MAX_VALUE);
        System.out.println("El limite negativo de un flotante es igual a "+Float.MIN_VALUE);

        System.out.println("\n========================================================================================");
        System.out.println("El double en bytes es igual a "+ Double.BYTES);
        System.out.println("El double en bites es igual a "+ Double.SIZE);
        System.out.println("El Limite maximo del double es igual a "+ Double.MAX_VALUE);
        System.out.println("El Limite minimo del double es igual a "+ Double.MIN_VALUE);
    }
}
