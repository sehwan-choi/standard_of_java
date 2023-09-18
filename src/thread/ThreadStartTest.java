package thread;

public class ThreadStartTest {

    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.setName("myThread");
        myThread.start();

        Runnable runnableThread = new MyRunnableThread();
        Thread thread = new Thread(runnableThread);
        thread.setName("runnableThread");
        thread.start();
    }
}
