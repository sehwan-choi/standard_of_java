package test.stream_test;

import stream.Student;

import java.util.List;

public class InitTest {


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
