import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome test, please enter some text: ");
        String input = scanner.nextLine();

        boolean palindrome = isPalindrome(input);

        if(palindrome){
            System.out.println(input + " is a palindrome.");
        }
        else{
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String input) {
        String lowercased = input.toLowerCase();
        String unGapped = lowercased.replaceAll("\\W", "");
        String reversed = "";

        for(int i=unGapped.length()-1; i>=0; i--){
            reversed += unGapped.charAt(i);
        }

        if(reversed.equals(unGapped)){
            return true;
        }

        return false;
    }
}