package projectpoo;



public class ProductNotification {
    private Product product;
    private int minimumQuantity;

    public ProductNotification(Product product, int minimumQuantity) {
        this.product = product;
        this.minimumQuantity = minimumQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    public boolean shouldNotify(int currentQuantity) {
        return currentQuantity <= minimumQuantity;
    }
}
