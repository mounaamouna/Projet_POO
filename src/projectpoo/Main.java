package projectpoo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("001", "Noir", "1234", "GLYCERO", 10));
        products.add(new Product("002", "Jaune", "1234", "GLYCERO", 5));
        products.add(new Product("003", "Verte", "1234", "GLYCERO", 2));
        products.add(new Product("004", "Rouge", "1234", "GLYCERO", 7));
        products.add(new Product("005", "Orange", "1234", "GLYCERO", 3));

        ArrayList<ProductNotification> notifications = new ArrayList<>();
        notifications.add(new ProductNotification(products.get(0), 10));
        notifications.add(new ProductNotification(products.get(1), 2));
        notifications.add(new ProductNotification(products.get(2), 1));
        notifications.add(new ProductNotification(products.get(4), 1));
        
       


        for (ProductNotification notification : notifications) {
            int currentQuantity = notification.getProduct().getQuantity();
            if (notification.shouldNotify(currentQuantity)) {
                String message = "The product \"" + notification.getProduct().getName()
                        + "\" (ref: " + notification.getProduct().getRef()
                        + ") has a quantity of " + currentQuantity
                        + ", which is below the minimum threshold of " + notification.getMinimumQuantity()
                        + ". Please restock this product as soon as possible.";
                JOptionPane.showMessageDialog(null, message, "Product Notification", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
