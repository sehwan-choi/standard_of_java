package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.Comparator;
import java.util.List;

public class StreamTest12 {

    public static void main(String[] args) {
        List<Student> init = InitTest.init();
        init.stream().sorted(
                Comparator.comparing((Student x) -> x.getScore()).reversed()
                        .thenComparing(k -> k.getHak())
                        .thenComparing(y -> y.getBan())
                        .thenComparing(z -> z.getName()
                        )
        ).forEach(a -> System.out.println("a = " + a));
    }
}
