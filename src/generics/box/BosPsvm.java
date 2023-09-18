package generics.box;

import java.util.ArrayList;
import java.util.List;

public class BosPsvm {

    public static void main(String[] args) {

        FruitBox<Fruit> fruitFruitBox = new FruitBox<>();
        fruitFruitBox.add(new Apple());
        fruitFruitBox.add(new Banana());
        fruitFruitBox.add(new Grape());

        Juicer juicer = new Juicer();
        juicer.makeJuicer(fruitFruitBox);

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        Box.print(fruitFruitBox);
    }
}
