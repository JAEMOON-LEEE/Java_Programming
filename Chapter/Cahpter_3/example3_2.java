/**
 * -1이 입력될 때까지 입력된 수의 평균 구하기
 * while문을 이용하여 정수를 여러 개 입력 받고 평균을 출력하라. -1이 입력되면 입력을 종료한다.
 * <실행결과>
 *     정수를 입력하고 마지막에 -1을 입력하세요.
 *     10 30 -20 40 -1
 *     정수의 개수는 4개이며  평균은 15.0입니다.
 * </실행결과>
 */


package Cahpter_3;
import java.util.Scanner;
public class example3_2 {
    public static void main(String[] args) {
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int num = scanner.nextInt();

        while(num != -1){
            sum += num;
            count++;
            num = scanner.nextInt();

        }
        int average = sum/count;
        System.out.println("정수의 개수는"+count+"개이며 평균은"+(double)average+"입니다");

    }
}
