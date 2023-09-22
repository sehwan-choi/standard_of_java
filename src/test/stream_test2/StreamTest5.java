package test.stream_test2;

import java.util.List;
import java.util.stream.Stream;

public class StreamTest5 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10);

        Stream<Integer> stream = list.stream(); //  Integer형 스트림 생성
        Stream<Integer> filterStream = stream.filter(f -> f % 2 == 0);  // list에서 짝수만 걸러낸다(중간연산)
        Stream<Integer> distinctStream = filterStream.distinct();       // 중복을 걸러낸다(중간연산)
        Stream<Integer> sortedStream = distinctStream.sorted();         // 정렬한다(중간연산)
        Stream<Integer> limitStream = sortedStream.limit(5);//  스트림의 개수를 자른다(중간연산)
        long count = limitStream.count();//  요소 개수 세기(최종 연산)
        System.out.println("count = " + count);
    }
}
