public class _01_WrapperClasses {

        public static void main(String[] args) {

            int age = 21;
            Integer wrappedAge = Integer.valueOf(age);

            System.out.println("Primitive : " + age);
            System.out.println("Wrapper   : " + wrappedAge);

        }
}
