import entities.Cart;
import entities.Item;
import entities.Product;
import entities.Quantity;

public class Main {

    public static final String I_PAD_PRO = "IPad Pro";

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product ipadPro = new Product(I_PAD_PRO);
        Item ipadProItem = new Item(ipadPro, new Quantity(1));
        cart.add(ipadProItem);

        Product bat = new Product("GM Cricket bat");
        Item batItem = new Item(bat, new Quantity(2));
        cart.add(batItem);
        System.out.println("cart :" + cart);

        cart.remove(batItem);
        System.out.println("cart :" + cart);
        System.out.println("Deleted Items :" + cart.removedItems());
    }
}
