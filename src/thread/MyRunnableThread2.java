package thread;

public class MyRunnableThread2 implements Runnable {

    private final Account account = new Account();

    @Override
    public synchronized void run() {
        while( account.getBalance() > 0 ) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            account.withdraw(money);
            System.out.println("balance : " + account.getBalance());
        }
    }
}
