public class _03_TryBlockExample {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            System.out.println("Inside try");

            int result = 10 / 2;
            int result1 = 10 / 0;

            System.out.println(result);
            System.out.println(result1);

        } catch (Exception e) {

            System.out.println("Exception Occurred");

            System.out.println(e);

            System.out.println(e.getMessage());

            e.printStackTrace();

        }

        System.out.println("Program Ended");
    }
}