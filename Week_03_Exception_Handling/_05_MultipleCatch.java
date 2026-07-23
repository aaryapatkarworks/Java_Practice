import java.util.ArrayList;
import java.util.Scanner;

public class _05_MultipleCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> results = new ArrayList<>();

        try {

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {

                System.out.print("Enter marks of Student " + i + ": ");
                int marks = sc.nextInt();

                int percentage = (marks * 100) / 100;   // Change 100 to 0 to test ArithmeticException

                if (percentage >= 40) {
                    results.add("Student " + i + " : PASS");
                } else {
                    results.add("Student " + i + " : FAIL");
                }
            }

            // Accessing an index or an invalid index intentionally
            System.out.print("\nEnter student number to view result: ");
            int studentNumber = sc.nextInt();

            System.out.println(results.get(studentNumber - 1));

        }

        catch (ArithmeticException e) {

            System.out.println("Arithmetic Error : Cannot divide by zero.");

        }

        catch (IndexOutOfBoundsException e) {

            System.out.println("Result does not exist for the requested student.");

        }

        catch (Exception e) {

            System.out.println("Unexpected Error : " + e.getMessage());

        }

        finally {

            System.out.println("\nProgram Finished Successfully.");

            sc.close();

        }
    }
}