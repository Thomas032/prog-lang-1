public class App {
    public static void main(final String[] args) {
        int[] numbers = {-1, 0, 1, 9, 10};

        // prin the number and the bool value
        for(int i=0; i<numbers.length; i++) {
            int number = numbers[i];
            System.out.print(number);
            System.out.print("\t" + (number > 0));
            System.out.print("\t" + (number < 10));
            System.out.print("\t" + ((number > 0) && (number < 10)));
            System.out.print("\t" + (!(number > 0) && (number < 10)));
            System.out.println("\t" + ((number > 0) || (number < 10)));
            System.out.println();
        }

    }
}
