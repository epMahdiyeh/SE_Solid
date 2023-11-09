public class Main {
    public static void main(String[] args) {
        UserInputManager userInputManager = new UserInputManager();
        String customerName = userInputManager.getCustomerName();
        OrderManager orderManager = new OrderManager(customerName);
        PaymentMethodManager paymentMethodManager = new PaymentMethodManager();

        int customerAnswerForOrder = 0;
        int customerAnswerForPaymentMethod;

        do {
            customerAnswerForOrder = userInputManager.getCustomerAnswerForOrder();
            if (customerAnswerForOrder == 1) {
                orderManager.addItem(new Food("sandwich", 1000));
            } else if (customerAnswerForOrder == 2) {
                orderManager.addItem(new Food("pizza", 2000));
            }
        } while (customerAnswerForOrder != 3);

        customerAnswerForPaymentMethod = userInputManager.getCustomerAnswerForPaymentMethod();
        OrderService orderService = paymentMethodManager.selectOrderService(customerAnswerForPaymentMethod);
        orderService.register(customerName);
        orderService.pay(orderManager.getTotalPrice());

        System.out.println(orderManager);
    }
}
