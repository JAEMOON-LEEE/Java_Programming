/**
 * 출석 점수 총 100점 때, 지각하면 3점 감점, 결석하면 8점을 감점시킨다.
 * 다음 실행 사례와 같이 이름, 지극횟수, 결석횟수 순으로 입력할 때
 * 두 학생 중 누구의 출석 점수가 높은지 판단하는 프로그램을 작성하라.
 * 점수가 같은 경우 "점수 동일"이라고 출력 하라.
 *
 * <실행결과>
 *     학생1>>김유진 4 3
 *     학생2>>김경미 2 4
 *     김유진의 감점은 36, 김경미의 감점은 38
 *     김유진의 출석 점수가 더 높음. 김유진 출석 점수는 64
 * </실행결과>
 */
package Chapter_2;
import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("학생1>>");
       String name1 = scan.next(); //이름 받기
       int late = scan.nextInt(); //지각 횟수
       int count = scan.nextInt(); // 결석 횟수
        int total1 = 100;
        int LateScore = late * 3;
        int CountScore = count * 8;
        int sum = LateScore + CountScore;
        int DelScore = total1 - sum;



        System.out.print("학생2>>");
        String name2 = scan.next(); //이름 받기
        int late2 = scan.nextInt(); //지각 횟수
        int count2 = scan.nextInt(); // 결석 횟수
        int total2 = 100;
        int LateScore2 = late2 * 3;
        int CountScore2 = count2 * 8;
        int sum2 = LateScore2 + CountScore2;
        int DelScore2 = total2 - sum2;


        System.out.println(name1+"의 감점은"+sum+", "+name2+"의 감점은"+sum2);

        if(DelScore >= DelScore2){
            System.out.println(name1+"의 출석점수가 더 높음. "+name1+"출석점수는"+DelScore);
        }
        else if (DelScore <= DelScore2) {
            System.out.println(name2+"의 출석점수가 더 높음. "+name2+"출석점수는"+DelScore2);
        }
        else{
            System.out.println("점수 동일");
        }


    }
}
