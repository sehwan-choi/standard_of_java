package test.stream_test2;

import java.util.List;

public class StreamBeforeAfterTest {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : list) {
            if( i % 2 ==0 ){
                System.out.println(i + " ");
            }
        }
        System.out.println();

        list.forEach(x -> System.out.print(x + " "));

        System.out.println();
        list.stream()
                .filter(f -> f%2 == 0)
                .forEach(x -> System.out.println(x + " "));
    }
}
