import java.lang.reflect.Method;

public class EjemploGetClass {
    public static void main(String[] args) {
        
        String texto = "Hola que tal?";

        Class strClass =  texto.getClass();

        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = "+ metodo.getName());
        }

        System.out.println("==================================================");

        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass.getSuperClass()" + intClass.getSuperclass());
        
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("objClass.getSuperClass() " + objClass);

        for(Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }
}
