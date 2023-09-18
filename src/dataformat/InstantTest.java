package dataformat;

import java.time.Instant;

public class InstantTest {

    public static void main(String[] args) {
        Instant now = Instant.now();
        long epochSecond = now.getEpochSecond();
        int nano = now.getNano();
        long epochMilli = now.toEpochMilli();

        System.out.println("Instant.now() = " + now);
        System.out.println("epochSecond = " + epochSecond);
        System.out.println("nano = " + nano);
        System.out.println("epochMilli = " + epochMilli);
    }
}
