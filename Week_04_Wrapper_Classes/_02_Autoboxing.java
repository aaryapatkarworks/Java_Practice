public class _02_Autoboxing {

    public static void main(String[] args) {

        // Primitive values are automatically converted into Wrapper Objects

        Integer employeeId = 101;
        Double salary = 45000.50;
        Character grade = 'A';
        Boolean isActive = true;

        System.out.println("Employee ID : " + employeeId);
        System.out.println("Salary      : " + salary);
        System.out.println("Grade       : " + grade);
        System.out.println("Active      : " + isActive);

        // Internally Java does:
        // Integer employeeId = Integer.valueOf(101);

    }

}