class Vehicle {

    String brand;

    Vehicle(String brand) {

        this.brand = brand;

        System.out.println("Vehicle Constructor Called");

    }

}

public class _08_Super_Keyword extends Vehicle {

    String model;

    _08_Super_Keyword(String brand,
                      String model) {

        super(brand);

        this.model = model;

    }

    void displayCar() {

        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);

    }

    public static void main(String[] args) {

        _08_Super_Keyword car =
                new _08_Super_Keyword(
                        "Toyota",
                        "Fortuner"
                );

        car.displayCar();

    }

}