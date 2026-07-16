import java.util.Scanner;

public class _08_Switch_Statements {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take role as input
        System.out.print("Enter your role (Admin, Moderator, Student, Guest): ");
        String role = scanner.nextLine();

        // Check the entered role
        switch (role) {

            case "Admin":
                System.out.println("You're an admin.");
                break;

            case "Moderator":
                System.out.println("You're a moderator.");
                break;

            case "Student":
                System.out.println("You're a student.");
                break;

            case "Guest":
                System.out.println("You're a guest.");
                break;

            default:
                System.out.println("Role not found.");
        }

        scanner.close();

    }

}