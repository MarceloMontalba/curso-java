public class SentenciaFor {
    public static void main(String[] args) {
        
        for(int i=0; i<10; i++){
            System.out.println("i = "+i);
        }

        System.out.println();

        for(int j = 10; j>=0; j--){
            System.out.println("j = "+j);
        }

        System.out.println();

        for(int x = 1, y=10; x<y; x++, y--){
            System.out.println("x = "+x + "; y = "+y);
        }

        System.out.println();

        for(int z= 0; z<=10; z++){
            if(!(z % 2 == 0)){
                continue;
            }

            System.out.println("z = "+z);
        }
    }
}
