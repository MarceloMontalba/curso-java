import javax.swing.JOptionPane;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i=5, j=4, suma = i+j;

        System.out.println("suma = "+ suma);
        System.out.println("i+j = " + i + j); // Predecesión  parte de la cadena por lo cual las sumas son de concatenacion y no aritmeticas
        System.out.println("(i+j) = " + (i + j)); 

        int resta = i-j;
        System.out.println("resta = "+ resta);
        System.out.println("i-j = " + (i - j)); // Predecesión  sin parentesis daria error debido que no se puede restar un String
        
        int multi = i*j;
        System.out.println("multiplicacion = "+ multi);

        float div = (float) i/j;    // Debido a que los numeros originales son enteros la division solo mostraria la parte entera del resultado. Por ello se transforma uno de los valores a float
        System.out.println("division = "+ div);

        int resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if(numero%2 == 0){
            JOptionPane.showMessageDialog(null, "El número "+numero+" es par.");
        } else {
            JOptionPane.showMessageDialog(null, "El número "+numero+" es impar.");
        }
    }
}
