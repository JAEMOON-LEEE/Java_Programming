/**
 * 사용자가 입력하는 8자리의 정수는 생일을 나타낸다. 예를 들어 20010316은 2001년 3월 16일을 뜻한다.
 * Scanner클래스의 nextInt()메소드를 이용하여 8자리 정수를 입력받고 년도/월/일을 나누어 출력하라.
 * 8자리 정수가 입력되지 않는 경우는 고려하지 않아도 된다.
 *
 * <실행결과>
 *     생일 입력 하세요>> 20010316
 *     2001년 3월 16일
 * </실행결과>
 */
package Chapter_2;

import java.util.Scanner;

public class Quiz_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("생일을 입력하세요>>");
        int num = scan.nextInt();

        int year = num / 10000;
        int year2 = num % 10000;
        int month = year2 / 100;
        int day = year2 %100;
        System.out.println(year+"년"+month+"월"+day+"일");
    }
}
