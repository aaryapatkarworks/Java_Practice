public class _04_ParseMethods {

    public static void main(String[] args) {

        String age = "21";
        String salary = "45000.50";
        String active = "true";

        // Converting String into Primitive Data Types

        int employeeAge = Integer.parseInt(age);
        double employeeSalary = Double.parseDouble(salary);
        boolean isActive = Boolean.parseBoolean(active);

        System.out.println("Age    : " + employeeAge);
        System.out.println("Salary : " + employeeSalary);
        System.out.println("Active : " + isActive);

        // Converting Primitive into Wrapper Object

        Integer id = Integer.valueOf(101);

        System.out.println("Employee ID : " + id);

        // Converting Primitive into String

        String marks = Integer.toString(95);

        System.out.println("Marks : " + marks);

    }

}