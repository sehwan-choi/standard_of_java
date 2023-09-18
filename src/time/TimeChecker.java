package time;

public class TimeChecker {

    private Long startTime;

    private Long endTime;

    public void start() {
        this.reset();
        startTime = System.currentTimeMillis();
    }

    public void end() {
        if (startTime == null) {
            return;
        }
        endTime = System.currentTimeMillis();
        print();
        reset();
    }

    private void print() {
        if (startTime == null || endTime == null) {
            return ;
        }
        System.out.println(this.endTime - this.startTime + "ms");
    }

    public void reset() {
        startTime = null;
        endTime = null;
    }
}
