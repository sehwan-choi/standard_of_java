import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            future.complete("Finished");
            return null;
        });

        String s = future.get();
        System.out.println("s = " + s);

        CompletableFuture<String> future1 = CompletableFuture.completedFuture("Skip");
        System.out.println("future1.get() = " + future1.get());
    }
}