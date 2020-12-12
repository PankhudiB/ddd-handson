import entities.Cart;
import entities.Item;

import java.util.List;

public class Main {

    public static final String I_PAD_PRO = "IPad Pro";

    public static void main(String[] args) {
        Cart cart = new Cart();
        Item ipadPro = new Item(I_PAD_PRO);
        cart.add(ipadPro);
    }
}
