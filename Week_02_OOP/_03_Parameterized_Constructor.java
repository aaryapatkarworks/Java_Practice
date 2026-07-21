public class _03_Parameterized_Constructor {

    String name;
    int age;
    String branch;

    // Parameterized Constructor
    _03_Parameterized_Constructor(String name, int age, String branch) {

        this.name = name;
        this.age = age;
        this.branch = branch;

    }

    void displayInfo() {

        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Branch : " + branch);
        System.out.println();

    }

    public static void main(String[] args) {

        _03_Parameterized_Constructor student1 =
                new _03_Parameterized_Constructor(
                        "Aarya Patkar",
                        21,
                        "CSE AI & DS"
                );

        _03_Parameterized_Constructor student2 =
                new _03_Parameterized_Constructor(
                        "Pranav More",
                        21,
                        "CSE CS & BS"
                );

        student1.displayInfo();
        student2.displayInfo();

    }

}