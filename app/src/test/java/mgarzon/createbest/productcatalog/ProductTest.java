package mgarzon.createbest.productcatalog;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

    @Test
    public void checkProductName() {
        Product aProduct = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the name of the product", "DELL MONITOR", aProduct.getProductName());
    }

    @Test
    public void checkProductId() {
        Product aProduct = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the id of the product", "1", aProduct.getId());
    }

    @Test
    public void checkProductPrice() {
        // I am making this test to fail
        Product aProduct = new Product("1", "DELL MONITOR", 180);
        Assert.assertEquals(180.0, aProduct.getPrice(), 0.00102);
    }
    //assertEquals("Check the price of the product", "0", aProduct.getPrice());
    //assertEquals() uses equals() method to validate if the two objects are equal whereas assertSame() uses the operator == to validate if two object are equal.
    //Assert.assertEquals uses two validate doubles are equal, but if expected value is infinity then the delta valueis ignored.
}
