public class ObtenicionExtensionArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "ima.gen.png";
        int posicionPuntoExtension = nombreArchivo.lastIndexOf(".");
        String extensionArchivo = nombreArchivo.substring(posicionPuntoExtension+1);

        System.out.println("\n=========================================================");
        System.out.println("Extension del archivo \""+nombreArchivo+"\" = "+extensionArchivo);
        System.out.println("=========================================================");
    }
}
