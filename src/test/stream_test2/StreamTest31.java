package test.stream_test2;

import stream.Student;
import test.stream_test.InitTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest31 {

    public static void main(String[] args) {
        List<Student> list = InitTest.init();
        list.forEach(x -> System.out.println(x));
        System.out.println();

        // 기본 (listMap 과 listMap2는 동일하다)
        Map<Integer, List<Student>> listMap = list.stream()
                .collect(Collectors.groupingBy(Student::getBan, Collectors.toList()));

        Map<Integer, List<Student>> listMap2 = list.stream()
                .collect(Collectors.groupingBy(Student::getBan));

        Map<Integer, Set<Student>> setMap = list.stream()
                .collect(Collectors.groupingBy(Student::getBan, Collectors.toSet()));

        Map<Integer, ArrayList<Student>> arrayListMap = list.stream()
                .collect(Collectors.groupingBy(Student::getBan, Collectors.toCollection(ArrayList::new)));

        Map<Integer, Map<Integer, Student>> mapMap = list.stream()
                .collect(Collectors.groupingBy(Student::getBan, Collectors.toMap(Student::getBan, x -> x)));
    }
}
