public class OperadoresLogicos {
    public static void main(String[] args) {
        int numero1    = 123;
        float numero2  = 2342E4F;
        float numero3 = (float) numero1;
        boolean boleano = false;

        // AND
        boolean b1 = numero1 < numero2 && numero1==numero3 && boleano==false;
        System.out.println("b1 = " + b1);

        // OR
        boolean b2 = numero1 == numero2 || numero1==numero3;
        System.out.println("b2 = " + b2);

        // AND y OR con manejo de precedencia
        boolean b3 = numero1 > numero2 || (numero1<numero3 && boleano==false);
        System.out.println("b3 = " + b3);

        boolean b4 = true && false || true;
        System.out.println("b4 = "+b4);

        boolean b5 = (true && false || true && false) || false;
        System.out.println("b5 = "+b5);
    }
}
