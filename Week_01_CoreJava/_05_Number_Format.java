import java.text.NumberFormat;

public class _05_Number_Format {

    public static void main(String[] args) {

        // Convert number into currency format
        String result1 = NumberFormat.getCurrencyInstance().format(123456.789);
        System.out.println(result1);

        // Convert decimal into percentage
        String result2 = NumberFormat.getPercentInstance().format(0.25);
        System.out.println(result2);

        // Another percentage example
        String result3 = NumberFormat.getPercentInstance().format(0.87);
        System.out.println(result3);

    }

}