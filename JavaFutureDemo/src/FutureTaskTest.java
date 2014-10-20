import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskTest {

    public static void main(String[] args) {
        Preloader preloader = new Preloader();
        preloader.start();
        List<String> datas = null;
        datas = preloader.getDatas();

        for (String str : datas) {
            System.out.println(str);
        }
    }

}

class Preloader {
    private final Callable<List<String>> callable = new Callable<List<String>>() {
        @Override
        public List<String> call() throws Exception {
            return downloadData();
        }
    };

    private Thread thread;
    private FutureTask<List<String>> future;

    private List<String> downloadData() {
        List<String> list = new ArrayList<String>();
        // 模拟下载数据
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            list.add("data" + i);
        }
        return list;
    }

    private void init() {
        future = new FutureTask<List<String>>(callable);
        thread = new Thread(future);
    }

    public Preloader() {
        init();
    }

    public void start() {
        thread.start();
    }

    public List<String> getDatas() {
        try {
            return future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

}
