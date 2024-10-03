import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        if(!(0 <= score && score <= 100 )){
            // score is out of bounds
            System.out.println("Invalid score. Please enter a number between 0 and 100.");
            return;
        }

        if(score >= 90){
            System.out.println("Excellent!");
        }
        else if(score >= 70){
            System.out.println("Good Job!");
        }
        else if(score >= 50){
            System.out.println("Needs Improvement.");
        }
        else{
            System.out.println("Fail");
        }

        scanner.close();
    }
}