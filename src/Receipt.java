import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<Item> items = new ArrayList<>();
    private double totalSavings = 0.0;

    public void addItem(Item item) {
        double originalPrice = item.price;
        double discountedPrice = item.getDiscountedPrice();
        items.add(item);
        totalSavings += Math.round((originalPrice - discountedPrice) * 100.0) / 100.0;
    }

    public void printReceipt() {
        double totalCost = 0.0;
        System.out.println("\n" );
        for (Item item : items) {
            double discountedPrice = item.getDiscountedPrice();
            totalCost += discountedPrice;
            System.out.println(item.name + " at " + String.format("%.2f", discountedPrice));
        }
        System.out.println("Total: " + String.format("%.2f", totalCost));
        System.out.println("You saved: " + String.format("%.2f", totalSavings));
    }
}
