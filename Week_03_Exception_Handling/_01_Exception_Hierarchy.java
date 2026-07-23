public class _01_Exception_Hierarchy {

        public static void main(String[] args) {

            System.out.println(Exception.class.getSuperclass());

            System.out.println(RuntimeException.class.getSuperclass());

            System.out.println(ArithmeticException.class.getSuperclass());

            System.out.println(Error.class.getSuperclass());

            System.out.println(Throwable.class.getSuperclass());
        }

}
