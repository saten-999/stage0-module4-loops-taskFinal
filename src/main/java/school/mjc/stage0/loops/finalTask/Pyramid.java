package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        
        for (int i = cathetusLength; i > 0; i--) {
            for (int j = cathetusLength; j >0; j--){
                if( i+j-1>cathetusLength){
                    System.out.print(" ");
                }else{
                    System.out.print(j);
                }
            }
            for (int k =2; k <=cathetusLength; k++){
                if( i+k-2<cathetusLength){
                    System.out.print(k);
                }
            }
            System.out.println();   
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
