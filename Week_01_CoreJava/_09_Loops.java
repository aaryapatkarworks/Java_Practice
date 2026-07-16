import java.util.Scanner;

 class _09_Loops {

        public static void main(String[] args) {

            // For Loop - Used when the number of iterations is known
            System.out.println("For Loop:");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Count = " + i);
            }


            // While Loop - Runs as long as the condition is true
            System.out.println("\nWhile Loop:");

            int j = 1;

            while (j <= 5) {
                System.out.println("Count = " + j);
                j++;
            }


            // Do-While Loop - Executes at least once
            Scanner scanner = new Scanner(System.in);
            String input;

            System.out.println("\nDo-While Loop:");

            do {
                System.out.print("Type 'quit' to exit: ");
                input = scanner.next().toLowerCase();

                System.out.println("You entered: " + input);

            } while (!input.equals("quit"));


            // Break - Stops the loop immediately
            System.out.println("\nBreak Statement:");

            for (int i = 1; i <= 10; i++) {

                if (i == 6)
                    break;

                System.out.println(i);
            }


            // Continue - Skips the current iteration
            System.out.println("\nContinue Statement:");

            for (int i = 1; i <= 10; i++) {

                if (i == 6)
                    continue;

                System.out.println(i);
            }


            // For-Each Loop - Used to access every element of an array
            System.out.println("\nFor-Each Loop:");

            String[] fruits = {"Apple", "Mango", "Orange", "Banana"};

            for (String fruit : fruits) {
                System.out.println(fruit);
            }

            scanner.close(); // Close the Scanner

        }

}
