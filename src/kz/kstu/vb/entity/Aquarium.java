package kz.kstu.vb.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<AquariumItem> aquariumItems = new ArrayList<>();
    private AquariumItemFactory aquariumItemFactory = new AquariumItemFactory();
   AquariumItemFactory aquariumItemFactory1 = new AquariumItemFactory();
    public Aquarium(List<AquariumItem> aquariumItems) {
        this.aquariumItems = aquariumItems;
    }

    public Aquarium() {
    }
    public List<AquariumItem> getAquariumItems() {
        return aquariumItems;
    }
    public void setAquariumItems(List<AquariumItem> aquariumItems) {
        this.aquariumItems = aquariumItems;
    }
    public void deleteLastAddedItemFromAquarium() {
        int lastItem = aquariumItems.size()- 1;
        aquariumItems.remove(lastItem);
    }

    public void add(AquariumItem aq){
        aquariumItems.add(aq);

}
     public void remove(AquariumItem aq){
         aquariumItems.remove(aq);
    }


    public BigDecimal totalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;

        AquariumFactory aquariumFactory = new AquariumFactory();

        for (AquariumItem aqua : aquariumItems) {
           BigDecimal price = aqua.getPrice();
           int quantity = aqua.getQuantity();
           BigDecimal itemPrice = price.multiply(BigDecimal.valueOf(quantity));
           totalPrice = totalPrice.add(itemPrice);
        }
        return totalPrice;
    }
}
