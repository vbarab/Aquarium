package kz.kstu.vb.entity;

import java.math.BigDecimal;

public class Snake extends Amphibia {

    private String gender;
    private String species;

    public Snake(String name, BigDecimal price, int quantity, String gender, String species) {
        super(name, price, quantity);
        this.gender = gender;
        this.species = species;
    }

    public Snake() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
