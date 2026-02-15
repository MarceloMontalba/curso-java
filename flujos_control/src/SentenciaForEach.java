public class SentenciaForEach {
    public static void main(String[] args) {
        
        int[] numeros = {1,23,56,123,65,236,45,213};

        for(int num : numeros){
            System.out.println("num = " + num);
        }

        System.out.println("===================================================");
        
        String[] nombres = {"Andres", "Pepe", "María", "Lalo", "Marcos", "Leonardo"};

        for(String nom : nombres){
            System.out.println("nom = " + nom);
        }
    }
}
