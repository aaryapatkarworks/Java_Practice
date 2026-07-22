abstract class FoodOrder {

    String customerName;
    double amount;

    FoodOrder(String customerName,
              double amount) {

        this.customerName = customerName;
        this.amount = amount;

    }

    void displayOrder() {

        System.out.println("Customer : " + customerName);
        System.out.println("Amount   : ₹" + amount);

    }

    abstract void deliveryTime();

}

class PizzaOrder extends FoodOrder {

    PizzaOrder(String customerName,
               double amount) {

        super(customerName,
                amount);

    }

    @Override
    void deliveryTime() {

        System.out.println("Delivery Time : 30 Minutes");

    }

}

public class _11_Abstract_Class {

    public static void main(String[] args) {

        PizzaOrder order1 =
                new PizzaOrder(
                        "Aarya Patkar",
                        650
                );

        order1.displayOrder();

        order1.deliveryTime();

    }

}