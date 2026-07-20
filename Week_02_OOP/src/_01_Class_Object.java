public class _01_Class_Object {
// Student Class
    String name ;
    byte age ;
    String branch ;

    void displayInfo(){
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Branch : " + branch);
        System.out.println();
    }

public static void main(String[] args){

        _01_Class_Object s1 = new _01_Class_Object();
        s1.name = "Aarya";
        s1.age = 21;
        s1.branch = "CSE AI-DS";

        _01_Class_Object s2 = new _01_Class_Object();
        s2.name = "Pahel";
        s2.age = 20;
        s2.branch = "CSE CSF";

        _01_Class_Object s3 = new _01_Class_Object();
        s3.name = "Shelly";
        s3.age = 21;
        s3.branch = "CSE Core";

        s1.displayInfo(); // invoke displayInfo() method
        s2.displayInfo();
        s3.displayInfo();

}
}
