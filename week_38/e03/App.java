import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("I it weekend? (true/false): ");
        boolean isWeekend = scanner.nextBoolean();

        if(!isWeekend && (18 > age || age > 65)) {
            System.out.println("You are eligible for the discount.");
        }
        else {
            System.out.println("You are not eligible for the discount.");
        }
        scanner.close();
    }
}