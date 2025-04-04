/**
 * 숫자를입력받아 출력하는 프로그램을 작성하라
 * 따뜻한 봄: 3~5 /  바다가 즐거운 여름: 6~8 / 낙엽이 지는 아름다운 가을: 9~11 / 눈내리는 하얀 겨울: 12,1,2
 * 그 외 숫자는 입력한 경우 1~12만 입력하세요. 를 출력하는 프로그램을 작성하라.
 * Switch문으로 작성
 * <실행결과>
 *    월을 입력하세요(1~2)>>12
 *    눈 내리는 하얀 겨울
 * </실행결과>
 */

package Chapter_2;

import java.util.Scanner;

public class Quiz_7_2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("월을 입력하세요(1~12)>>");
        int num = scan.nextInt();
        switch (num) {
            case 3:
            case 4:
            case 5:
                System.out.println("따뜻한 봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("바다가 즐거운 여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("낙엽이 지는 아름다운 가을");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("눈 내리는 하얀 겨울");
                break;
            default:
                System.out.println("1~12만 입력하세요.");
        }
    }}
