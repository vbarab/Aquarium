package kz.kstu.vb.entity;

import java.math.BigDecimal;

public class Fish extends Amphibia {

    private String species;

    public Fish(String name, BigDecimal price, int quantity, String species) {
        super(name, price, quantity);
        this.species = species;
    }

    public Fish() {
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
