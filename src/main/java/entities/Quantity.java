package entities;

public class Quantity {
    private final int value;

    public Quantity(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quantity : " + value;
    }
}
