import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasDigit = false;
            boolean isLongEnough = false;

            if (input.length() >= 8) {
                isLongEnough = true;
            }

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowercase = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                }
            }

            if (hasUppercase && hasLowercase && hasDigit && isLongEnough) {
                break;
            } else {
                System.out.println(
                        "Password is invalid. Needs to be at least 8 characters long and include at least one uppercase letter.");
            }
        }

        System.out.println("Password is valid");
    }
}