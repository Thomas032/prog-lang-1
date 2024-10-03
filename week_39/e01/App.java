import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which multiplication table to show? ");
        int table_id = scanner.nextInt();
        scanner.close();

        for(int i=0; i<=10; i++){
            System.out.printf("%d x %d = %d\n", i, table_id, (table_id*i));
        }
    }
}
