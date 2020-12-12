package entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items;
    List<Item> removedItems;

    public List<Item> removedItems() {
        return removedItems;
    }

    public List<Item> getItems() {
        return items;
    }

    public Cart() {
        this.items = new ArrayList<>();
        this.removedItems = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
        removedItems.add(item);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}
