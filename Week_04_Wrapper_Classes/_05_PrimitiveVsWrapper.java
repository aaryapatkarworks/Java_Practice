public class _05_PrimitiveVsWrapper {

    public static void main(String[] args) {

        // Primitive Data Type

        int age = 21;

        // Wrapper Class

        Integer employeeAge = 21;

        System.out.println("Primitive Value : " + age);
        System.out.println("Wrapper Value   : " + employeeAge);

        // Wrapper can store null

        Integer salary = null;

        System.out.println("Salary : " + salary);

    }

}