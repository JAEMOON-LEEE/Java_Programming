package Chapter_2; /**
 * 점수와 학년을 입력 받아 60점 이상이면 합격, 미만이면 불합격을 출력한다. 4학년의 경우 70점 이상이어야 합격이다.
 *
 * <실행결과>
 *     점수를 입력하세요(0~100): 65
 *     학년을 입력하세요(1~4) : 4
 *     불합격!
 * </실행결과>
 */
//<내가 푼거>
// import java.util.Scanner;
//  ublic class example2_13 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("점수를 입력하세요(0~100) : ");
//        int score = scan.nextInt();
//        System.out.print("학년을 입력하세요 : ");
//        int grade = scan.nextInt();
//
//        if((70 <= score) && (grade > 3)){ //70점 이상 3학년 초과면 합격
//            System.out.println("합격");
//        }
//        else if((70 >= score) && (grade > 3)){ // 70점 이하 3학년 초과면 불합격
//            System.out.println("불합격");
//        }
//        else if((60 <= score) && (grade < 4)){ //60점 이상 4학년 미만이면 합격
//            System.out.println("합격");
//        }
//        else{
//            System.out.println("불합격"); // 60점 미만 4학년 미만이면 불합격
//        }
//
//
//    }
//}
import java.util.Scanner;
public class example2_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("점수를 입력하세요 :");
        int score = scan.nextInt();

        System.out.print("학년을 입력하세요 :");
        int year = scan.nextInt();

        if (score >= 60) { // 60점 이상
            if (year != 4) // 4학년 아니면 합격
                System.out.println("합격");
            else if (score >= 70)
                System.out.println("합격"); //4학년이 70점 이상이면 합격
            else {
                System.out.println("불합격!"); // 4학년이 70점 미만이면 불합격
            }
        } else { // 60점 미만 불합격
            System.out.println("불합격");

        }

    }
}