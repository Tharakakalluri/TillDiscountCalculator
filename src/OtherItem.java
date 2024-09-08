public class OtherItem extends Item {
    public OtherItem(String name, double price, boolean clearance) {
        super(name, price, clearance);
    }

    @Override
    public double getDiscountedPrice() {
        double discountedPrice = Math.round(price * 0.97 * 100.0) / 100.0; // 3% discount
        return applyClearanceDiscount(discountedPrice);
    }
}
