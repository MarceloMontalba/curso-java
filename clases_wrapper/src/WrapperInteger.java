public class WrapperInteger {
    public static void main(String[] args) {
        
        int intPrimitivo = 242342;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intObjeto;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorString = "654334";
        Integer valorTransformadoInt = Integer.valueOf(valorString);
        System.out.println("valorTransformadoInt = " + valorTransformadoInt);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto2.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto2.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}
