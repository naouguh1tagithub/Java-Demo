//jvm basic args:-Xmx20M -Xms20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
public class Main {
    public static void main(String[] args) throws Exception {
        byte[] alloc1, alloc2, alloc3, alloc4;
        alloc1 = new byte[2 * 1024 * 1024];
        Thread.sleep(2000);
        alloc2 = new byte[2 * 1024 * 1024];
        Thread.sleep(2000);
        alloc3 = new byte[2 * 1024 * 1024];
        Thread.sleep(2000);
        alloc4 = new byte[2 * 1024 * 1024];
        Thread.sleep(2000);
    }
}
