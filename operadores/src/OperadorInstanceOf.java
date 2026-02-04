public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = new String("Hola Mundo! Que tal???");

        Integer num = 7;

        boolean b1 = texto instanceof Object;
        System.out.println("b1 es del tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("b1 es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("b1 es del tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("b1 es del tipo Object = " + b1);

        Double doble = 45.23;
        b1 = doble instanceof Number;
        System.out.println("b1 es del tipo Object = " + b1);
    }
}
