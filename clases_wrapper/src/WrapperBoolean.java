public class WrapperBoolean {
    public static void main(String[] args) {
        
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2;
        Boolean objBoolean  = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = Boolean.valueOf(false);

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean  = " + objBoolean );
        System.out.println("objBoolean2 = " + objBoolean2);

        // Booleanos primitivos o de referencia siempre comparan por valor
        System.out.println("Comparando dos objetos boolean: " + (objBoolean == objBoolean2));
        System.out.println("Comparando dos objetos boolean: " + (primBoolean == objBoolean2));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean3 == objBoolean2));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean3.equals(objBoolean2)));
    }
}
