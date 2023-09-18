package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMiddleCalcTest {

    public static void main(String[] args) throws IOException {
        IntStream.range(0,50).skip(10).forEach(x -> System.out.print(x + " "));
        System.out.println();

        IntStream.range(0,50).skip(20).limit(10).forEach(x -> System.out.print(x + " "));
        System.out.println();

        IntStream.of(0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5).distinct().forEach(x -> System.out.print(x + " "));
        System.out.println();

        IntStream.of(0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5).filter(x -> x%2 ==0).forEach(x -> System.out.print(x + " "));
        System.out.println();

        List<String> strings = List.of("DDD", "CCCC", "AAA", "QQQ");
        strings.stream().sorted().forEach(x -> System.out.print(x + " "));
        System.out.println();

        List<Integer> integers = List.of(5, 2, 3, 7, 1, 6, 9, 5, 19);
        integers.stream().sorted().forEach(x -> System.out.print(x + " "));
        System.out.println();
        integers.stream().sorted(Collections.reverseOrder()).forEach(x -> System.out.print(x + " "));
        System.out.println();

        Stream<Path> list = Files.list(Paths.get("C:\\Users\\최세환-폐쇄망\\Documents\\study\\db-2\\강의자료\\db2-2023-03-04"));
        list.map(Path::getFileName)
                .peek(x -> System.out.println("x = " + x))
                .collect(Collectors.toList());
    }
}
