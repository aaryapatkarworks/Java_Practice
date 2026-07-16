import java.util.Scanner;

public class _06_User_Input {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Take name as input
        System.out.print("Name: ");
        String result1 = scanner.nextLine().trim();
        System.out.println("I'm " + result1);

        // Take age as input
        System.out.print("Age: ");
        int result2 = scanner.nextInt();
        System.out.println("My Age is " + result2);

        // Take CGPA as input
        System.out.print("CGPA: ");
        double result3 = scanner.nextDouble();
        System.out.println("I've scored " + result3 + " CGPA");



    }

}