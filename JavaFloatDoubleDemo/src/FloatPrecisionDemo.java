import java.math.BigDecimal;

public class FloatPrecisionDemo {
    public static void main(String[] args) {

        System.out.println(1.012f - 0.412f);
        BigDecimal a = new BigDecimal(1.012f);
        BigDecimal b = new BigDecimal(0.412f);
        a.subtract(b);
        // 0.6000000000000001
        System.out.println(12345 + 54321);
        char test = 'A';
        System.out.println(test);
    }
}
