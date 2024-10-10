import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter a name: ");
            String name = scanner.nextLine().strip();
    
            if(name.equals("quit")){
                break;
            }

            String surname = scanner.nextLine().strip();
            
            if(surname.equals("quit")){
                break;
            }
        }
    }
}