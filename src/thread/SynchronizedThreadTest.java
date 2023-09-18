package thread;

public class SynchronizedThreadTest {

    public static void main(String[] args) {
        MyRunnableThread2 th = new MyRunnableThread2();
        new Thread(th).start();
        new Thread(th).start();
    }

}
