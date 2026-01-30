public class Concatenacion {
    public static void main(String[] args) {
        String personaje1 = "perrito";
        String personaje2 = "gato";

        String oracion = "El " + personaje1 + " está jugando con el " + personaje2 + ".";
        System.out.println(oracion);

        int numeroA = 10;
        int numeroB = 20;

        // La precedencia va desde izquierda a derecha. Excepto si existen paréntesis.
        System.out.println(oracion + numeroA +numeroB);
        System.out.println(oracion + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + oracion);

        String cadena1 = personaje1.concat(" quiere comer junto a ").concat(personaje2).concat(".");
        System.out.println(cadena1);
    };
}
