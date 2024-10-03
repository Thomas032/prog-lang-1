import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        int maxStars = 7;
        int starCount = 1;
        
        for(int i=0; i<4; i++){
            int padding = (maxStars-starCount) / 2;

            for(int j=0; j<padding+starCount; j++){
                if(j<padding){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
            starCount+=2;
        }
    }
}
