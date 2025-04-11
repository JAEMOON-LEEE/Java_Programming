/**
 * 5개의 정수를 입력받고 그 중 양수들만 합하여 출력하는 프로그램을 작성하라
 * 입력된 수가 0이나 음수면 continue문을 이요하여 합하지 않고 다음 반복으로 넘어간다.
 * <실행결과>
 *     정수를 5개 입력하세요.
 *     5
 *     -2
 *     6
 *     10
 *     -4
 *     양수의 합은 21
 * </실행결과>
 */

package Cahpter_3;
import java.util.Scanner;
public class example3_5 {
    public static void main(String[] args) {
        System.out.println("정수를 5개 입력하세요.");
        int result = 0;
        Scanner scan = new Scanner(System.in);
        for (int count = 1; count < 6; count++) {
            int num = scan.nextInt();
            if (num < 1) {
                continue;
            } else {
                result += num;
            }

        }            System.out.println("양수의 합은" + result);


    }
}