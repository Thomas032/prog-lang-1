import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number (0 to quit): ");
            int num = scanner.nextInt();
    
            if(num == 0){
                return;
            }
    
            if(num % 2 == 0){
                System.out.println("Even number");
            }
            else{
                System.out.println("Odd number");
            }
        }
    }
}
