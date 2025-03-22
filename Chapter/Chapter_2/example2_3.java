package Chapter_2;

/**
 * 자동타입 변환과 강제타입 변환이 들어있는 코드이다.
 */

public class example2_3 {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;
        System.out.println(b + i); // b가 int타입으로 자동 변환
        System.out.println(10 / 4);
        System.out.println(10.0 / 4); // 실수나누기 이므로 결과는 2.5
        System.out.println((char) 0x12340041);
        System.out.println((byte) (b + i)); /**
         227은 byte 범위를 벗어나므로 오버플로우가 발생합니다. 계산: 227 - 256 = -29
         byte는 -128부터 127까지의 값만 표현할 수 있습니다.
         */
        System.out.println((int) 2.9 + 1.8); // 앞부분 2.9만 데이터타입이 int로 변경되어 2로 변경됨.
        System.out.println((int) (2.9 + 1.8));
        System.out.println((int) 2.9 + (int) 1.8);
    }
}
