import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newCachedThreadPool();
        System.out.println("Ready");
        Future strFuture = executor.submit(new TaskTest());
        System.out.println("Give the future");

        System.out.println("Get the future : " + strFuture.get());
        System.out.println("End");
        executor.shutdown();
    }

    public static class TaskTest implements Callable {
        @Override
        public String call() throws Exception {
            Thread.sleep(3000);
            return "Hello World!";
        }
    }
}
