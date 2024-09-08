import java.util.Scanner;

public class TillDiscountCalculator {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            int numItems = Integer.parseInt(scanner.nextLine());
            Receipt receipt = new Receipt();

            for (int i = 0; i < numItems; i++) {
                String input = scanner.nextLine();
                String[] parts = input.split(" at ");
                String itemDescription = parts[0];
                double price = Double.parseDouble(parts[1]);
                boolean clearance = itemDescription.toLowerCase().contains("clearance");

                Item item = ItemFactory.createItem(itemDescription, price, clearance);
                receipt.addItem(item);
            }

            receipt.printReceipt();
        }
    }
}
