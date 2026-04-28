package ecommerce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ECommerceTest {

    @Test
    void cartStartsEmpty() {
        ShoppingCart cart = new ShoppingCart();
        assertTrue(cart.isEmpty());
    }

    @Test
    void addProductToCart() {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Laptop", 1000));

        assertFalse(cart.isEmpty());
    }

    @Test
    void calculateTotal() {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Phone", 500));
        cart.addProduct(new Product("Tablet", 300));

        assertEquals(800, cart.getTotal());
    }

    @Test
    void checkoutFailsIfCartEmpty() {
        ShoppingCart cart = new ShoppingCart();
        CheckoutService checkout = new CheckoutService(new PaymentService());

        assertFalse(checkout.checkout(cart));
    }

    @Test
    void checkoutSuccess() {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Laptop", 1000));

        CheckoutService checkout = new CheckoutService(new PaymentService());

        assertTrue(checkout.checkout(cart));
        assertTrue(cart.isEmpty());
    }

    @Test
    void checkoutFailsIfPaymentFails() {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Laptop", 1000));

        PaymentService fakePayment = new PaymentService() {
            @Override
            public boolean processPayment(double amount) {
                return false;
            }
        };

        CheckoutService checkout = new CheckoutService(fakePayment);

        assertFalse(checkout.checkout(cart));
        assertFalse(cart.isEmpty());
    }

    @Test
    void removeProductFromCart() {
        ShoppingCart cart = new ShoppingCart();
        Product p = new Product("Laptop", 1000);

        cart.addProduct(p);
        cart.removeProduct(p);

        assertTrue(cart.isEmpty());
    }

    @Test
    void totalIsZeroWhenCartIsEmpty() {
        ShoppingCart cart = new ShoppingCart();

        assertEquals(0, cart.getTotal());
    }
}