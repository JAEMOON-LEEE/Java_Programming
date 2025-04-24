/**
 * 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하라 사용가자 정수가 아닌 문자를 입력할 때 발생하는 InputMismatchException 예외를 처리하여 다시 입력받도록 하라.
 *  while문 사용, sum, inputdata 배열 사용
 * <실행결과>
 *     정수 3개를 입력하세요
 *     0>>5
 *     1>>R
 *     정수가 아닙니다. 다시입력하세요.
 *     1>>4
 *     2>>6
 * </실행결과>
 */

package Cahpter_3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class exeample3_17 {
    public static void main(String[] args) {
        System.out.println("정수 3개를 입력하세요");

        int[] inputData = new int[3];
        int i=0;
        int sum = 0;
            while (i < 3) {
                System.out.print(i + ">>");
                Scanner scan = new Scanner(System.in);
                i++;
                try {
                    sum += scan.nextInt();
                }
                catch(InputMismatchException e){
                    System.out.println("정수가 아닙니다. 다시 입력하세요!");
                    i--;
                    continue;
                }

        }



        System.out.println("합은"+sum);
    }
}
