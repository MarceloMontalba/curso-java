public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i+4;

        // Operadores combinados
        i += 2;  // i = i + 2;
        System.out.println("i += 2 : "+i);

        j -= 5;  // j = j-5
        System.out.println("j -= 5 : "+j);

        i *= 4;  // i = i*4;
        System.out.println("i *= 4 : "+i);

        j /= 3;   // j = j/3;
        System.out.println("j /= 3 : "+j);

        // Operadores combinados en cadenas de texto
        String sentenciaSql = "SELECT * FROM clientes as c ";
        sentenciaSql += "WHERE c.nombre='Marcelo' ";
        sentenciaSql += "AND c.apellido='Montalba'";
        System.out.println("sentenciaSql : " + sentenciaSql);
    }
}
