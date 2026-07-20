public class _02_Constructor {
    //Employee class
    String name;
    double salary;

    // constructor - created
    _02_Constructor(){
        name = "New Employee";
        salary = 25000;
    }

    // method
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

public static void main(String[] args){

        _02_Constructor employee1 = new _02_Constructor();
        employee1.name = "Aarya Patkar";
        employee1.salary = 90000;

        _02_Constructor employee2 = new _02_Constructor();
        employee2.name = "Pranav More";
        employee2.salary = 87000;

        _02_Constructor employee3 = new _02_Constructor();

        employee1.display();
        employee2.display();
        employee3.display();
}
}
