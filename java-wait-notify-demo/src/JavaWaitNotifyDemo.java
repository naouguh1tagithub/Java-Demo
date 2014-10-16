public class JavaWaitNotifyDemo {

    public static void main(String[] args) {

        Task task1 = new Task();
        Thread test1 = new Thread(task1);
        Thread test2 = new Thread(task1);
        test1.start();
        test2.start();

        SleepTask task2 = new SleepTask();
        Thread test3 = new Thread(task2);
        Thread test4 = new Thread(task2);
        test3.start();
        test4.start();
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            synchronized (this) {
                System.out.println("wait start");
                try {
                    this.wait();
                    System.out.println("wait end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class SleepTask implements Runnable {

        @Override
        public void run() {
            try {
                synchronized (this) {
                    System.out.println("sleep start");
                    Thread.sleep(1000000);
                    System.out.println("sleep end");
                }
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }

}
