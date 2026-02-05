public class SwitchCase {
    public static void main(String[] args) {
        char num = 'a';

        switch(num){
            case '0':
                System.out.println("El num es '0'");
                break;
            case '1':
                System.out.println("El num es '1'");
                break;
            case '2':
                System.out.println("El num es '2'");
                break;
            case '3':
                System.out.println("El num es '3'");
                break;
            case 'a':
                System.out.println("El num es 'a'");
                break;
            default:
                System.out.println("Opción desconocida.");
                break;
        }
    }
}
