package entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items;

    public Cart() {
        this.items = new ArrayList<>(){};
    }

    public void add(Item item) {
        System.out.println("Adding item");
        items.add(item);
    }
}
