class Delivery {

    void calculateDeliveryCharge() {

        System.out.println("Standard Delivery Charge : ₹40");

    }

}

public class _09_Method_Overriding extends Delivery {

    @Override
    void calculateDeliveryCharge() {

        System.out.println("Premium Members : Free Delivery");

    }

    public static void main(String[] args) {

        _09_Method_Overriding customer =
                new _09_Method_Overriding();

        customer.calculateDeliveryCharge();

    }

}