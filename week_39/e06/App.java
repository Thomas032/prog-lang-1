import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int generatedNum = rand.nextInt(0, 10);

        while(true){
            System.out.print("Guess a number: ");
            int num = scanner.nextInt();

            if(num == generatedNum){
                System.out.println("SUCCESS!");
                break;
            }

            if(num > generatedNum){
                System.out.println("Too high");
            }else{
                System.out.println("Too low");
            }
        }
    }
}
