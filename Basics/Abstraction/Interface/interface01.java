interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment using Credit Card");
    }
}

class Bkash implements Payment {
    public void pay() {
        System.out.println("Payment using bKash");
    }
}

public class interface01 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new Bkash();

        p1.pay();
        p2.pay();
    }
}