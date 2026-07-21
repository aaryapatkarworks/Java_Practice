public class _06_Encapsulation {

    private String userName;
    private String plan;
    private double monthlyPrice;

    _06_Encapsulation(String userName,
                      String plan,
                      double monthlyPrice) {

        this.userName = userName;
        this.plan = plan;
        this.monthlyPrice = monthlyPrice;

    }

    String getUserName() {

        return userName;

    }

    String getPlan() {

        return plan;

    }

    double getMonthlyPrice() {

        return monthlyPrice;

    }

    void setPlan(String plan) {

        this.plan = plan;

    }

    void displaySubscription() {

        System.out.println("User Name     : " + getUserName());
        System.out.println("Plan          : " + getPlan());
        System.out.println("Monthly Price : ₹" + getMonthlyPrice());
        System.out.println();

    }

    public static void main(String[] args) {

        _06_Encapsulation user =
                new _06_Encapsulation(
                        "Aarya Patkar",
                        "Mobile",
                        149
                );

        user.displaySubscription();

        user.setPlan("Premium");

        user.displaySubscription();

    }

}