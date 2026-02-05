public class SentenciaIfElse {
    public static void main(String[] args) {
        
        float promedio = 3.8f;

        if(promedio>=6.5){
            System.out.println("Felicitaciones, tienes un promedio excelente!");
        } else if(promedio >= 6.0){
            System.out.println("Muy buen promedio!");
        } else if(promedio >= 5.5){
            System.out.println("Buen promedio!");
        } else if(promedio >= 5.0){
            System.out.println("Regular, necesitas esforzarte un poco más!");
        } else if(promedio >= 4.0){
            System.out.println("Necesitas esforzarte un poco más.");
        } else {
            System.out.println("Estas reprobado!");
        }
    }
}
