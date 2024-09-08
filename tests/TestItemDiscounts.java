import static org.junit.Assert.*;
import org.junit.Test;

public class TestItemDiscounts {

    @Test
    public void testBookDiscount() {
        Item book = new BookFoodDrink("book", 14.49, false);
        assertEquals(13.77, book.getDiscountedPrice(), 0.01);
    }

    @Test
    public void testShirtDiscount() {
        Item shirt = new Clothing("shirt", 19.99, false);
        assertEquals(15.99, shirt.getDiscountedPrice(), 0.01);
    }

    @Test
    public void testChocolateDiscount() {
        Item chocolate = new BookFoodDrink("chocolate bar", 1.00, false);
        assertEquals(0.95, chocolate.getDiscountedPrice(), 0.01);
    }

    @Test
    public void testClearanceDiscount() {
        Item clearanceChocolate = new BookFoodDrink("clearance chocolate bar", 2.00, true);
        assertEquals(1.52, clearanceChocolate.getDiscountedPrice(), 0.01);
    }

    @Test
    public void testOtherItemDiscount() {
        Item perfume = new OtherItem("bottle of perfume", 27.99, false);
        assertEquals(27.15, perfume.getDiscountedPrice(), 0.01);
    }
}
