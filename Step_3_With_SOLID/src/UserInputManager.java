import java.util.Scanner;

public class UserInputManager {
    private Scanner scanner;

    public UserInputManager() {
        this.scanner = new Scanner(System.in);
    }

    public String getCustomerName() {
        System.out.println("Enter Customer Name:");
        return scanner.nextLine();
    }

    public int getCustomerAnswerForOrder() {
        System.out.println("For Ordering Sandwich enter 1.\nFor Ordering Pizza enter 2.\nFor submit your order enter 3");
        return scanner.nextInt();
    }

    public int getCustomerAnswerForPaymentMethod() {
        System.out.println("Enter Your Payment Method (1 for online, 2 for on-site, 3 for phone order):");
        return scanner.nextInt();
    }
}
