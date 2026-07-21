class Employee {

    void work() {

        System.out.println("Employee is Working");

    }

}

public class _07_Inheritance extends Employee {

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