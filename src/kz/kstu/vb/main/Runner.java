package kz.kstu.vb.main;

import kz.kstu.vb.entity.*;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();
        AquariumItemFactory aquariumItemFactory = new AquariumItemFactory();

        Snake snake = aquariumItemFactory.createSnake();
        Fish fish = aquariumItemFactory.createFish();
        Stuff stuff = aquariumItemFactory.createStuff();

        aquarium.add(fish);
        aquarium.add(stuff);
        aquarium.add(snake);
        aquarium.remove(fish);

        List<AquariumItem> aquariumItems = aquarium.getAquariumItems();//достали Айтемов из аквариума
        System.out.println(aquariumItems);
        System.out.println(aquarium.totalPrice());
    }
}
