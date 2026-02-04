public class OperadoresRelacionales {
    public static void main(String[] args) {
        int numero1    = 123;
        float numero2  = 2342E4F;
        float numero3 = (float) numero1;
        boolean boleano = false;

        boolean b1 = numero1 == numero2;
        System.out.println("b1 = " + b1);

        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        boolean b3 = numero1 < numero2;
        System.out.println("b3 = " + b3);

        boolean b4 = numero1 > numero2;
        System.out.println("b4 = " + b4);

        boolean b6 = numero1 != numero3;
        System.out.println("b6 = " + b6);

        boolean b7 = numero1 <= numero2;
        System.out.println("b7 = " + b7);

        boolean b8 = numero1 >= numero2;
        System.out.println("b8 = " + b8);

        boolean b9 = !boleano;              // Operador unario
        System.out.println("b9 = "+b9);
    }
}
