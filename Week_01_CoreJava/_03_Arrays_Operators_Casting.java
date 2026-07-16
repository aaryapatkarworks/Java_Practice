import java.util.Arrays;

public class _03_Arrays_Operators_Casting {

    public static void main(String[] args){

        // Arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 20;
        numbers[3] = 50;
        System.out.println(Arrays.toString(numbers));

        int[] numbers_1 = {40, 28, 38, 36};
        System.out.println(Arrays.toString(numbers_1));
        System.out.println(numbers_1.length);
        Arrays.sort(numbers_1);
        System.out.println(Arrays.toString(numbers_1));

        // 2D Array
        int[][] numbers_multi = new int[2][4];
        numbers_multi[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers_multi));

        // 3D Array
        int[][][] numbers_multi_1 = new int[2][4][3];
        numbers_multi[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers_multi_1));

        // Another 2D Array
        int[][] numbers_multi_2 = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(numbers_multi_2));

        // Constants
        final float PI = 3.14F;
        final double GRAVITY = 9.8;
        System.out.println(PI);
        System.out.println(GRAVITY);

        // Arithmetic Operators
        int add = 10 + 798;
        System.out.println("Addition = " + add);

        int sub = 8652 - 3597;
        System.out.println("Subtraction = " + sub);

        int multiply = 9 * 56;
        System.out.println("Multiplication = " + multiply);

        int divide = 45 / 3;
        System.out.println("Division = " + divide);

        double divide_1 = (double)38 / (double)7;
        System.out.println("Decimal Division = " + divide_1);

        // Increment Operators
        int x = 5;
        x++;
        System.out.println("x after x++ = " + x);

        int y = x++;
        System.out.println("y = " + y);
        System.out.println("x after assigning y = " + x);

        int z = ++x;
        System.out.println("z = " + z);
        System.out.println("x after ++x = " + x);

        // Assignment Operators
        int assign = 10;

        assign += 5; // assign = assign + 5
        System.out.println("+= : " + assign);

        assign -= 3; // assign = assign - 3
        System.out.println("-= : " + assign);

        assign *= 2; // assign = assign * 2
        System.out.println("*= : " + assign);

        assign /= 4; // assign = assign / 4
        System.out.println("/= : " + assign);

        assign %= 3; // assign = assign % 3
        System.out.println("%= : " + assign);

        // Comparison (Relational) Operators
        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 == num2 : " + (num1 == num2));
        System.out.println("num1 != num2 : " + (num1 != num2));
        System.out.println("num1 > num2 : " + (num1 > num2));
        System.out.println("num1 < num2 : " + (num1 < num2));
        System.out.println("num1 >= num2 : " + (num1 >= num2));
        System.out.println("num1 <= num2 : " + (num1 <= num2));

        // Logical Operators
        boolean isStudent = true;
        boolean hasID = false;

        System.out.println("&& : " + (isStudent && hasID));
        System.out.println("|| : " + (isStudent || hasID));
        System.out.println("! : " + (!isStudent));

        // Bitwise Operators
        int p = 5;
        int q = 3;

        System.out.println("& : " + (p & q));
        System.out.println("| : " + (p | q));
        System.out.println("^ : " + (p ^ q));
        System.out.println("~p : " + (~p));

        // Shift Operators
        int value = 8;

        System.out.println("<< 2 : " + (value << 2));
        System.out.println(">> 2 : " + (value >> 2));
        System.out.println(">>> 2 : " + (value >>> 2));

        // Ternary Operator
        int marks = 75;

        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("Result : " + result);

        // Casting

        // Implicit casting:
        // byte -> short -> int -> long -> float -> double

        String c = "1";
        System.out.println(Integer.parseInt(c) + 2);

        double d = 3.3;

        // Explicit casting
        int e = (int) d + 3;
        System.out.println("Value of d = " + d);
        System.out.println("Value of e = " + e);

    }
}