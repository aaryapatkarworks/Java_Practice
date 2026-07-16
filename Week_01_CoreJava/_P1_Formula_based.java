public class _P1_Formula_based {

        public static void main(String[] args) {

            // Area of Circle
            double radius = 7;
            double circleArea = 3.14 * radius * radius;

            System.out.println("Radius = " + radius);
            System.out.println("Area of Circle = " + circleArea);

            // Area of Rectangle
            int length = 10;
            int breadth = 5;
            int rectangleArea = length * breadth;

            System.out.println("\nLength = " + length);
            System.out.println("Breadth = " + breadth);
            System.out.println("Area of Rectangle = " + rectangleArea);

            // Perimeter of Rectangle
            int perimeter = 2 * (length + breadth);

            System.out.println("\nPerimeter of Rectangle = " + perimeter);

            // Celsius to Fahrenheit
            double celsius = 30;
            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("\nCelsius = " + celsius);
            System.out.println("Fahrenheit = " + fahrenheit);

            // Fahrenheit to Celsius
            double fahrenheitValue = 98.6;
            double celsiusValue = (fahrenheitValue - 32) * 5 / 9;

            System.out.println("\nFahrenheit = " + fahrenheitValue);
            System.out.println("Celsius = " + celsiusValue);

        }
    }

