public class Inmutabilidad {
    public static void main(String[] args) {
        String saludo = "Hola, espera. Quiero saludarte";
        String sujeto = "Marcelo";

        saludo.concat(". Soy "+sujeto); // Se genera una nueva instancia. No se reemplaza la cadena original
        System.out.println(saludo);

        saludo = saludo.concat(". Soy "+sujeto); // Se cambia el objeto al cual se referencia. Las cadenas son inmutables
        System.out.println(saludo);

        String concatenacionLamda = sujeto.transform((s)->{ // Otra forma de transformar cadenas es con la expresion de tipo flecha. Lamda
            return s+" es muy bkn!";
        });
        System.out.println(concatenacionLamda);

        String reemplazoSubcadenas = saludo.replace("a", "@");
        System.out.println(reemplazoSubcadenas);
    }
}
