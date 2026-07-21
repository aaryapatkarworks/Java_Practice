public class _04_This_Keyword {

    String brand;
    String processor;
    int ram;

    _04_This_Keyword(String brand,
                     String processor,
                     int ram) {

        this.brand = brand;
        this.processor = processor;
        this.ram = ram;

    }

    void displayLaptop() {

        System.out.println("Brand     : " + brand);
        System.out.println("Processor : " + processor);
        System.out.println("RAM       : " + ram + " GB");
        System.out.println();

    }

    public static void main(String[] args) {

        _04_This_Keyword laptop =
                new _04_This_Keyword(
                        "Lenovo",
                        "Ryzen 7",
                        16
                );

        laptop.displayLaptop();

    }

}