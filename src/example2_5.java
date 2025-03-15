/** 초단위 정수를 입력 받고, 몇시간 몇 분, 몇 초인지 출력하는 프로그램을 작성하라.
 * <실행결과>
 *     정수를 입력하세요 : 5000
 *     5000초는 1시간, 23분, 20초입니다.
 * </실행결과>
 */

import java.util.Scanner;
public class example2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int number = scanner.nextInt();
        int min = (number % 3600) / 60; // int min = (number / 60) % 60; 으로도 가능
        int sec = number % 60;
        int hour = number / 3600; // int hour = (number / 60) / 60; 으로도 가능
        System.out.println(number+"초는"+hour+"시간, "+min+"분, "+sec+"초입니다.");
        scanner.close();
    }
}
