package Chapter_2; /**
 * 다중  If-else문을 이용하여 입력받은 성적에 대해 학점을 부여하는 프로그램을 작성하라.
 * <점수>
 * A+ : 95~100
 * A : 90~94
 * B+ : 85~89
 * B : 80~84
 * F : 0~79
 * <실행결과>
 *     점수를 입력하세요(0~100) : 89
 *     학점은 B입니다
 * </실행결과>
 */

import java.util.Scanner;
public class example2_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력하세요(0~100) :");
        int score = scan.nextInt();
        String result;
        if((95<=score)&&(score<=100)){
            result = ("A+");
        }
        else if((90<=score)&&(score<=94)){
            result = ("A");
        }
        else if((85<=score)&&(score<=89)){
            result = ("B+");
        }
        else if((80<=score)&&(score<=84)){
            result = ("B");
        }
        else{
            result = ("F");
        }
        System.out.println("학점은"+result+"입니다.");

    }
}
