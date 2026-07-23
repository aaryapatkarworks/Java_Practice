public class _06_WrapperUtilityMethods {

    public static void main(String[] args) {

        Integer employee1 = 101;
        Integer employee2 = 101;

        System.out.println("Equals : " + employee1.equals(employee2));

        Integer salary1 = 45000;
        Integer salary2 = 55000;

        System.out.println("Compare : " + salary1.compareTo(salary2));

        System.out.println("Maximum Salary : " + Integer.max(salary1, salary2));

        System.out.println("Minimum Salary : " + Integer.min(salary1, salary2));

        System.out.println("Total Salary : " + Integer.sum(salary1, salary2));

    }

}