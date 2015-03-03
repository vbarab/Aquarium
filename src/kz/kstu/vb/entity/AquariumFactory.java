package kz.kstu.vb.entity;

import java.util.List;

public class AquariumFactory {

    public Aquarium createAquariumWithThreeItems() {
        AquariumItemFactory aquariumItemFactory = new AquariumItemFactory();
        Aquarium aquarium;
        List<AquariumItem> items = aquariumItemFactory.createItems(
                AquariumItem.itemType.FISH,
                AquariumItem.itemType.AMPHIBIA,
                AquariumItem.itemType.SNAKE
        );
         aquarium = new Aquarium(items);
        return aquarium;
    }

    public Aquarium createAquariumWith2Items() {
        AquariumItemFactory aquariumItemFactory = new AquariumItemFactory();
        Aquarium aquarium;
        List<AquariumItem> items = aquariumItemFactory.createItems(
                AquariumItem.itemType.FISH,
                AquariumItem.itemType.AMPHIBIA,
                AquariumItem.itemType.SNAKE
        );
        aquarium = new Aquarium(items);
        return aquarium;
    }
}
