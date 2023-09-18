package generics.box;

public class Juicer {

    public void makeJuicer(FruitBox<? extends Fruit> fruit) {

        for (Fruit f:fruit.getList()) {
            System.out.println(f.print() + " Juice!");
        }
    }
}
