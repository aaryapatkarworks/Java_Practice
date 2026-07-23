public class _10_ExceptionPropogation {

        static void method3() {

            System.out.println("Inside Method 3");

            int result = 10 / 0;

            System.out.println(result);
        }

        static void method2() {

            System.out.println("Inside Method 2");

            method3();
        }

        static void method1() {

            System.out.println("Inside Method 1");

            method2();
        }

        public static void main(String[] args) {

            try {

                method1();

            }

            catch (ArithmeticException e) {

                System.out.println("Exception Handled in Main Method.");

            }

            System.out.println("Program Ended.");
        }

}
