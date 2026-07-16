import java.util.Date;      // Import Date class
//import java.awt.*;        // Import AWT classes (currently not used)

public class _02_Variables_Datatypes_Strings {

    public static void main(String[] args){

        // Variables
        String name = "Aarya Ravindra Patkar";             // Stores name
        String college_name = "MIT World Peace University"; // Stores college name
        int prn = 1032232017;                              // Stores PRN
        byte age = 21;                                     // Stores age
        double cgpa = 8.52;                                // Stores CGPA

        Date now = new Date();      // Gets current date and time
        System.out.println(now);    // Prints current date and time

        // Reference type example
        //Point point1 = new Point(1,1);   // Creates a Point object
        //Point point2 = point1;           // Both point1 and point2 refer to the same object
        //point1.x = 2;                    // Changes x value
        //System.out.println(point2);      // Prints updated point

        // Print variable values
        System.out.println("Name: " + name);
        System.out.println("College: " + college_name);
        System.out.println("Prn: " + prn);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);

        // Strings
        String addStrings = "Hey!  " + "  How are you?"; // Joins two strings

        System.out.println(addStrings);                           // Prints the string
        System.out.println(addStrings.endsWith("How are you?"));  // Checks if it ends with "How are you?"
        System.out.println(addStrings.length());                  // Returns string length
        System.out.println(addStrings.indexOf("H"));              // Finds first index of "H"
        System.out.println(addStrings.indexOf("happy"));          // Returns -1 if not found
        System.out.println(addStrings.replace("!","!!"));         // Replaces "!" with "!!"
        System.out.println(addStrings.toUpperCase());             // Converts to uppercase
        System.out.println(addStrings.toLowerCase());             // Converts to lowercase
        System.out.println(addStrings.toUpperCase());             // Converts to uppercase again
        System.out.println(addStrings.trim());                    // Removes leading/trailing spaces
        System.out.println(addStrings);                           // Prints original string
        String message= "\"This is VGI\". \n I am an intern here! \t and so on...";
        System.out.println(message);
    }
}