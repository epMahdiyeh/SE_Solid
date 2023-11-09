package PaymentServices;

public class PhoneOrderService implements OrderService {

    @Override
    public void onSiteOrderRegister(String customerName) {
    }

    @Override
    public void onlineOrderRegister(String customerName) {
    }

    @Override
    public void onSiteOrderPayment(int foodPrice) {
    }

    @Override
    public void onlineOrderPayment(int foodPrice) {
    }

    @Override
    public void phoneOrderRegister(String customerName) {
        System.out.println("Phone order has been registered for user " + customerName);
    }

    @Override
    public void phoneOrderPayment(int foodPrice) {
        System.out.println("Phone order payment with: " + foodPrice + "Tomans");
    }
}
