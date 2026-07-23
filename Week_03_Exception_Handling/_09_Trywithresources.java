import java.util.Scanner;

public class _09_Trywithresources {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            System.out.println("\nEmployee Details");
            System.out.println("----------------");
            System.out.println("Name   : " + name);
            System.out.println("Salary : ₹" + salary);

        }

        System.out.println("\nScanner closed automatically.");
    }
}