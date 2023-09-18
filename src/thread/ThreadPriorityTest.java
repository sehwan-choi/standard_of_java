package thread;

public class ThreadPriorityTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setPriority(Thread.MIN_PRIORITY);
        myThread.setName("Priority 1 - ");
        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.setPriority(Thread.MAX_PRIORITY);
        myThread2.setName("Priority 10 -  ");
        myThread2.start();

        try {
            myThread.join(1);
            myThread2.join(1);
        } catch (InterruptedException e) {}

        System.out.println("--------- close -------------");
    }
}
