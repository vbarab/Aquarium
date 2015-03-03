package kz.kstu.vb.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AquariumItemFactory {

    public AquariumItemFactory() {
    }

    public Amphibia createAmphibia() {
        Amphibia amphibia = new Amphibia();
        amphibia.setName("Лягуха");
        amphibia.setQuantity(1);
        amphibia.setPrice(BigDecimal.valueOf(500));
        return amphibia;
    }

    public Fish createFish() {
        Fish fish = new Fish();
        fish.setSpecies("Silver Fish");
        fish.setName("Silver-Fish");
        fish.setPrice(BigDecimal.valueOf(100));
        fish.setQuantity(1);
        return fish;
    }

    public Snake createSnake() {
        Snake snake = new Snake();
        snake.setGender("Male");
        snake.setSpecies("Cobra");
        snake.setName("Cobra");
        snake.setPrice(BigDecimal.valueOf(30000));
        snake.setQuantity(1);
        return snake;
    }

    public Stuff createStuff() {
        Stuff stuff = new Stuff();
        stuff.setName("Filter");
        stuff.setQuantity(1);
        stuff.setPrice(BigDecimal.valueOf(2000));
        stuff.setCountry("USA");
        return stuff;
    }

    public List<AquariumItem> createItems(AquariumItem.itemType... types) {
        List<AquariumItem> aquariumItems = new ArrayList<>();

        for (AquariumItem.itemType type : types) {
            if (type.equals(AquariumItem.itemType.SNAKE)) {
                Snake snake = createSnake();
                aquariumItems.add(snake);
            } else if (type.equals(AquariumItem.itemType.FISH)) {
                Fish fish = createFish();
                aquariumItems.add(fish);
            } else if (type.equals(AquariumItem.itemType.STUFF)) {
                Stuff stuff = createStuff();
                aquariumItems.add(stuff);
            } else {
                Amphibia amphibia = createAmphibia();
                aquariumItems.add(amphibia);
            }
        }
        return aquariumItems;
    }


}
