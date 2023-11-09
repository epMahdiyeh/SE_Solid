public class PaymentMethodManager {
    public OrderService selectOrderService(int customerAnswerForPaymentMethod) {
        if (customerAnswerForPaymentMethod == 1) {
            return new OnlineOrderService();
        } else if (customerAnswerForPaymentMethod == 2) {
            return new OnSiteOrderService();
        } else {
            return new PhoneOrderService();
        }
    }
}
