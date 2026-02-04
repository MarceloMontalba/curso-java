public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -7;

        int j = +i;         // j = (1)*-7 = -7
        System.out.println("j = "+ j);

        int k = -i;         // k = (-1)*-7 = 7
        System.out.println("k = "+ k);

        int x = 6, z = +x;  // z = (1) * 6 = 6
        System.out.println("z = " + z);

        int a = -x;         // a = (-1) * -6 = 6;
        System.out.println("a = "+ a);
    }
}
