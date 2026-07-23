import java.util.Scanner;

public class _08_CustomException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Attendance Percentage: ");
            int attendance = sc.nextInt();

            if (attendance < 75) {

                throw new InvalidAttendanceException(
                        "Attendance below 75%. Exam registration not allowed."
                );

            }

            System.out.println("Student is eligible for exam registration.");

        }

        catch (InvalidAttendanceException e) {

            System.out.println(e.getMessage());

        }

        finally {

            sc.close();

        }

    }

}