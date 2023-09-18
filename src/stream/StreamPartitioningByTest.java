package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPartitioningByTest {

    public static void main(String[] args) {
        List<Student> list = init();
        Map<Boolean, List<Student>> collect = list.stream().collect(Collectors.partitioningBy(p -> p.isMale()));
        System.out.println("남 / 여 분류");
        collect.get(true).forEach(i -> System.out.println("i = " + i));
        System.out.println();
        collect.get(false).forEach(i -> System.out.println("i = " + i));
        System.out.println("--------------");

        System.out.println("남 / 여 인원 카운트");
        Map<Boolean, Long> collect1 = list.stream().collect(Collectors.partitioningBy(p -> p.isMale(), Collectors.counting()));
        System.out.println("collect1.get(true) = " + collect1.get(true));
        System.out.println("collect1.get(false) = " + collect1.get(false));
        System.out.println("---------------");

        System.out.println("남 / 여 최고점수");
        Map<Boolean, Optional<Student>> collect2 = list.stream().collect(Collectors.partitioningBy(p -> p.isMale(), Collectors.maxBy(Comparator.comparing(Student::getScore))));
        System.out.println("collect2.get(true) = " + collect2.get(true));
        System.out.println("collect2.get(false) = " + collect2.get(false));
        System.out.println();


        System.out.println("남 / 여 최고점수 (collectingAndThen 사용)");
        Map<Boolean, Student> collect3 = list.stream().collect(Collectors.partitioningBy(p -> p.isMale(), Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getScore)), Optional::get)));
        System.out.println("collect2.get(true) = " + collect3.get(true));
        System.out.println("collect2.get(false) = " + collect3.get(false));
        System.out.println();

        System.out.println("남 / 여 점수 150점 미만인 학생");
        Map<Boolean, Map<Boolean, List<Student>>> collect4 = list.stream().collect(Collectors.partitioningBy(p -> p.isMale(), Collectors.partitioningBy(p -> p.getScore() < 150)));
        System.out.println("남자이면서 150점 이만인 경우");
        collect4.get(true).get(true).stream().forEach(i -> System.out.println("i = " + i));
        System.out.println();
        System.out.println("남자이면서 150점 이상인 경우");
        collect4.get(true).get(false).stream().forEach(i -> System.out.println("i = " + i));
        System.out.println();
        System.out.println("여자이면서 150점 이만인 경우");
        collect4.get(false).get(true).stream().forEach(i -> System.out.println("i = " + i));
        System.out.println();
        System.out.println("여자이면서 150점 이상인 경우");
        collect4.get(false).get(false).stream().forEach(i -> System.out.println("i = " + i));
        System.out.println();
    }

    public static List<Student> init() {
        return List.of(
                new Student("정상진", true, 1, 1, 300),
                new Student("김태호", false, 1, 1, 250),
                new Student("김선도", true, 1, 1, 200),
                new Student("구창현", true, 1, 2, 150),
                new Student("김현호", false, 1, 2, 100),
                new Student("황인규", false, 1, 3,50),
                new Student("강석현", true, 1, 3, 100),
                new Student("최세환", false, 1, 4,150),
                new Student("편도훈", false, 1, 4,200),
                new Student("멘티스", true, 1, 4,250),

                new Student("정상진", true, 2, 1, 300),
                new Student("김태호", false, 2, 1, 250),
                new Student("김선도", true, 2, 1, 200),
                new Student("구창현", true, 2, 2, 150),
                new Student("김현호", false, 2, 2, 100),
                new Student("황인규", true, 2, 3,50),
                new Student("강석현", true, 2, 3, 100),
                new Student("최세환", false, 2, 4,150),
                new Student("편도훈", false, 2, 4,200),
                new Student("멘티스", true, 2, 4,250)
        );
    }
}
