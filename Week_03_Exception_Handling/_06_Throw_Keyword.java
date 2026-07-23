import java.util.Scanner;

public class _06_Throw_Keyword {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int balance = 5000;

            try {

                System.out.print("Enter withdrawal amount: ");
                int amount = sc.nextInt();

                if (amount > balance) {

                    throw new ArithmeticException("Insufficient Balance!");

                }

                balance -= amount;

                System.out.println("Withdrawal Successful.");
                System.out.println("Remaining Balance: ₹" + balance);

            }

            catch (ArithmeticException e) {

                System.out.println(e.getMessage());

            }

            finally {

                sc.close();

            }
        }
}
