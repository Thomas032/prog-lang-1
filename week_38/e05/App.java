import java.util.Scanner;

public class App {
    // Define the Days enum outside of the main method
    enum Days {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day: ");
        
        String inputDay = scanner.nextLine().trim(); // read the day and remove the spaces
        
        // Convert the input string to a Days enum value
        Days day;
        try {
            day = Days.valueOf(inputDay); // Convert the string to the corresponding enum value
        } catch (Exception e) {
            System.out.println("Invalid day entered.");
            scanner.close();
            return;
        }

        switch (day) {
            case Monday:
                System.out.println("Start of the work week!");
                break;
            case Tuesday:
                System.out.println("Second day of the work week.");
                break;
            case Wednesday:
                System.out.println("Midweek already!");
                break;
            case Thursday:
                System.out.println("Almost the weekend!");
                break;
            case Friday:
                System.out.println("Last day of the work week!");
                break;
            case Saturday:
                System.out.println("It's the weekend, enjoy!");
                break;
            case Sunday:
                System.out.println("Preparation for the week ahead.");
                break;
        }
        
        scanner.close();
    }
}
