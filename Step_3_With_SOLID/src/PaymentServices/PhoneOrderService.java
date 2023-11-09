public class PhoneOrderService implements OrderRegistration, OrderPayment {
    @Override
    public void register(String customerName) {
        System.out.println("Phone order registered for: " + customerName);
    }

    @Override
    public void pay(int totalPrice) {
        System.out.println("Phone order payment: " + totalPrice + " Tomans");
    }
}
