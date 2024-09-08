public abstract class Item {
    protected String name;
    protected double price;
    protected boolean clearance;

    public Item(String name, double price, boolean clearance) {
        this.name = name;
        this.price = price;
        this.clearance = clearance;
    }

    public abstract double getDiscountedPrice();

    protected double applyClearanceDiscount(double price) {
        if (clearance) {
            return Math.round(price * 0.8 * 100.0) / 100.0; // Additional 20% off
        }
        return price;
    }
}
