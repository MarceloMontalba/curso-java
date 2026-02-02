public class CadenasMetodos {
    public static void main(String[] args) {
        String nombre = "Marcelo";

        System.out.println("nombre.length() = " +nombre.length());
        System.out.println("nombre.toUpperCase() = "+nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Marcelo\") = "+nombre.equals("Marcelo"));
        System.out.println("nombre.equals(\"marcelo\") = "+nombre.equals("marcelo"));
        System.out.println("nombre.equalsIgnoreCase(\"Marcelo\") = "+nombre.equalsIgnoreCase("Marcelo"));
        System.out.println("nombre.equalsIgnoreCase(\"marcelo\") = "+nombre.equalsIgnoreCase("marcelo"));
        System.out.println("nombre.compareTo(\"Juan\") = "+nombre.compareTo("Juan")); // 0 si son iguales; negativo si nombre tiene viene antes alfabeticamente o lexicograficamente; positivo si nombre viene despues
        System.out.println("nombre.compareTo(\"Marcelo\") = "+nombre.compareTo("Marcelo"));
        System.out.println("nombre.charAt(0) = "+ nombre.charAt(0)); // Consige el caracter de la posicion dada
        System.out.println("nombre.substring(2) = "+nombre.substring(2));
        System.out.println("nombre.substring(1,7) = "+nombre.substring(1,7)); // El limite no es inclusive (ese caracter no está considerado)

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf(\"g\") = "+trabalenguas.indexOf("g")); // Devuuelve posicion de la primera cooincidencia; Si es negativo es porrque la subcadena no se encontraba en la cadena
        System.out.println("trabalenguas.lastIndexOf(\"a\") = "+trabalenguas.lastIndexOf("a")); 
        System.out.println("trabalenguas.contains(\"tr\") = "+trabalenguas.contains("tr")); // Devuelve true o false si la subcadena se encuntra contenido
        System.out.println("trabalenguas.startsWith(\"ra\") = "+trabalenguas.startsWith("ra")); // True o false si la cadena comienza con la subcadena entregada
        System.out.println("trabalenguas.endsWith(\"as\") = "+trabalenguas.endsWith("as"));
        System.out.println("\"         cadena con espacios basuura    \".trim() = "+"         cadena con espacios basuura    ".trim());
    }
}
