import javax.swing.JOptionPane;

public class SentenciaForArreglo {
    public static void main(String[] args){
        
        String[] nombres = {"Andres", "Pepe", "María", "Lalo", "Marcos", "Leonardo"};

        int count = nombres.length;

        for(int i = 0; i< count; i++){
            if(nombres[i].equalsIgnoreCase("lalo") || 
               nombres[i].equalsIgnoreCase("pepe")){
                continue;
            }

            System.out.println(i + ".- "+nombres[i]);
        }

        for(int i = 0; i< count; i++){
            if(nombres[i].toLowerCase().contains("lalo") || 
               nombres[i].toLowerCase().contains("pepe")){
                continue;
            }

            System.out.println(i + ".- "+nombres[i]);
        }

        System.out.println("==================================================");

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\": ");

        boolean encontrado = false;

        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }

        if(encontrado){
            JOptionPane.showMessageDialog(null, "El nombre fué encontrado 😉!");
        } else {
            JOptionPane.showMessageDialog(null, "El nombre no fué encontrado 😟");
        }

    }
}
