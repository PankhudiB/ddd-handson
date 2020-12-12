package entities;

public class Item {
    Product product;
    Quantity quantity;


    public Item(Product product, Quantity quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
