import java.math.BigDecimal;

public class FloatEx1 {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;
        BigDecimal b = new BigDecimal(9.1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890);

        System.out.printf("        123456789012345678901234%n");
        System.out.printf("f: %f%n", f);  // 소수점 이하 6째자리까지 출력.
        System.out.printf("f: %24.20f%n", f);
        System.out.printf("f2: %24.20f%n", f2);
        System.out.printf("d: %24.20f%n%n", d);
        System.out.println("bf: "+ b);  //  BigDecimal
        System.out.println("bf: "+ b);
        System.out.println("bf2: "+ b);
        System.out.println("bd: "+ b);
    }
}
