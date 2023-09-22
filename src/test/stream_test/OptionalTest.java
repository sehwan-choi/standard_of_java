package test.stream_test;

import stream.Student;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        Student student = new Student("choi", true, 1,2,150);
        Optional<Student> optionalStudent = Optional.of(student);
        Student kim = optionalStudent.orElse(new Student("kim", true, 1, 2, 150));
        Student kim1 = (Student) Optional.empty().orElseGet(() -> new Student("kim", true, 1, 2, 150));
        System.out.println("kim = " + kim);
        System.out.println("kim1 = " + kim1);

        int i = optStrToInt(Optional.of("abc"));
        System.out.println("i = " + i);
    }

    static int optStrToInt(Optional<String> optStr) {
        try{
            return optStr.map(Integer::parseInt).get();
        }catch (Exception e) {
            return 10;
        }
    }
}
