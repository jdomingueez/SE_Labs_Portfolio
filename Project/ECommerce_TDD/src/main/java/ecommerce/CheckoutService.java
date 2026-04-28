package ecommerce;

public class CheckoutService {

    private PaymentService paymentService;

    public CheckoutService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public boolean checkout(ShoppingCart cart) {
        if (cart.isEmpty()) {
            return false;
        }

        boolean paymentOk = paymentService.processPayment(cart.getTotal());

        if (paymentOk) {
            cart.clear();
            return true;
        }

        return false;
    }
}