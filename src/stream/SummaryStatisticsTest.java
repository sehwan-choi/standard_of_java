package stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class SummaryStatisticsTest {

    public static void main(String[] args) {
        List<Integer> integers = List.of(10, 50, 40, 30, 20, 60, 50);
        IntSummaryStatistics st = integers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("st.getAverage() = " + st.getAverage());
        System.out.println("st.getCount() = " + st.getCount());
        System.out.println("st.getMax() = " + st.getMax());
        System.out.println("st.getMin() = " + st.getMin());
        System.out.println("st.getSum() = " + st.getSum());
    }
}
