package test.stream_test2;

import java.util.List;

public class StreamTest18 {
    public static void main(String[] args) {
        List<Integer> allMatch = List.of(2, 4, 6, 8);
        boolean isAllMatch = allMatch.stream().allMatch(f -> f % 2 == 0);
        System.out.println("isAllMatch = " + isAllMatch);

        boolean isAllMatchFail = allMatch.stream().allMatch(f -> f > 3);
        System.out.println("isAllMatchFail = " + isAllMatchFail);

        List<Integer> anyMatch = List.of(1, 2, 3, 4, 5);
        boolean isAnyMatch = anyMatch.stream().anyMatch(f -> f % 2 == 0);
        System.out.println("isAnyMatch = " + isAnyMatch);

        boolean isAnyMatchFail = anyMatch.stream().anyMatch(f -> f > 5);
        System.out.println("isAnyMatchFail = " + isAnyMatchFail);

        List<Integer> noneMatch = List.of(1, 2, 3, 4, 5);
        boolean isNoneMatch = noneMatch.stream().noneMatch(f -> f > 5);
        System.out.println("isNoneMatch = " + isNoneMatch);

        boolean isNoneMatchFail = noneMatch.stream().noneMatch(f -> f > 4);
        System.out.println("isNoneMatchFail = " + isNoneMatchFail);
    }
}
