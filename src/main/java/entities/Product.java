package entities;

public class Product {
    String Name;

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + Name + '\'' +
                '}';
    }

    public Product(String name) {
        Name = name;
    }
}
