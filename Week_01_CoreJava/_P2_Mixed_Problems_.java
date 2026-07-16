public class _P2_Mixed_Problems_ {

        public static void main(String[] args) {

            // Swap using third variable
            int a = 10;
            int b = 20;

            System.out.println("Before Swap");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            int temp = a;   // Store a in temp
            a = b;          // Copy b to a
            b = temp;       // Copy temp to b

            System.out.println("After Swap");
            System.out.println("a = " + a);
            System.out.println("b = " + b);


            // Swap without using third variable
            int x = 15;
            int y = 25;

            System.out.println("\nBefore Swap");
            System.out.println("x = " + x);
            System.out.println("y = " + y);

            x = x + y;
            y = x - y;
            x = x - y;

            System.out.println("After Swap");
            System.out.println("x = " + x);
            System.out.println("y = " + y);


            // Double to int (Explicit Casting)
            double number = 25.89;
            int intValue = (int) number;

            System.out.println("\nDouble = " + number);
            System.out.println("Integer = " + intValue);


            // Int to double (Implicit Casting)
            int num = 25;
            double doubleValue = num;

            System.out.println("\nInteger = " + num);
            System.out.println("Double = " + doubleValue);


            // Simple Interest
            double principal = 10000;
            double rate = 8;
            double time = 2;

            double interest = (principal * rate * time) / 100;

            System.out.println("\nSimple Interest = " + interest);


            // Average of three numbers
            int n1 = 20;
            int n2 = 30;
            int n3 = 40;

            double average = (n1 + n2 + n3) / 3.0;

            System.out.println("Average = " + average);

        }

}
