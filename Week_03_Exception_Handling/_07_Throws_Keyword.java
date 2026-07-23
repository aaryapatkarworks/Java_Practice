import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _07_Throws_Keyword {

    public static void readStudentFile() throws FileNotFoundException {

        File file = new File("students.txt");

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }

    public static void main(String[] args) {

        try {

            readStudentFile();

        }

        catch (FileNotFoundException e) {

            System.out.println("Student file not found.");

        }

    }
}