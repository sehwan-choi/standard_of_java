package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PathStreamTest {

    public static void main(String[] args) throws IOException {
        Stream<Path> list = Files.list(Paths.get("C:\\Users\\최세환-폐쇄망\\Documents\\study\\db-2\\강의자료\\db2-2023-03-04"));
        list.forEach(x -> System.out.println("x = " + x));

        System.out.println();

        Stream<String> lines = Files.lines(Paths.get("C:\\Users\\최세환-폐쇄망\\Documents\\교육지대 정보.txt"));
        lines.forEach(x -> System.out.println("x = " + x));
    }
}
