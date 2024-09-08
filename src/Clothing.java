public class Clothing extends Item {
    public Clothing(String name, double price, boolean clearance) {
        super(name, price, clearance);
    }

    @Override
    public double getDiscountedPrice() {
        double discountedPrice = Math.round(price * 0.8 * 100.0) / 100.0; // 20% discount
        return applyClearanceDiscount(discountedPrice);
    }
}
