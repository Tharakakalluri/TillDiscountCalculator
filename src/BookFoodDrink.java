public class BookFoodDrink extends Item {
    public BookFoodDrink(String name, double price, boolean clearance) {
        super(name, price, clearance);
    }

    @Override
    public double getDiscountedPrice() {
        double discountedPrice = Math.round(price * 0.95 * 100.0) / 100.0; // 5% discount
        return applyClearanceDiscount(discountedPrice);
    }
}
