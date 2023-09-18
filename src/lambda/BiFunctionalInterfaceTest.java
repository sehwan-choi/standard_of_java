package lambda;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionalInterfaceTest {

    public static final BiConsumer<String, Integer> biPrint = (name, age) -> System.out.println("name : " + name + " age : " + age);
    public static final BiPredicate<Integer, Integer> biEqual = (num1, num2) -> num1.equals(num2);
//    public static final BiPredicate<Integer, Integer> biEqual = Integer::equals;

    public static final BiFunction<Integer, Integer, Integer> biMax = (i , j) -> i > j ? i : j;

    public static void main(String[] args) {
        Map<String, Integer> dateMap = Map.of("Kim", 10, "Choi", 20, "Lee", 30);
        print(biPrint, dateMap);

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        find(biEqual, integers, 5);

        max(biMax, 20, 10);
    }

    public static void max(BiFunction<Integer, Integer, Integer> biFunction, int num1,int num2) {
        Integer apply = biFunction.apply(num1, num2);
        System.out.println(num1 + " , " + num2 + " max ==> " + apply);
    }

    public static void find(BiPredicate<Integer, Integer> biPredicate, List<Integer> list, int findNum) {
        for (int i : list) {
            if (biPredicate.test(i, findNum)) {
                System.out.println("Find! ==> " + i);
            }
        }
    }

    public static void print(BiConsumer<String, Integer> biConsumer, Map<String,Integer> dataMap) {
        for (String key : dataMap.keySet()) {
            Integer integer = dataMap.get(key);
            biConsumer.accept(key, integer);
        }
    }
}
