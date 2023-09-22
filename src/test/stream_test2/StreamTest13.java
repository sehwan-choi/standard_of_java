package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest13 {

    public static void main(String[] args) {
        List<Student> list = InitTest.init();
        List<Info> infoList = list.stream()
                .sorted(Comparator.comparing(Student::getScore).reversed()
                        .thenComparing(Student::getName))
                .limit(10)
                .map(m -> new Info(m.getName(), m.getScore()))
                .collect(Collectors.toList());
        infoList.forEach(x -> System.out.println("x = " + x));
    }

    public static class Info {
        String name;

        int score;

        public Info(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Info{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }
}
