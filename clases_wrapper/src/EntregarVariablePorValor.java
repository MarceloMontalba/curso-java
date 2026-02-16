public class EntregarVariablePorValor{
    public static void main(String[] args) {
        
        Integer numero = 45;

        System.out.println("numero = " + numero);
        test(numero);

        // Al pasar valor o algun objeto de clase definida en java (String, Integer, Short, Byte).
        // a otra instancia y cambiarlo. El valor original no es cambiado. Debido a que 
        // las variables primitivas sol entregan su valor y los objetos definidos en Java
        // son inmutables. Es decir crean una nueva instancia
        System.out.println("valor actual numero = " + numero);
    }

    public static void test(Integer i){
        System.out.println("Valor entrante = " + i);
        i = 78;
        System.out.println("Valor saliente = " + i);
    }
}
