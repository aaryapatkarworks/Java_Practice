public class _03_Unboxing {

    public static void main(String[] args) {

        // Wrapper Objects

        Integer employeeId = 101;
        Double salary = 45000.50;

        // Wrapper Objects are automatically converted into primitive values

        int id = employeeId;
        double empSalary = salary;

        System.out.println("Employee ID : " + id);
        System.out.println("Salary      : " + empSalary);

        // Internally Java does:
        // int id = employeeId.intValue();
        // double empSalary = salary.doubleValue();

    }

}