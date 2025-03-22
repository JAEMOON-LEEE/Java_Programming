package Chapter_2;

/**
 * 상수 PI를 선언하고 원의 면적을 구하는 프로그램을 작성하라
 * <실행결과>
 *     원의 면적 = 314.0
 * </실행결과>
 */

public class example2_2 {
    public static void main(String[] args) {
        final double PI = 3.14;
        double r = 10.0;
        double result = PI * r * r;
        System.out.println("원의면적 :" + result);

    }
}
