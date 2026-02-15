public class AutoboxingInteger {
    public static void main(String[] args) {
        
        Integer[] enteros = {2, 3, 4, 6, 7, 324, 45, 45, 76, 2, 64};

        int suma = 0;

        for(Integer i: enteros){
            if(i.intValue() % 2 == 0){
                suma += i.intValue();
            }
        }

        System.out.println("suma = " + suma);


        suma = 0;

        for(Integer i: enteros){
            if(i % 2 == 0){
                suma += i;
            }
        }

        System.out.println("suma = " + suma);
    }
}
