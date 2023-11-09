import java.util.ArrayList;
import java.time.LocalDateTime;

public class OrderManager {
    private ArrayList<Food> foods;
    private String customerName;

    public OrderManager(String customerName) {
        this.customerName = customerName;
        this.foods = new ArrayList<>();
    }

    public void addItem(Food food) {
        this.foods.add(food);
    }

    public int getTotalPrice() {
        return this.foods.stream().mapToInt(food -> food.getPrice()).sum();
    }

    @Override
    public String toString() {
        StringBuilder orders = new StringBuilder();
        for (Food food : this.foods) {
            orders.append(food.getFoodName()).append(" -> ").append(food.getPrice()).append("\n");
        }
        return "Customer: " + customerName + "\nOrders are:\n" + orders.toString() + "Total Price: " + this.getTotalPrice();
    }
}