import java.text.NumberFormat;
import java.util.Scanner;

public class _MiniProject_Mortgage_Calculator {

    public static void main(String[] args) {

        // Constants used in calculations
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        // Take loan amount from the user
        double principal;

        while (true) {

            System.out.print("Principal Amount (₹1,000 - ₹1,00,00,000): ");
            principal = scanner.nextDouble();

            if (principal >= 1_000 && principal <= 10_000_000)
                break;

            System.out.println("Please enter a valid amount.\n");
        }

        // Take annual interest rate
        double annualInterest;

        while (true) {

            System.out.print("Annual Interest Rate (%): ");
            annualInterest = scanner.nextDouble();

            if (annualInterest > 0 && annualInterest <= 30)
                break;

            System.out.println("Please enter a valid interest rate.\n");
        }

        // Take loan period in years
        int years;

        while (true) {

            System.out.print("Loan Period (Years): ");
            years = scanner.nextInt();

            if (years > 0 && years <= 40)
                break;

            System.out.println("Please enter a valid loan period.\n");
        }

        // Convert annual values into monthly values
        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        // Calculate monthly mortgage payment
        double mortgage =
                principal *
                        (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                        /
                        (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        // Format the monthly payment as currency
        String result = NumberFormat.getCurrencyInstance().format(mortgage);

        // Display the final summary
        System.out.println("\n----------- Mortgage Summary -----------");
        System.out.println("Loan Amount      : ₹" + principal);
        System.out.println("Interest Rate    : " + annualInterest + "%");
        System.out.println("Loan Period      : " + years + " Years");
        System.out.println("Monthly Payment  : " + result);

        scanner.close();

    }

}