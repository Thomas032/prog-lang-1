import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        int sum = 0;

        while(true){
            System.out.print("Enter a test score (-1 to quit): ");
            int num = scanner.nextInt();
    
            if(num == -1){
                break;
            }

            N++;
            sum += num;
            System.out.printf("Average: %.2f\n", (double)sum/N);
        }

        System.out.printf("Summary\n-------\nTests: %d\nAverage:%.2f\n",N, (double)sum/N);
    }
}
