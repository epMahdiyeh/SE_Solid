import PaymentServices.PhoneOrderService;
import PaymentServices.OrderService;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderService orderService = null;
        String customerName;
        Order order;
        int customerAnswerForOrder = 0;
        int customerAnswerForPaymentMethod = 0;

        System.out.println("Enter Customer Name : ");
        customerName = scanner.nextLine();
        order = new Order(customerName);

        while (customerAnswerForOrder != 3) {
            System.out.println("For Ordering Sandwich enter 1.");
            System.out.println("For Ordering Pizza enter 2.");
            System.out.println("For submit your order enter 3");
            customerAnswerForOrder = scanner.nextInt();

            if (customerAnswerForOrder == 1) {
                order.addItem(new Food("sandwich", 1000));
            } else if (customerAnswerForOrder == 2) {
                order.addItem(new Food("pizza", 2000));
            }
        }

        System.out.println("Enter Your Payment Method (1 for online, 2 for on-site, 3 for phone):");
        customerAnswerForPaymentMethod = scanner.nextInt();

        if (customerAnswerForPaymentMethod == 1) {
            orderService = new OnlineOrderService();
            orderService.onlineOrderRegister(customerName);

            orderService = new PhoneOrderService();
            orderService.onlineOrderRegister(customerName);
        } else if (customerAnswerForPaymentMethod == 2) {
            orderService = new OnSiteOrderService();
            orderService.onSiteOrderRegister(customerName);

            orderService = new PhoneOrderService();
            orderService.onSiteOrderRegister(customerName);
        } else if (customerAnswerForPaymentMethod == 3) {
            orderService = new PhoneOrderService();
            orderService.phoneOrderRegister(customerName);
        }

        System.out.println("Pay Price:");
        if (orderService instanceof PhoneOrderService) {
            orderService.phoneOrderPayment(order.getTotalPrice());
        } else if (orderService instanceof OnlineOrderService) {
            orderService.onlineOrderPayment(order.getTotalPrice());
        } else if (orderService instanceof OnSiteOrderService) {
            orderService.onSiteOrderPayment(order.getTotalPrice());
        }
        System.out.println(order);
    }
}
