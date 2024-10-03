import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        int pyramidHeight = 6;

        for(int i=1; i<=pyramidHeight; i++){
            int padding = pyramidHeight - i;
            for(int j=0; j<padding+i; j++){
                if(j < padding){
                    System.out.print(" ");
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
