/**
 * 양의정수 10개를 입력받아 일차원 배열에 저장하라.
 * 일차원 배열에서 각 수를 분석하여 자리수의 합이 9인 것을 가려내어 출력하라.
 * <실행결과>
 *     양의  정수 10개 입력>>9 19 29 33 333 900 342 666 27 100
 *     자리수의 합이 9인 것은 9 333 900 342 27
 * </실행결과>
 */


package Cahpter_3;
import java.util.Scanner;
public class Quiz_6 {
    public static void main(String[] args) {
        int[] array = new int[10]; //배열 생성


        System.out.print("양의 정수 10개 입력>>");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <10; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("자리수의 합기 9인 것은");

        for (int i = 0; i <10; i++) {
            int number = array[i];
            int sum = 0;
            int temp = number;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;

            }
            if(sum == 9) {
                System.out.print(number+"\t");
            }


        }


    }}