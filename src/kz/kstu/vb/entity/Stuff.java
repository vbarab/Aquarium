package kz.kstu.vb.entity;

import java.math.BigDecimal;

public class Stuff extends AquariumItem {
    private String country;

    public Stuff(String name, BigDecimal price, int quantity, String country) {
        super(name, price, quantity);
        this.country = country;
    }

    public Stuff() {
    }

    public String getCountry() {

        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
