package test.stream_test;

import stream.Student;

import java.util.List;

public class InitTest {


    public static List<Student> init() {
        return List.of(
                new Student("알렉스", true, 1, 1, 300),
                new Student("산체스", false, 1, 1, 250),
                new Student("김말똥", true, 1, 1, 200),
                new Student("개붕이", true, 1, 2, 150),
                new Student("턱시도", false, 1, 2, 100),
                new Student("붕어빵", false, 1, 3,50),
                new Student("최시바", true, 1, 3, 100),
                new Student("말티즈", false, 1, 4,150),
                new Student("바보", false, 1, 4,200),
                new Student("멍청이", true, 1, 4,250),

                new Student("김물병", true, 2, 1, 300),
                new Student("박마카", false, 2, 1, 250),
                new Student("이선풍", true, 2, 1, 200),
                new Student("나선환", true, 2, 2, 150),
                new Student("김에러", false, 2, 2, 100),
                new Student("나칫솔", true, 2, 3,50),
                new Student("최우산", true, 2, 3, 100),
                new Student("박커피", false, 2, 4,150),
                new Student("박박박", false, 2, 4,200),
                new Student("밍밍밍", true, 2, 4,250)
        );
    }
}
