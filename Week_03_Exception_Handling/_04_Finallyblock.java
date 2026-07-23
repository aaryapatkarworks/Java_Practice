public class _04_Finallyblock{

        public static void main(String[] args) {

            System.out.println("Program Started");

            try {

                System.out.println("Inside Try");

                int result = 10 / 2;

                System.out.println(result);

            } catch (Exception e) {

                System.out.println("Exception Occurred");

            } finally {

                System.out.println("Finally Block Executed");

            }

            System.out.println("Program Ended");
        }

}
