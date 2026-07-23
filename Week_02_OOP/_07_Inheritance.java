class Employee_example {

    void work() {

        System.out.println("Employee is Working");

    }

}

public class _07_Inheritance extends Employee_example {

    void conductMeeting() {

        System.out.println("Manager is Conducting Meeting");

    }

    public static void main(String[] args) {

        _07_Inheritance manager =
                new _07_Inheritance();

        manager.work();

        manager.conductMeeting();

    }

}