package kz.kstu.vb.entity;

import java.math.BigDecimal;

public abstract class AquariumItem {
    private String name;
    private BigDecimal price;
    private int quantity;

    protected AquariumItem(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public AquariumItem() {
    }

    @Override
    public String toString() {
        return "AquariumItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public enum itemType {
        FISH, SNAKE, STUFF, AMPHIBIA
    }
}
