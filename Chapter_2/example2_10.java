/**
 * 시험점수가 80점 이상이라면 합격 판별하는 프로그램을 작성하라
 * <실행결과>
 *     점수를 입력하시오: 95
 *     축하합니다! 합격입니다.
 * </실행결과>
 */
import java.util.Scanner;
public class example2_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력하시오 : ");
        int score = scan.nextInt();
        if(score >=80){
            System.out.println("축하합니다! 합격입니다.");
        }
    }
}
