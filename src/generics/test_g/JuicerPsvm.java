package generics.test_g;

public class JuicerPsvm {

    public static void main(String[] args) {

        FruitBox<Fruit> fruitFruitBox = new FruitBox<>();
        Juicer.print(fruitFruitBox);


        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        Juicer.print(appleFruitBox);
    }
}
