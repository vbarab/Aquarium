package kz.kstu.vb.entity;

import java.math.BigDecimal;

public class Amphibia extends AquariumItem {
    protected Amphibia(String name, BigDecimal price, int quantity) {
        super(name, price, quantity);
    }

    public Amphibia() {
    }
}
