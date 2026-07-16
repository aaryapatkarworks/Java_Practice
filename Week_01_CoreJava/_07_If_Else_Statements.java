public class _07_If_Else_Statements {

        public static void main(String[] args) {

            int temperature = 32;

            // Check temperature
            if (temperature > 30) {
                System.out.println("It's a hot day");
                System.out.println("Drink water");
            }

            else if (temperature > 20) {
                System.out.println("Beautiful day");
            }

            else {
                System.out.println("Cold day");
            }

            System.out.println("Done");

            int income = 120000;

            // Store the condition in a boolean variable
            boolean hasHighIncome = income > 100000;

            System.out.println(hasHighIncome);


        }

}
