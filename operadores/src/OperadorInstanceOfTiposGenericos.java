public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
        Object texto = new String("Hola Mundo! Que tal???");

        Number num = Integer.valueOf(7); //7;

        boolean b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof String;
        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);

        b1 = num instanceof Long;
        System.out.println("num es del tipo Long = " + b1);

        b1 = num instanceof Float;
        System.out.println("num es del tipo Float = " + b1);
    }
}
