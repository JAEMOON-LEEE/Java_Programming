/**
 * 빨간초는 10살, 파란초는 5살, 노란초는 1살을 나타낼 때, 다음 실행 사례를 참고하여 나이에 맞는 각 초의 개수를 계산하는 프로그램을 작성하라.
 * 이 때 초의 개수가 최소가 되게하라 나이가 0이나 음수가 입력되면 "나이는 양수로만 입력하세요"를 쳘룩하고 프로그램 종료
 * <실행결과>
 *     나이를 입력하세요>>26
 *     빨간 초 2개, 파란 초 1개, 노란 초 1개. 총 4개가 필요합니다.
 * </실행결과>
 */


package Chapter_2;
import java.util.Scanner;
public class Quiz_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("나이를 입력하세요>>");
        int birthday = scan.nextInt();
        int red = birthday/10;
        int blue = (birthday%10)/5;
        int yellow = (birthday%10)%5;

        if(birthday==0){
            System.out.print("나이는 양수로만 입력하세요.");
        }
        System.out.println("빨간초 "+red+"개, 파란초 "+blue+"개" +
                ", 노란초 "+yellow+"개. 총"+(red+blue+yellow)+"개가 필요합니다.");
    }
}
