package stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamSortTest {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(1, 10, "A"),
                new Student(5, 60, "B"),
                new Student(5, 30, "C"),
                new Student(1, 40, "D")
        );

        students.stream().sorted(Comparator.comparing(Student::getBan)
//                .thenComparing(Student::getTotalScore, Collections.reverseOrder())
                        .thenComparing(Student::getTotalScore, Comparator.naturalOrder())
                .thenComparing(Student::getName))
                .forEach(x -> System.out.println("x = " + x));
    }

    public static class Student {
        private int ban;
        private int totalScore;
        private String name;

        public Student(int ban, int totalScore, String name) {
            this.ban = ban;
            this.totalScore = totalScore;
            this.name = name;
        }

        public int getBan() {
            return ban;
        }

        public int getTotalScore() {
            return totalScore;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "ban=" + ban +
                    ", totalScore=" + totalScore +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
