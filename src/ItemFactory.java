public class ItemFactory {
    public static Item createItem(String name, double price, boolean clearance) {
        if (name.toLowerCase().contains("book") || 
            name.toLowerCase().contains("food") || 
            name.toLowerCase().contains("drink") || 
            name.toLowerCase().contains("chocolate")) {
            return new BookFoodDrink(name, price, clearance);
        } else if (name.toLowerCase().contains("shirt") || 
                   name.toLowerCase().contains("dress") || 
                   name.toLowerCase().contains("clothing")) {
            return new Clothing(name, price, clearance);
        } else {
            return new OtherItem(name, price, clearance);
        }
    }
}
