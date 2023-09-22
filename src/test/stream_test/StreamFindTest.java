package test.stream_test;

import stream.Student;

import java.util.List;

public class StreamFindTest {

    public static void main(String[] args) {
        List<Student> init = InitTest.init();

        Student student = init.stream().filter(f -> f.getScore() == 300).findAny().get();
        System.out.println("student = " + student);

        Student student1 = init.stream().filter(f -> f.getScore() == 250).findFirst().get();
        System.out.println("student1 = " + student1);
    }
}
