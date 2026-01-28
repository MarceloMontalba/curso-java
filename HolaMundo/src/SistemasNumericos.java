import javax.swing.JOptionPane;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");

        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }
        
        System.out.println("numeroDecimal es igual a: "+numeroDecimal);
        System.out.println("numeroDecimal en binario es igual a: "+Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario es igual a: "+numeroBinario);
        System.out.println("numeroDecimal en octal es igual a: "+Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764;
        System.out.println("numeroOctal es igual a: "+numeroOctal);
        System.out.println("numeroDecima en hexadecimal es igual a: "+Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4;

        System.out.println("numeroHex en decimal es igual a: "+numeroHex);

        String mensaje = "Numero en decimal es igual a: "+numeroDecimal;
        mensaje += "\nNumero en binario es igual a: "+Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNumero en octal es igual a: "+Integer.toOctalString(numeroDecimal);
        mensaje += "\nNumero en hexadecimal es igual a: "+Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);
    }
}   