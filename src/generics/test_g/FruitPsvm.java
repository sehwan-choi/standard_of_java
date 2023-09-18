package generics.test_g;

public class FruitPsvm {

    public static void main(String[] args) {
        FruitBox<Fruit> fruitFruitBox = new FruitBox<>();
        fruitFruitBox.add(new Apple());
        fruitFruitBox.add(new Banana());
        fruitFruitBox.add(new Tomato());
//        fruitFruitBox.add(new NoFruit());   //  Fruit을 상속받지 않았기 때문에 add할 수 없다.
    }
}
