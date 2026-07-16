import java.util.Arrays;

public class Arrays_Arithmetic_03 {

    public static void main(String[] args){

        // Arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 20;
        numbers[3] = 50;
        System.out.println(Arrays.toString(numbers)); // Print array

        int[] numbers_1 = {40, 28, 38, 36};
        System.out.println(Arrays.toString(numbers_1)); // Original array
        System.out.println(numbers_1.length); // Array length
        Arrays.sort(numbers_1); // Sort the array
        System.out.println(Arrays.toString(numbers_1)); // Sorted array

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

        // Increment operators
        int x = 5;
        x++;
        System.out.println("x after x++ = " + x);

        int y = x++;
        System.out.println("y = " + y);
        System.out.println("x after assigning y = " + x);

        int z = ++x;
        System.out.println("z = " + z);
        System.out.println("x after ++x = " + x);

        // Compound assignment operators
        int a = 8;
        a += 2;
        System.out.println("a after += 2 : " + a);

        a -= 1;
        System.out.println("a after -= 1 : " + a);

        a *= 4;
        System.out.println("a after *= 4 : " + a);

        a /= 3;
        System.out.println("a after /= 3 : " + a);

        int calculate = (10 + 9) * 4 / 2;
        System.out.println("Calculation = " + calculate);

        // Casting

        // Implicit casting
        // byte > short > int > long > float > double

        String c = "1";
        System.out.println("String c = " + c);

        System.out.println(Integer.parseInt(c) + 2);

        double d = 3.3; // Decimal value

        int e = (int)d + 3; // Explicit casting
        System.out.println("Value of d = " + d);
        System.out.println("Value of e = " + e);

    }
}